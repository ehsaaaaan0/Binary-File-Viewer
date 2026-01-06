
package com.binfile.opener.viewer.reader.pdf.converter.utils

import android.graphics.Paint

/**
 * Font definition.

 */

class TextStyles {
    var font = 0

    companion object {
        fun fromPaint(paint: Paint): TextStyles {
            val textStyles = TextStyles()
            textStyles.font = paint.flags
            return textStyles
        }
    }
}