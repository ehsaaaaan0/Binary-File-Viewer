
package com.binfile.opener.viewer.reader.pdf.converter.utils.basics;

import android.graphics.Paint;

import androidx.annotation.Nullable;


import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;





public class SimpleCodeAreasMetric {

    @Nullable
    private Paint fontMetrics;
    private boolean monospaceFont;

    private int rowHeight;
    private int characterWidth;
    private int fontHeight;
    private int maxBytesPerChar;
    private int subFontSpace = 0;

    public void recomputeMetrics(@Nullable Paint fontMetrics, Charset charset) {
        this.fontMetrics = fontMetrics;
        if (fontMetrics == null) {
            characterWidth = 0;
            fontHeight = 0;
        } else {
            fontHeight = (int) fontMetrics.getTextSize();
            rowHeight = fontHeight;

            /*
             * Use small 'w' character to guess normal font width.
             */
            characterWidth = (int) fontMetrics.measureText("w");
            int fontSize = (int) fontMetrics.getTextSize();
            subFontSpace = rowHeight - fontSize + 4;

            /*
             * Compare it to small 'i' to detect if font is monospaced.
             *
             * TODO: Is there better way?
             */
            monospaceFont = characterWidth == fontMetrics.measureText(" ") && characterWidth == fontMetrics.measureText("i");
        }

        CharsetEncoder encoder = charset.newEncoder();
        maxBytesPerChar = (int) encoder.maxBytesPerChar();
    }

    public boolean isInitialized() {
        return rowHeight != 0 && characterWidth != 0;
    }

    @Nullable
    public Paint getFontMetrics() {
        return fontMetrics;
    }

    public int getCharWidth(char value) {
        return (int) fontMetrics.measureText(String.valueOf(value));
    }

    public int getCharsWidth(char[] data, int offset, int length) {
        return (int) fontMetrics.measureText(String.valueOf(data, offset, length));
    }

    public boolean isMonospaceFont() {
        return monospaceFont;
    }

    public boolean hasUniformLineMetrics() {
        return false; // TODO fontMetrics.hasUniformLineMetrics();
    }

    public int getRowHeight() {
        return rowHeight;
    }

    public int getCharacterWidth() {
        return characterWidth;
    }

    public int getFontHeight() {
        return fontHeight;
    }

    public int getSubFontSpace() {
        return subFontSpace;
    }

    public int getMaxBytesPerChar() {
        return maxBytesPerChar;
    }
}
