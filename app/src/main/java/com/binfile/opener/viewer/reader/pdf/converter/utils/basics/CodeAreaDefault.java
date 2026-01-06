
package com.binfile.opener.viewer.reader.pdf.converter.utils.basics;


import com.binfile.opener.viewer.reader.pdf.converter.utils.capabilities.CapableBackgroundPaint;
import com.binfile.opener.viewer.reader.pdf.converter.utils.capabilities.CapableSimpleColors;
import com.binfile.opener.viewer.reader.pdf.converter.utils.capabilities.CapableTextStyle;
import com.binfile.opener.viewer.reader.pdf.converter.utils.capabilities.CapableBackgroundPaint;
import com.binfile.opener.viewer.reader.pdf.converter.utils.capabilities.CapableSimpleColors;
import com.binfile.opener.viewer.reader.pdf.converter.utils.capabilities.CapableTextStyle;
import org.exbin.bined.capability.BasicScrollingCapable;
import org.exbin.bined.capability.CaretCapable;
import org.exbin.bined.capability.CharsetCapable;
import org.exbin.bined.capability.ClipboardCapable;
import org.exbin.bined.capability.CodeCharactersCaseCapable;
import org.exbin.bined.capability.CodeTypeCapable;
import org.exbin.bined.capability.EditModeCapable;
import org.exbin.bined.capability.RowWrappingCapable;
import org.exbin.bined.capability.ScrollingCapable;
import org.exbin.bined.capability.SelectionCapable;
import org.exbin.bined.capability.ViewModeCapable;

/**
 * Code area component default interface.

 */
public interface CodeAreaDefault extends SelectionCapable, CaretCapable, BasicScrollingCapable, ScrollingCapable, ViewModeCapable,
        CodeTypeCapable, EditModeCapable, CharsetCapable, CodeCharactersCaseCapable, CapableTextStyle,
        CapableBackgroundPaint, RowWrappingCapable, ClipboardCapable, CapableSimpleColors {
}
