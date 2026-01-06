# BinView: Binary File Viewer & PDF Converter

BinView is a versatile Android application designed for developers and tech enthusiasts to explore the raw binary data of any file on their device. It provides a clean interface to view, analyze, and convert binary files into human-readable formats or PDF documents.

## Key Features

- **Binary File Viewing:** Open any file type and view its raw data in different formats:
    - Binary
    - Decimal
    - Octal
    - Hexadecimal
- **Customizable Display:** Adjust the number of bytes displayed per row (4, 8, 12, or 16) for better readability.
- **Binary to PDF Conversion:** Convert the raw byte content of a file into a PDF document. Choose the encoding format (Binary, Hex, Decimal, Octal) for the output.
- **Recent Files:** Quickly access previously viewed files.
- **File Management:** Browse your device's storage to select files for viewing or conversion.

## How it's Built

The app is built using modern Android development practices:

### Tech Stack
- **Language:** Kotlin
- **UI Framework:** XML with View Binding for type-safe layout interactions.
- **Asynchronous Tasks:** `java.util.concurrent.Executor` and `android.os.Handler` for background processing (like reading large files or converting to PDF) to keep the UI responsive.
- **Data Persistence:** `SharedPreferences` for storing recent file paths and `Room` (via `ClassDatabaseClient`) for local database management.

### Key Libraries
- **BinEd:** Used for the core binary editing and viewing component (`CodeArea`).
- **PDFBox (Android version):** Used for generating PDF documents from binary strings.
- **favre.lib:bytes:** A utility library for easy byte manipulation and encoding.
- **Material Components:** For modern UI elements like `MaterialAlertDialogBuilder` and `NavigationView`.

## Code Highlights

### Binary Viewing Logic
The `BinFileViewer` activity uses the `BinEd` library to render raw data. It loads file content into a `ByteArrayEditableData` object in a background thread:

```kotlin
executor.execute {
    val fileInputStream = FileInputStream(file)
    fileData = ByteArrayEditableData()
    fileData!!.loadFromStream(fileInputStream)
    runOnUiThread {
        binding.includeContent.codeArea.contentData = fileData
    }
}
```

### PDF Conversion Logic
Converting binary data to PDF involves reading bytes, encoding them based on user preference, and then drawing the text onto PDF pages using `PDPageContentStream`:

```kotlin
private fun convertByteIs(filePath: String, destPath: String) {
    val fin = FileInputStream(File(filePath))
    val byte = Bytes.from(fin)
    val byteString = when (valueChecked) {
        "binary" -> byte.encodeBinary()
        "hexa" -> byte.encodeHex()
        // ... other formats
        else -> byte.encodeHex()
    }
    // Logic to split string and draw on PDF pages
}
```

## Permissions
The app requires storage permissions (`READ_EXTERNAL_STORAGE`, `WRITE_EXTERNAL_STORAGE`, and `MANAGE_EXTERNAL_STORAGE` for Android 11+) to access and process files from the user's device.

## Navigation
- **MainActivity:** The central hub for all actions (Browse, View, Convert, Recents).
- **BinFileViewer:** The dedicated viewer and converter interface.
- **ListFile:** Shows a list of recent or converted files.
