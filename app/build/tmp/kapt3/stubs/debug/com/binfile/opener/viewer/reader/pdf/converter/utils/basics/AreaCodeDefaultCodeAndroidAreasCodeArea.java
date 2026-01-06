package com.binfile.opener.viewer.reader.pdf.converter.utils.basics;

import java.lang.System;

/**
 * Code area component default code area.
 */
@androidx.annotation.RequiresApi(api = android.os.Build.VERSION_CODES.N)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0096\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b+\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bB%\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020\u0017H\u0016J\u0010\u0010O\u001a\u00020M2\u0006\u0010P\u001a\u00020+H\u0016J\u0010\u0010Q\u001a\u00020M2\u0006\u0010R\u001a\u00020@H\u0016J\u0010\u0010S\u001a\u00020M2\u0006\u0010T\u001a\u00020DH\u0016J\b\u0010U\u001a\u00020MH\u0016J\u001e\u0010V\u001a\u00020M2\u0006\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u0002062\u0006\u0010Z\u001a\u00020[J\u0010\u0010V\u001a\u00020M2\u0006\u0010\\\u001a\u00020]H\u0016J\b\u0010^\u001a\u00020MH\u0016J\u0018\u0010_\u001a\u00020]2\u0006\u0010`\u001a\u00020]2\u0006\u0010a\u001a\u00020bH\u0016J\u0018\u0010c\u001a\u00020>2\u0006\u0010d\u001a\u00020>2\u0006\u0010e\u001a\u00020fH\u0016J\b\u0010g\u001a\u00020-H\u0016J\b\u0010h\u001a\u00020[H\u0016J\u000e\u0010i\u001a\b\u0012\u0004\u0012\u00020k0jH\u0017J\b\u0010l\u001a\u00020\u0014H\u0016J\b\u0010m\u001a\u00020]H\u0016J\b\u0010n\u001a\u00020\u0019H\u0016J\b\u0010o\u001a\u00020\u001cH\u0016J\b\u0010p\u001a\u00020\u001eH\u0016J\b\u0010q\u001a\u000206H\u0016J\b\u0010r\u001a\u00020\'H\u0016J\b\u0010s\u001a\u00020XH\u0016J\b\u0010t\u001a\u00020)H\u0016J\b\u0010u\u001a\u00020-H\u0016J\b\u0010v\u001a\u00020/H\u0016J\b\u0010w\u001a\u000201H\u0016J\b\u0010x\u001a\u000206H\u0016J\b\u0010y\u001a\u000206H\u0016J\b\u0010z\u001a\u000206H\u0016J\u0018\u0010{\u001a\u0002062\u0006\u0010|\u001a\u0002062\u0006\u0010}\u001a\u000206H\u0016J\u0006\u0010~\u001a\u00020:J\b\u0010\u007f\u001a\u00020<H\u0016J\t\u0010\u0080\u0001\u001a\u00020>H\u0016J\n\u0010\u0081\u0001\u001a\u00030\u0082\u0001H\u0016J\t\u0010\u0083\u0001\u001a\u00020BH\u0016J\t\u0010\u0084\u0001\u001a\u00020/H\u0016J\t\u0010\u0085\u0001\u001a\u00020HH\u0016J\t\u0010\u0086\u0001\u001a\u00020JH\u0016J\t\u0010\u0087\u0001\u001a\u000206H\u0016J\t\u0010\u0088\u0001\u001a\u000203H\u0016J\t\u0010\u0089\u0001\u001a\u00020MH\u0002J\t\u0010\u008a\u0001\u001a\u000203H\u0016J\t\u0010\u008b\u0001\u001a\u000203H\u0016J#\u0010\u008c\u0001\u001a\u00020]2\u0006\u0010|\u001a\u0002062\u0006\u0010}\u001a\u0002062\b\u0010\u008d\u0001\u001a\u00030\u008e\u0001H\u0016J\t\u0010\u008f\u0001\u001a\u00020MH\u0004J\t\u0010\u0090\u0001\u001a\u00020MH\u0004J\t\u0010\u0091\u0001\u001a\u00020MH\u0004J\u0007\u0010\u0092\u0001\u001a\u00020MJ\u0013\u0010\u0093\u0001\u001a\u00020M2\b\u0010\u0094\u0001\u001a\u00030\u0095\u0001H\u0014J\u0015\u0010\u0096\u0001\u001a\u00020M2\n\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0095\u0001H\u0016J\u0015\u0010\u0097\u0001\u001a\u00020M2\n\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0095\u0001H\u0016J\u0011\u0010\u0098\u0001\u001a\u00020M2\u0006\u0010N\u001a\u00020\u0017H\u0016J\u0011\u0010\u0099\u0001\u001a\u00020M2\u0006\u0010P\u001a\u00020+H\u0016J\u0011\u0010\u009a\u0001\u001a\u00020M2\u0006\u0010R\u001a\u00020@H\u0016J\u0011\u0010\u009b\u0001\u001a\u00020M2\u0006\u0010T\u001a\u00020DH\u0016J\t\u0010\u009c\u0001\u001a\u00020MH\u0016J\t\u0010\u009d\u0001\u001a\u00020MH\u0016J\t\u0010\u009e\u0001\u001a\u00020MH\u0016J\t\u0010\u009f\u0001\u001a\u00020MH\u0016J\t\u0010\u00a0\u0001\u001a\u00020MH\u0016J\u001f\u0010\u00a1\u0001\u001a\u00020M2\u0006\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u0002062\u0006\u0010Z\u001a\u00020[J\u0011\u0010\u00a1\u0001\u001a\u00020M2\u0006\u0010\\\u001a\u00020]H\u0017J\u0014\u0010\u00a2\u0001\u001a\u00020M2\t\u0010\u00a3\u0001\u001a\u0004\u0018\u00010kH\u0016J\u0011\u0010\u00a4\u0001\u001a\u00020M2\u0006\u0010W\u001a\u00020XH\u0016J\u001a\u0010\u00a4\u0001\u001a\u00020M2\u0006\u0010W\u001a\u00020X2\u0007\u0010\u00a5\u0001\u001a\u000206H\u0016J\u0011\u0010\u00a4\u0001\u001a\u00020M2\u0006\u0010\\\u001a\u00020]H\u0016J\u0011\u0010\u00a6\u0001\u001a\u00020M2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0011\u0010\u00a7\u0001\u001a\u00020M2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0011\u0010\u00a8\u0001\u001a\u00020M2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0011\u0010\u00a9\u0001\u001a\u00020M2\u0006\u0010&\u001a\u00020\'H\u0016J\u0011\u0010\u00aa\u0001\u001a\u00020M2\u0006\u0010(\u001a\u00020)H\u0016J\u0011\u0010\u00ab\u0001\u001a\u00020M2\u0006\u0010,\u001a\u00020-H\u0016J\u0011\u0010\u00ac\u0001\u001a\u00020M2\u0006\u0010.\u001a\u00020/H\u0016J\u0011\u0010\u00ad\u0001\u001a\u00020M2\u0006\u00100\u001a\u000201H\u0016J\u0011\u0010\u00ae\u0001\u001a\u00020M2\u0006\u00105\u001a\u000206H\u0016J\u0011\u0010\u00af\u0001\u001a\u00020M2\u0006\u00107\u001a\u000206H\u0016J\u0011\u0010\u00b0\u0001\u001a\u00020M2\u0006\u00108\u001a\u000206H\u0016J\u000f\u0010\u00b1\u0001\u001a\u00020M2\u0006\u00109\u001a\u00020:J\u0011\u0010\u00b2\u0001\u001a\u00020M2\u0006\u0010;\u001a\u00020<H\u0016J\u0011\u0010\u00b3\u0001\u001a\u00020M2\u0006\u0010=\u001a\u00020>H\u0016J\u001b\u0010\u00b4\u0001\u001a\u00020M2\u0007\u0010\u00b5\u0001\u001a\u00020X2\u0007\u0010\u00b6\u0001\u001a\u00020XH\u0016J\u0013\u0010\u00b4\u0001\u001a\u00020M2\b\u0010\u00b7\u0001\u001a\u00030\u0082\u0001H\u0016J\u0011\u0010\u00b8\u0001\u001a\u00020M2\u0006\u0010E\u001a\u000203H\u0016J\u0011\u0010\u00b9\u0001\u001a\u00020M2\u0006\u0010F\u001a\u00020/H\u0016J\u0011\u0010\u00ba\u0001\u001a\u00020M2\u0006\u0010G\u001a\u00020HH\u0016J\u0011\u0010\u00bb\u0001\u001a\u00020M2\u0006\u0010I\u001a\u00020JH\u0016J\u0012\u0010\u00bc\u0001\u001a\u00020M2\u0007\u0010\u00bd\u0001\u001a\u000206H\u0016J\t\u0010\u00be\u0001\u001a\u00020MH\u0016J\u0007\u0010\u00bf\u0001\u001a\u00020MR(\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\r8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n \u001a*\u0004\u0018\u00010\u00190\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R*\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u001f\u001a\u0004\u0018\u00010 8V@VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u00102\u001a\u0002038BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b2\u00104R\u000e\u00105\u001a\u000206X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000206X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000206X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020:X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020<X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020>X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010?\u001a\b\u0012\u0004\u0012\u00020@0\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020BX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010C\u001a\b\u0012\u0004\u0012\u00020D0\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u000203X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020HX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020JX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u000206X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u00c0\u0001"}, d2 = {"Lcom/binfile/opener/viewer/reader/pdf/converter/utils/basics/AreaCodeDefaultCodeAndroidAreasCodeArea;", "Lcom/binfile/opener/viewer/reader/pdf/converter/utils/CoreCodeArea;", "Lcom/binfile/opener/viewer/reader/pdf/converter/utils/basics/CodeAreaDefault;", "Lcom/binfile/opener/viewer/reader/pdf/converter/utils/ControlCodeAndroidAreas;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "commandHandlerFactory", "Lcom/binfile/opener/viewer/reader/pdf/converter/utils/CmdHandlerCodeArea$CodeAreaCommandHandlerFactory;", "(Landroid/content/Context;Landroid/util/AttributeSet;Lcom/binfile/opener/viewer/reader/pdf/converter/utils/CmdHandlerCodeArea$CodeAreaCommandHandlerFactory;)V", "borderPaintMode", "Lorg/exbin/bined/basic/BasicBackgroundPaintMode;", "backgroundPaintMode", "getBackgroundPaintMode", "()Lorg/exbin/bined/basic/BasicBackgroundPaintMode;", "setBackgroundPaintMode", "(Lorg/exbin/bined/basic/BasicBackgroundPaintMode;)V", "caret", "Lcom/binfile/opener/viewer/reader/pdf/converter/utils/basics/CodeAreaCaretDefault;", "caretMovedListeners", "", "Lorg/exbin/bined/CaretMovedListener;", "charset", "Ljava/nio/charset/Charset;", "kotlin.jvm.PlatformType", "clipboardHandlingMode", "Lorg/exbin/bined/ClipboardHandlingMode;", "codeCharactersCase", "Lorg/exbin/bined/CodeCharactersCase;", "codeFont", "Lcom/binfile/opener/viewer/reader/pdf/converter/utils/TextStyles;", "codeTextStyles", "getCodeTextStyles", "()Lcom/binfile/opener/viewer/reader/pdf/converter/utils/TextStyles;", "setCodeTextStyles", "(Lcom/binfile/opener/viewer/reader/pdf/converter/utils/TextStyles;)V", "codeType", "Lorg/exbin/bined/CodeType;", "editMode", "Lorg/exbin/bined/EditMode;", "editModeChangedListeners", "Lorg/exbin/bined/EditModeChangedListener;", "editOperation", "Lorg/exbin/bined/EditOperation;", "horizontalScrollBarVisibility", "Lorg/exbin/bined/ScrollBarVisibility;", "horizontalScrollUnit", "Lorg/exbin/bined/basic/HorizontalScrollUnit;", "isInitialized", "", "()Z", "maxBytesPerRow", "", "maxRowPositionLength", "minRowPositionLength", "painter", "Lcom/binfile/opener/viewer/reader/pdf/converter/utils/CodeAreaPainter;", "rowWrapping", "Lorg/exbin/bined/RowWrappingMode;", "scrollPosition", "Lorg/exbin/bined/basic/CodeAreaScrollPosition;", "scrollingListeners", "Lorg/exbin/bined/ScrollingListener;", "selection", "Lorg/exbin/bined/CodeAreaSelection;", "selectionChangedListeners", "Lorg/exbin/bined/SelectionChangedListener;", "showMirrorCursor", "verticalScrollBarVisibility", "verticalScrollUnit", "Lorg/exbin/bined/basic/VerticalScrollUnit;", "viewMode", "Lorg/exbin/bined/basic/CodeAreaViewMode;", "wrappingBytesGroupSize", "addCaretMovedListener", "", "caretMovedListener", "addEditModeChangedListener", "editModeChangedListener", "addScrollingListener", "scrollingListener", "addSelectionChangedListener", "selectionChangedListener", "centerOnCursor", "centerOnPosition", "dataPosition", "", "dataOffset", "section", "Lorg/exbin/bined/CodeAreaSection;", "caretPosition", "Lorg/exbin/bined/CodeAreaCaretPosition;", "clearSelection", "computeMovePosition", "position", "direction", "Lorg/exbin/bined/basic/MovementDirection;", "computeScrolling", "startPosition", "scrollingShift", "Lorg/exbin/bined/basic/ScrollingDirection;", "getActiveOperation", "getActiveSection", "getBasicColors", "Ljava/util/Optional;", "Lcom/binfile/opener/viewer/reader/pdf/converter/utils/basics/colorPKG/SimpleCodeAreasColor;", "getCaret", "getCaretPosition", "getCharset", "getClipboardHandlingMode", "getCodeCharactersCase", "getCodeOffset", "getCodeType", "getDataPosition", "getEditMode", "getEditOperation", "getHorizontalScrollBarVisibility", "getHorizontalScrollUnit", "getMaxBytesPerRow", "getMaxRowPositionLength", "getMinRowPositionLength", "getMouseCursorShape", "positionX", "positionY", "getPainter", "getRowWrapping", "getScrollPosition", "getSelection", "Lorg/exbin/bined/SelectionRange;", "getSelectionHandler", "getVerticalScrollBarVisibility", "getVerticalScrollUnit", "getViewMode", "getWrappingBytesGroupSize", "hasSelection", "init", "isEditable", "isShowMirrorCursor", "mousePositionToClosestCaretPosition", "overflowMode", "Lorg/exbin/bined/CaretOverlapMode;", "notifyCaretChanged", "notifyCaretMoved", "notifyScrolled", "notifySelectionChanged", "onDraw", "g", "Landroid/graphics/Canvas;", "paintComponent", "paintView", "removeCaretMovedListener", "removeEditModeChangedListener", "removeScrollingListener", "removeSelectionChangedListener", "repaint", "reset", "resetColors", "resetPainter", "revealCursor", "revealPosition", "setBasicColors", "colors", "setCaretPosition", "codeOffset", "setCharset", "setClipboardHandlingMode", "setCodeCharactersCase", "setCodeType", "setEditMode", "setEditOperation", "setHorizontalScrollBarVisibility", "setHorizontalScrollUnit", "setMaxBytesPerRow", "setMaxRowPositionLength", "setMinRowPositionLength", "setPainter", "setRowWrapping", "setScrollPosition", "setSelection", "start", "end", "selectionRange", "setShowMirrorCursor", "setVerticalScrollBarVisibility", "setVerticalScrollUnit", "setViewMode", "setWrappingBytesGroupSize", "groupSize", "updateLayout", "updateScrollBars", "Bin File Viewer - 1.0-1_debug"})
public final class AreaCodeDefaultCodeAndroidAreasCodeArea extends com.binfile.opener.viewer.reader.pdf.converter.utils.CoreCodeArea implements com.binfile.opener.viewer.reader.pdf.converter.utils.basics.CodeAreaDefault, com.binfile.opener.viewer.reader.pdf.converter.utils.ControlCodeAndroidAreas {
    private com.binfile.opener.viewer.reader.pdf.converter.utils.CodeAreaPainter painter;
    private final com.binfile.opener.viewer.reader.pdf.converter.utils.basics.CodeAreaCaretDefault caret = null;
    private final org.exbin.bined.CodeAreaSelection selection = null;
    private final org.exbin.bined.basic.CodeAreaScrollPosition scrollPosition = null;
    private java.nio.charset.Charset charset;
    private org.exbin.bined.ClipboardHandlingMode clipboardHandlingMode = org.exbin.bined.ClipboardHandlingMode.PROCESS;
    private org.exbin.bined.EditMode editMode = org.exbin.bined.EditMode.EXPANDING;
    private org.exbin.bined.EditOperation editOperation = org.exbin.bined.EditOperation.OVERWRITE;
    private org.exbin.bined.basic.CodeAreaViewMode viewMode = org.exbin.bined.basic.CodeAreaViewMode.DUAL;
    @org.jetbrains.annotations.Nullable
    private com.binfile.opener.viewer.reader.pdf.converter.utils.TextStyles codeTextStyles;
    private org.exbin.bined.basic.BasicBackgroundPaintMode borderPaintMode = org.exbin.bined.basic.BasicBackgroundPaintMode.STRIPED;
    private org.exbin.bined.CodeType codeType = org.exbin.bined.CodeType.HEXADECIMAL;
    private org.exbin.bined.CodeCharactersCase codeCharactersCase = org.exbin.bined.CodeCharactersCase.UPPER;
    private boolean showMirrorCursor = true;
    private org.exbin.bined.RowWrappingMode rowWrapping = org.exbin.bined.RowWrappingMode.NO_WRAPPING;
    private int minRowPositionLength = 8;
    private int maxRowPositionLength = 0;
    private int wrappingBytesGroupSize = 0;
    private int maxBytesPerRow = 8;
    private org.exbin.bined.ScrollBarVisibility verticalScrollBarVisibility = org.exbin.bined.ScrollBarVisibility.IF_NEEDED;
    private org.exbin.bined.basic.VerticalScrollUnit verticalScrollUnit = org.exbin.bined.basic.VerticalScrollUnit.PIXEL;
    private org.exbin.bined.ScrollBarVisibility horizontalScrollBarVisibility = org.exbin.bined.ScrollBarVisibility.NEVER;
    private org.exbin.bined.basic.HorizontalScrollUnit horizontalScrollUnit = org.exbin.bined.basic.HorizontalScrollUnit.PIXEL;
    private final java.util.List<org.exbin.bined.CaretMovedListener> caretMovedListeners = null;
    private final java.util.List<org.exbin.bined.ScrollingListener> scrollingListeners = null;
    private final java.util.List<org.exbin.bined.SelectionChangedListener> selectionChangedListeners = null;
    private final java.util.List<org.exbin.bined.EditModeChangedListener> editModeChangedListeners = null;
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public com.binfile.opener.viewer.reader.pdf.converter.utils.TextStyles getCodeTextStyles() {
        return null;
    }
    
    @java.lang.Override
    public void setCodeTextStyles(@org.jetbrains.annotations.Nullable
    com.binfile.opener.viewer.reader.pdf.converter.utils.TextStyles codeFont) {
    }
    
    /**
     * Creates new instance with default command handler and painter.
     */
    public AreaCodeDefaultCodeAndroidAreasCodeArea(@org.jetbrains.annotations.Nullable
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, null);
    }
    
    /**
     * Creates new instance with provided command handler factory method.
     *
     * @param commandHandlerFactory command handler or null for default handler
     */
    public AreaCodeDefaultCodeAndroidAreasCodeArea(@org.jetbrains.annotations.Nullable
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, @org.jetbrains.annotations.Nullable
    com.binfile.opener.viewer.reader.pdf.converter.utils.CmdHandlerCodeArea.CodeAreaCommandHandlerFactory commandHandlerFactory) {
        super(null, null, null);
    }
    
    private final void init() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.binfile.opener.viewer.reader.pdf.converter.utils.CodeAreaPainter getPainter() {
        return null;
    }
    
    public final void setPainter(@org.jetbrains.annotations.NotNull
    com.binfile.opener.viewer.reader.pdf.converter.utils.CodeAreaPainter painter) {
    }
    
    @java.lang.Override
    public void paintView(@org.jetbrains.annotations.Nullable
    android.graphics.Canvas g) {
    }
    
    @java.lang.Override
    public void paintComponent(@org.jetbrains.annotations.Nullable
    android.graphics.Canvas g) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.binfile.opener.viewer.reader.pdf.converter.utils.basics.CodeAreaCaretDefault getCaret() {
        return null;
    }
    
    @java.lang.Override
    public boolean isShowMirrorCursor() {
        return false;
    }
    
    @java.lang.Override
    public void setShowMirrorCursor(boolean showMirrorCursor) {
    }
    
    @java.lang.Override
    public int getMinRowPositionLength() {
        return 0;
    }
    
    @java.lang.Override
    public void setMinRowPositionLength(int minRowPositionLength) {
    }
    
    @java.lang.Override
    public int getMaxRowPositionLength() {
        return 0;
    }
    
    @java.lang.Override
    public void setMaxRowPositionLength(int maxRowPositionLength) {
    }
    
    private final boolean isInitialized() {
        return false;
    }
    
    @java.lang.Override
    public long getDataPosition() {
        return 0L;
    }
    
    @java.lang.Override
    public int getCodeOffset() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.exbin.bined.CodeAreaSection getActiveSection() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.exbin.bined.CodeAreaCaretPosition getCaretPosition() {
        return null;
    }
    
    @java.lang.Override
    public void setCaretPosition(@org.jetbrains.annotations.NotNull
    org.exbin.bined.CodeAreaCaretPosition caretPosition) {
    }
    
    @java.lang.Override
    public void setCaretPosition(long dataPosition) {
    }
    
    @java.lang.Override
    public void setCaretPosition(long dataPosition, int codeOffset) {
    }
    
    @java.lang.Override
    public int getMouseCursorShape(int positionX, int positionY) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.exbin.bined.CodeCharactersCase getCodeCharactersCase() {
        return null;
    }
    
    @java.lang.Override
    public void setCodeCharactersCase(@org.jetbrains.annotations.NotNull
    org.exbin.bined.CodeCharactersCase codeCharactersCase) {
    }
    
    @java.lang.Override
    public void resetColors() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.exbin.bined.basic.CodeAreaViewMode getViewMode() {
        return null;
    }
    
    @java.lang.Override
    public void setViewMode(@org.jetbrains.annotations.NotNull
    org.exbin.bined.basic.CodeAreaViewMode viewMode) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.exbin.bined.CodeType getCodeType() {
        return null;
    }
    
    @java.lang.Override
    public void setCodeType(@org.jetbrains.annotations.NotNull
    org.exbin.bined.CodeType codeType) {
    }
    
    @java.lang.Override
    public void revealCursor() {
    }
    
    @androidx.annotation.RequiresApi(api = android.os.Build.VERSION_CODES.N)
    @java.lang.Override
    public void revealPosition(@org.jetbrains.annotations.NotNull
    org.exbin.bined.CodeAreaCaretPosition caretPosition) {
    }
    
    public final void revealPosition(long dataPosition, int dataOffset, @org.jetbrains.annotations.NotNull
    org.exbin.bined.CodeAreaSection section) {
    }
    
    @java.lang.Override
    public void centerOnCursor() {
    }
    
    @java.lang.Override
    public void centerOnPosition(@org.jetbrains.annotations.NotNull
    org.exbin.bined.CodeAreaCaretPosition caretPosition) {
    }
    
    public final void centerOnPosition(long dataPosition, int dataOffset, @org.jetbrains.annotations.NotNull
    org.exbin.bined.CodeAreaSection section) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.exbin.bined.CodeAreaCaretPosition mousePositionToClosestCaretPosition(int positionX, int positionY, @org.jetbrains.annotations.NotNull
    org.exbin.bined.CaretOverlapMode overflowMode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.exbin.bined.CodeAreaCaretPosition computeMovePosition(@org.jetbrains.annotations.NotNull
    org.exbin.bined.CodeAreaCaretPosition position, @org.jetbrains.annotations.NotNull
    org.exbin.bined.basic.MovementDirection direction) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.exbin.bined.basic.CodeAreaScrollPosition computeScrolling(@org.jetbrains.annotations.NotNull
    org.exbin.bined.basic.CodeAreaScrollPosition startPosition, @org.jetbrains.annotations.NotNull
    org.exbin.bined.basic.ScrollingDirection scrollingShift) {
        return null;
    }
    
    public final void updateScrollBars() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.exbin.bined.basic.CodeAreaScrollPosition getScrollPosition() {
        return null;
    }
    
    @java.lang.Override
    public void setScrollPosition(@org.jetbrains.annotations.NotNull
    org.exbin.bined.basic.CodeAreaScrollPosition scrollPosition) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.exbin.bined.ScrollBarVisibility getVerticalScrollBarVisibility() {
        return null;
    }
    
    @java.lang.Override
    public void setVerticalScrollBarVisibility(@org.jetbrains.annotations.NotNull
    org.exbin.bined.ScrollBarVisibility verticalScrollBarVisibility) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.exbin.bined.basic.VerticalScrollUnit getVerticalScrollUnit() {
        return null;
    }
    
    @java.lang.Override
    public void setVerticalScrollUnit(@org.jetbrains.annotations.NotNull
    org.exbin.bined.basic.VerticalScrollUnit verticalScrollUnit) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.exbin.bined.ScrollBarVisibility getHorizontalScrollBarVisibility() {
        return null;
    }
    
    @java.lang.Override
    public void setHorizontalScrollBarVisibility(@org.jetbrains.annotations.NotNull
    org.exbin.bined.ScrollBarVisibility horizontalScrollBarVisibility) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.exbin.bined.basic.HorizontalScrollUnit getHorizontalScrollUnit() {
        return null;
    }
    
    @java.lang.Override
    public void setHorizontalScrollUnit(@org.jetbrains.annotations.NotNull
    org.exbin.bined.basic.HorizontalScrollUnit horizontalScrollUnit) {
    }
    
    @java.lang.Override
    protected void onDraw(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas g) {
    }
    
    @java.lang.Override
    public void reset() {
    }
    
    @java.lang.Override
    public void updateLayout() {
    }
    
    @java.lang.Override
    public void repaint() {
    }
    
    @java.lang.Override
    public void resetPainter() {
    }
    
    protected final void notifyCaretChanged() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.exbin.bined.SelectionRange getSelection() {
        return null;
    }
    
    @java.lang.Override
    public void setSelection(@org.jetbrains.annotations.NotNull
    org.exbin.bined.SelectionRange selectionRange) {
    }
    
    @java.lang.Override
    public void setSelection(long start, long end) {
    }
    
    @java.lang.Override
    public void clearSelection() {
    }
    
    @java.lang.Override
    public boolean hasSelection() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.exbin.bined.CodeAreaSelection getSelectionHandler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.nio.charset.Charset getCharset() {
        return null;
    }
    
    @java.lang.Override
    public void setCharset(@org.jetbrains.annotations.NotNull
    java.nio.charset.Charset charset) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.exbin.bined.EditMode getEditMode() {
        return null;
    }
    
    @java.lang.Override
    public boolean isEditable() {
        return false;
    }
    
    @java.lang.Override
    public void setEditMode(@org.jetbrains.annotations.NotNull
    org.exbin.bined.EditMode editMode) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.exbin.bined.EditOperation getActiveOperation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.exbin.bined.EditOperation getEditOperation() {
        return null;
    }
    
    @java.lang.Override
    public void setEditOperation(@org.jetbrains.annotations.NotNull
    org.exbin.bined.EditOperation editOperation) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.exbin.bined.ClipboardHandlingMode getClipboardHandlingMode() {
        return null;
    }
    
    @java.lang.Override
    public void setClipboardHandlingMode(@org.jetbrains.annotations.NotNull
    org.exbin.bined.ClipboardHandlingMode clipboardHandlingMode) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public org.exbin.bined.basic.BasicBackgroundPaintMode getBackgroundPaintMode() {
        return null;
    }
    
    @java.lang.Override
    public void setBackgroundPaintMode(@org.jetbrains.annotations.Nullable
    org.exbin.bined.basic.BasicBackgroundPaintMode borderPaintMode) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.exbin.bined.RowWrappingMode getRowWrapping() {
        return null;
    }
    
    @java.lang.Override
    public void setRowWrapping(@org.jetbrains.annotations.NotNull
    org.exbin.bined.RowWrappingMode rowWrapping) {
    }
    
    @java.lang.Override
    public int getWrappingBytesGroupSize() {
        return 0;
    }
    
    @java.lang.Override
    public void setWrappingBytesGroupSize(int groupSize) {
    }
    
    @java.lang.Override
    public int getMaxBytesPerRow() {
        return 0;
    }
    
    @java.lang.Override
    public void setMaxBytesPerRow(int maxBytesPerRow) {
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.annotation.RequiresApi(api = android.os.Build.VERSION_CODES.N)
    @java.lang.Override
    public java.util.Optional<com.binfile.opener.viewer.reader.pdf.converter.utils.basics.colorPKG.SimpleCodeAreasColor> getBasicColors() {
        return null;
    }
    
    @java.lang.Override
    public void setBasicColors(@org.jetbrains.annotations.Nullable
    com.binfile.opener.viewer.reader.pdf.converter.utils.basics.colorPKG.SimpleCodeAreasColor colors) {
    }
    
    public final void notifySelectionChanged() {
    }
    
    protected final void notifyCaretMoved() {
    }
    
    protected final void notifyScrolled() {
    }
    
    @java.lang.Override
    public void addSelectionChangedListener(@org.jetbrains.annotations.NotNull
    org.exbin.bined.SelectionChangedListener selectionChangedListener) {
    }
    
    @java.lang.Override
    public void removeSelectionChangedListener(@org.jetbrains.annotations.NotNull
    org.exbin.bined.SelectionChangedListener selectionChangedListener) {
    }
    
    @java.lang.Override
    public void addCaretMovedListener(@org.jetbrains.annotations.NotNull
    org.exbin.bined.CaretMovedListener caretMovedListener) {
    }
    
    @java.lang.Override
    public void removeCaretMovedListener(@org.jetbrains.annotations.NotNull
    org.exbin.bined.CaretMovedListener caretMovedListener) {
    }
    
    @java.lang.Override
    public void addScrollingListener(@org.jetbrains.annotations.NotNull
    org.exbin.bined.ScrollingListener scrollingListener) {
    }
    
    @java.lang.Override
    public void removeScrollingListener(@org.jetbrains.annotations.NotNull
    org.exbin.bined.ScrollingListener scrollingListener) {
    }
    
    @java.lang.Override
    public void addEditModeChangedListener(@org.jetbrains.annotations.NotNull
    org.exbin.bined.EditModeChangedListener editModeChangedListener) {
    }
    
    @java.lang.Override
    public void removeEditModeChangedListener(@org.jetbrains.annotations.NotNull
    org.exbin.bined.EditModeChangedListener editModeChangedListener) {
    }
}