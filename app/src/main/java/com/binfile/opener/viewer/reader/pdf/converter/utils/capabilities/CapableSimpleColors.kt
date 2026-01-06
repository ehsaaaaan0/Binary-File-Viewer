
package com.binfile.opener.viewer.reader.pdf.converter.utils.capabilities

import com.binfile.opener.viewer.reader.pdf.converter.utils.basics.colorPKG.SimpleCodeAreasColor
import java.util.*



interface CapableSimpleColors {
    
    fun getBasicColors(): Optional<com.binfile.opener.viewer.reader.pdf.converter.utils.basics.colorPKG.SimpleCodeAreasColor>
    fun setBasicColors(colors: com.binfile.opener.viewer.reader.pdf.converter.utils.basics.colorPKG.SimpleCodeAreasColor?)
}