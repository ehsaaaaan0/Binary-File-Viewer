
package com.binfile.opener.viewer.reader.pdf.converter.utils.basics.colorPKG;

import android.graphics.Color;

import androidx.annotation.Nullable;

import com.binfile.opener.viewer.reader.pdf.converter.utils.UtilsCodeAndroid;
import com.binfile.opener.viewer.reader.pdf.converter.utils.UtilsCodeAndroid;
import com.binfile.opener.viewer.reader.pdf.converter.utils.UtilsCodeAndroid;

import org.exbin.bined.color.BasicCodeAreaDecorationColorType;
import org.exbin.bined.color.CodeAreaBasicColors;
import org.exbin.bined.color.CodeAreaColorType;


public class SimpleCodeAreasColor implements CodeAreasColors {

    @Nullable
    private Integer textColor;
    @Nullable
    private Integer textBackground;
    @Nullable
    private Integer selectionColor;
    @Nullable
    private Integer selectionBackground;
    @Nullable
    private Integer selectionMirrorColor;
    @Nullable
    private Integer selectionMirrorBackground;
    @Nullable
    private Integer alternateColor;
    @Nullable
    private Integer alternateBackground;
    @Nullable
    private Integer cursorColor;
    @Nullable
    private Integer cursorNegativeColor;
    @Nullable
    private Integer decorationLine;


    public SimpleCodeAreasColor() {

    }

    public int getTextColor() {
        return textColor;
    }

    public int getTextBackground() {
        return textBackground;
    }

    public int getSelectionColor() {
        return selectionColor;
    }

    public int getSelectionBackground() {
        return selectionBackground;
    }

    public int getSelectionMirrorColor() {
        return selectionMirrorColor;
    }

    public int getSelectionMirrorBackground() {
        return selectionMirrorBackground;
    }

    public int getCursorColor() {
        return cursorColor;
    }

    public int getCursorNegativeColor() {
        return cursorNegativeColor;
    }

    public int getDecorationLine() {
        return decorationLine;
    }

    public int getAlternateBackground() {
        return alternateBackground;
    }

    @Nullable
    @Override
    public Integer getColor(CodeAreaColorType colorType) {
        if (colorType == CodeAreaBasicColors.TEXT_COLOR) {
            return textColor;
        }
        if (colorType == CodeAreaBasicColors.TEXT_BACKGROUND) {
            return textBackground;
        }
        if (colorType == CodeAreaBasicColors.SELECTION_COLOR) {
            return selectionColor;
        }
        if (colorType == CodeAreaBasicColors.SELECTION_BACKGROUND) {
            return selectionBackground;
        }
        if (colorType == CodeAreaBasicColors.SELECTION_MIRROR_COLOR) {
            return selectionMirrorColor;
        }
        if (colorType == CodeAreaBasicColors.SELECTION_MIRROR_BACKGROUND) {
            return selectionMirrorBackground;
        }
        if (colorType == CodeAreaBasicColors.ALTERNATE_COLOR) {
            return alternateColor;
        }
        if (colorType == CodeAreaBasicColors.ALTERNATE_BACKGROUND) {
            return alternateBackground;
        }
        if (colorType == CodeAreaBasicColors.CURSOR_COLOR) {
            return cursorColor;
        }
        if (colorType == CodeAreaBasicColors.CURSOR_NEGATIVE_COLOR) {
            return cursorNegativeColor;
        }
        if (colorType == BasicCodeAreaDecorationColorType.LINE) {
            return decorationLine;
        }

        return null;
    }

    @Nullable
    @Override
    public Integer getColor(CodeAreaColorType colorType, @Nullable CodeAreaBasicColors basicAltColor) {
        Integer color = getColor(colorType);
        return (color == null) ? (basicAltColor == null ? null : getColor(basicAltColor)) : color;
    }

    public void reinitialize() {
        textColor = null; //codeArea.getForeground();
        if (textColor == null) {
            textColor = Color.BLACK;
        }

        textBackground = null; //codeArea.getBackground();
        if (textBackground == null) {
            textBackground = Color.WHITE;
        }
        selectionColor = null; //UIManager.getColor("TextArea.selectionColor");
        if (selectionColor == null) {
            selectionColor = Color.WHITE;
        }
        selectionBackground = null; // UIManager.getColor("TextArea.selectionBackground");
        if (selectionBackground == null) {
            selectionBackground = Color.rgb(96, 96, 255);
        }
        selectionMirrorColor = selectionColor;
        selectionMirrorBackground = UtilsCodeAndroid.computeGrayColor(selectionBackground);
        cursorColor = null; //UIManager.getColor("TextArea.caretForeground");
        if (cursorColor == null) {
            cursorColor = Color.BLACK;
        }
        cursorNegativeColor = UtilsCodeAndroid.createNegativeColor(cursorColor);
        decorationLine = Color.parseColor("#626B89");

        alternateColor = textColor;
        alternateBackground = UtilsCodeAndroid.createOddColor(textBackground);
    }
}
