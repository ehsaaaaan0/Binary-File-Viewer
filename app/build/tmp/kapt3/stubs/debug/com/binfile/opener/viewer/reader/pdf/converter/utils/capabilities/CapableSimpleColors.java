package com.binfile.opener.viewer.reader.pdf.converter.utils.capabilities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H&\u00a8\u0006\b"}, d2 = {"Lcom/binfile/opener/viewer/reader/pdf/converter/utils/capabilities/CapableSimpleColors;", "", "getBasicColors", "Ljava/util/Optional;", "Lcom/binfile/opener/viewer/reader/pdf/converter/utils/basics/colorPKG/SimpleCodeAreasColor;", "setBasicColors", "", "colors", "Bin File Viewer - 1.0-1_debug"})
public abstract interface CapableSimpleColors {
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.Optional<com.binfile.opener.viewer.reader.pdf.converter.utils.basics.colorPKG.SimpleCodeAreasColor> getBasicColors();
    
    public abstract void setBasicColors(@org.jetbrains.annotations.Nullable
    com.binfile.opener.viewer.reader.pdf.converter.utils.basics.colorPKG.SimpleCodeAreasColor colors);
}