
package com.binfile.opener.viewer.reader.pdf.converter.utils.basics.colorPKG;

import org.exbin.bined.color.CodeAreaBasicColors;
import org.exbin.bined.color.CodeAreaColorType;

import androidx.annotation.Nullable;


/**
 * Color profile.

 */

public interface CodeAreasColors {

    /**
     * Returns color of the specified type.
     *
     * @param colorType color type
     * @return color or null if not defined
     */
    @Nullable
    Integer getColor(CodeAreaColorType colorType);

    /**
     * Returns color of the specified type.
     *
     * @param colorType color type
     * @param basicAltColor basic color type used as fallback
     * @return color or null if not defined
     */
    @Nullable
    Integer getColor(CodeAreaColorType colorType, @Nullable CodeAreaBasicColors basicAltColor);

    /**
     * Reinitialize colors.
     */
    void reinitialize();
}
