
package com.binfile.opener.viewer.reader.pdf.converter.utils;

import android.graphics.Color;
import android.graphics.Rect;
import androidx.annotation.Nullable;


/**
 * Hexadecimal editor component android utilities.
 */

public class UtilsCodeAndroid {

    public static final int MONOSPACE_CODE_POINT_MIN = 0x1F;
    public static final int MONOSPACE_CODE_POINT_MAX = 0x1C3;
    public static final int SPACE_CODE_POINT_INV = 0x7f;
    public static final int EXCEPTION1_CODE_POINT = 0x8e;
    public static final int EXCEPTION2_CODE_POINT = 0x9e;
    public static int COMPONENT_VALUE_MAX = 255;
    public static final String DEFAULT_ENCODING = "UTF-8";

    private UtilsCodeAndroid() {
    }

    /**
     * Detect if character is in unicode range covered by monospace fonts width
     * exactly full width.
     *
     * @param character input character
     * @return true if character is suppose to have exactly full width
     */
    public static boolean isMonospaceFullWidthCharacter(char character) {
        return (character > MONOSPACE_CODE_POINT_MIN && (int) character < MONOSPACE_CODE_POINT_MAX
                && character != SPACE_CODE_POINT_INV
                && character != EXCEPTION1_CODE_POINT && character != EXCEPTION2_CODE_POINT);
    }

    public static boolean areSameColors(@Nullable Integer color, @Nullable Integer comparedColor) {
        return (color == null && comparedColor == null) || (color != null && color.equals(comparedColor));
    }

    public static int createOddColor(int color) {
        return Color.rgb(
                computeOddColorComponent(Color.red(color)),
                computeOddColorComponent(Color.green(color)),
                computeOddColorComponent(Color.blue(color)));
    }

    public static int computeOddColorComponent(int colorComponent) {
        return colorComponent + (colorComponent > 64 ? -16 : 16);
    }

    public static int createNegativeColor(int color) {
        return Color.rgb(
                COMPONENT_VALUE_MAX - Color.red(color),
                COMPONENT_VALUE_MAX - Color.green(color),
                COMPONENT_VALUE_MAX - Color.blue(color));
    }

    public static int computeGrayColor(int color) {
        int grayLevel = (Color.red(color) + Color.green(color) + Color.blue(color)) / 3;
        return Color.rgb(grayLevel, grayLevel, grayLevel);
    }

    @Nullable
    public static Rect computeIntersection(@Nullable Rect rect1, @Nullable Rect rect2) {
        if (rect1 == null || rect2 == null)
            return null;
        if (rect2.left > rect1.right || rect2.right < rect1.left || rect2.top > rect1.bottom || rect2.bottom < rect1.top)
            return null;

        int left = Math.max(rect1.left, rect2.left);
        int top = Math.max(rect1.top, rect2.top);
        int right = Math.min(rect1.right, rect2.right);
        int bottom = Math.min(rect1.bottom, rect2.bottom);
        return new Rect(left, top, right, bottom);
    }
}
