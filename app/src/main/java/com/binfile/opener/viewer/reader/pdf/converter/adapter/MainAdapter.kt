package com.binfile.opener.viewer.reader.pdf.converter.adapter

import android.content.ActivityNotFoundException
import android.content.ContentValues.TAG
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.content.FileProvider
import androidx.recyclerview.widget.RecyclerView
import com.binfile.opener.viewer.reader.pdf.converter.activities.BinFileViewer
import com.binfile.opener.viewer.reader.pdf.converter.R
import com.binfile.opener.viewer.reader.pdf.converter.activities.ListFile
import com.binfile.opener.viewer.reader.pdf.converter.model.AdapterModelClass
import com.binfile.opener.viewer.reader.pdf.converter.utils.MyUtils
import com.binfile.opener.viewer.reader.pdf.converter.utils.MyUtils.Companion.deleteFromRecent
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import java.io.File
import java.util.*
import java.util.concurrent.Executor
import java.util.concurrent.Executors


class MainAdapter(
    var context: Context,
    var arrayListApp: ArrayList<AdapterModelClass>,
    var type: String
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>(), Filterable {


    var appListArraySelected: ArrayList<AdapterModelClass> = ArrayList(arrayListApp)


    class MyViewHolder2(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val file_name2: TextView = itemView.findViewById(R.id.file_text2)
        var icon2: ImageView = itemView.findViewById(R.id.icon2)
        val mdate: TextView = itemView.findViewById(R.id.app_date)
        val msize: TextView = itemView.findViewById(R.id.app_size)


        var menu: ImageView = itemView.findViewById(R.id.dropMenu)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View

            view = LayoutInflater.from(context)
                .inflate(R.layout.itemlistlayout, parent, false)
            return MyViewHolder2(view)


    }


    override fun getItemCount(): Int {
        return arrayListApp.size
    }

    override fun getItemViewType(position: Int): Int {
        if (type == "1") {
            return 1
        } else {
            return 2
        }

    }

    override fun getFilter(): Filter {
        return searchFilter
    }

    private val searchFilter = object : Filter() {
        override fun performFiltering(constraint: CharSequence): FilterResults {
            val filteredList: ArrayList<AdapterModelClass> = ArrayList()
            if (constraint == "" || constraint.isEmpty()) {
                filteredList.addAll(appListArraySelected)
            } else {
                val filterPattern =
                    constraint.toString().lowercase().trim { it <= ' ' }
                for (item in appListArraySelected) {
                    if (item.fileName.lowercase().contains(filterPattern)
                    ) {
                        filteredList.add(item)
                    }
                }
            }
            val results = FilterResults()
            results.values = filteredList
            return results
        }

        override fun publishResults(constraint: CharSequence, results: FilterResults) {
            arrayListApp.clear()
            arrayListApp.addAll(results.values as ArrayList<AdapterModelClass>)
            notifyDataSetChanged()
        }
    }


    fun share(file: File, context: Context) {
        Log.d(TAG, "share:iss $file")
        val photoURI = FileProvider.getUriForFile(
            context,
            context.applicationContext.packageName
                .toString() + ".provider", file
        )
        val intentShareFile = Intent(Intent.ACTION_SEND)
        intentShareFile.type = "*/*"
        intentShareFile.putExtra(Intent.EXTRA_STREAM, photoURI)

        intentShareFile.putExtra(
            Intent.EXTRA_SUBJECT, "Sharing File from" + context.getString(R.string.app_name)
        )
        context.startActivity(
            Intent.createChooser(
                intentShareFile,
                context.getString(R.string.app_name)
            )
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        with(arrayListApp[position]) {
            val file = File(myPath)

                with(holder as MyViewHolder2){

                    itemView.setOnClickListener {
                        val globalcontext=context as ListFile

//                        Toast.makeText(context, "type2 adapterclass", Toast.LENGTH_SHORT).show()
                        MyUtils.updateToShPr(context, file.absolutePath,mboolean)
                        if (file.absolutePath.contains(context.packageName) && (!file.absolutePath.contains("cache"))){
                            val path = Uri.parse(file.path)
                            try {
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                                    val uri = FileProvider.getUriForFile(
                                        context,
                                        context.packageName.toString() + ".provider",
                                        file
                                    )
                                    val intent = Intent(Intent.ACTION_VIEW)
                                    intent.setData(uri)
                                    intent.setFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
                                    context.startActivity(intent)
                                } else {
                                    var intent = Intent(Intent.ACTION_VIEW)
                                    intent.setDataAndType(path, "application/pdf")
                                    intent = Intent.createChooser(intent, "Open File")
                                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                                    context.startActivity(intent)
                                }
                            }catch (e:ActivityNotFoundException){
                                e.printStackTrace()
                            }

                        }else{
                            val intent= Intent(context, BinFileViewer::class.java).putExtra(
                                "getFileID",
                                "view"
                            ).putExtra("shareFile", myPath)
                                .putExtra("","")
                            globalcontext.furtherCall(intent)
                        }

                    }

                        holder.file_name2.text = fileName

                        if (myPath.endsWith(".pdf")) {
                            holder.icon2.setImageResource(R.drawable.file_item)
                        } else {
                            holder.icon2.setImageResource(R.drawable.file_item)
                        }
                        val c = Calendar.getInstance()
                        c.timeInMillis = mDate

                        var month = c[Calendar.MONTH]

                        if (month == 0) {
                            month = 1
                        }
                        val datee =
                            "Date" + " " + c[Calendar.DAY_OF_MONTH].toString() + "-" + month + "-" + c[Calendar.YEAR].toString()
                        val sizee = MyUtils.getStringSizeLengthFile(fileSize)
                        holder.mdate.text = datee
                        holder.msize.text = "Size "+sizee

                    holder.menu.setOnClickListener{
                        val popupMenu = PopupMenu(context, it)
                        popupMenu.menuInflater.inflate(R.menu.item_menu, popupMenu.menu)

                        // Set the click listener for menu items
                        popupMenu.setOnMenuItemClickListener { menuItem ->
                            when (menuItem.itemId) {
                                R.id.delete -> {
                                    val builder = MaterialAlertDialogBuilder(context,R.style.AlertDialogTheme)

                                    builder.setTitle("Alert:")
                                    builder.setMessage("Do you want to delete? ")
                                    builder.setPositiveButton("Yes") { dialog, _ ->

                                        deleteFromRecent(mId, context)
                                        arrayListApp.removeAt(position)
                                        notifyDataSetChanged()
                                        dialog.dismiss()
                                    }
                                    builder.setNegativeButton(
                                        "No"
                                    ) { dialog, id -> dialog.cancel() }
                                    builder.show()

                                    true
                                }
                                R.id.share -> {
                                    share(file, context)
                                    true
                                }
                                else -> false
                            }
                        }

                        popupMenu.show()
                    }


//                        holder.delete.setOnClickListener {
//                            val builder = MaterialAlertDialogBuilder(context,R.style.AlertDialogTheme)
//
//                            builder.setTitle("Alert:")
//                            builder.setMessage("Do you want to delete? ")
//                            builder.setPositiveButton("Yes") { dialog, _ ->
//
//                                deleteFromRecent(mId, context)
//                                appListArray.removeAt(position)
//                                notifyDataSetChanged()
//                                dialog.dismiss()
//                            }
//                            builder.setNegativeButton(
//                                "No"
//                            ) { dialog, id -> dialog.cancel() }
//                            builder.show()
//
//
//
//                        }
//                        holder.share.setOnClickListener {
//                            share(file, context)
//                        }

                }



        }
    }


}
