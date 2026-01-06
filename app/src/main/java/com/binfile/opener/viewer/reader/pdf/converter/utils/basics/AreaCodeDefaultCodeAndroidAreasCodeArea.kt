
package com.binfile.opener.viewer.reader.pdf.converter.utils.basics

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.os.Build
import android.util.AttributeSet
import androidx.annotation.RequiresApi
import com.binfile.opener.viewer.reader.pdf.converter.utils.*

import org.exbin.bined.*
import com.binfile.opener.viewer.reader.pdf.converter.utils.CmdHandlerCodeArea.CodeAreaCommandHandlerFactory
import com.binfile.opener.viewer.reader.pdf.converter.utils.basics.colorPKG.SimpleCodeAreasColor

import com.binfile.opener.viewer.reader.pdf.converter.utils.capabilities.CapableTextStyle
import org.exbin.bined.basic.*
import java.nio.charset.Charset
import java.util.*
import java.util.Optional

/**
 * Code area component default code area.

 */
@RequiresApi(api = Build.VERSION_CODES.N)

class AreaCodeDefaultCodeAndroidAreasCodeArea : CoreCodeArea,
    com.binfile.opener.viewer.reader.pdf.converter.utils.basics.CodeAreaDefault, ControlCodeAndroidAreas {

    private var painter: CodeAreaPainter

    
    private val caret: com.binfile.opener.viewer.reader.pdf.converter.utils.basics.CodeAreaCaretDefault

    
    private val selection = CodeAreaSelection()

    
    private val scrollPosition = CodeAreaScrollPosition()

    
    private var charset = Charset.forName(com.binfile.opener.viewer.reader.pdf.converter.utils.UtilsCodeAndroid.DEFAULT_ENCODING)
    private var clipboardHandlingMode = ClipboardHandlingMode.PROCESS

    
    private var editMode = EditMode.EXPANDING

    
    private var editOperation = EditOperation.OVERWRITE

    
    private var viewMode = CodeAreaViewMode.DUAL


    override var codeTextStyles: TextStyles? = null
        get() = CodeAreaUtils.requireNonNull(field)
        set(codeFont) {
            field = codeFont
            painter.resetFont()
            repaint()
        }

    
    private var borderPaintMode = BasicBackgroundPaintMode.STRIPED

    
    private var codeType = CodeType.HEXADECIMAL

    
    private var codeCharactersCase = CodeCharactersCase.UPPER
    private var showMirrorCursor = true

    
    private var rowWrapping = RowWrappingMode.NO_WRAPPING
    private var minRowPositionLength = 8
    private var maxRowPositionLength =0
    private var wrappingBytesGroupSize = 0
    private var maxBytesPerRow = 8

    
    private var verticalScrollBarVisibility = ScrollBarVisibility.IF_NEEDED

    
    private var verticalScrollUnit = VerticalScrollUnit.PIXEL

    
    private var horizontalScrollBarVisibility = ScrollBarVisibility.NEVER

    
    private var horizontalScrollUnit = HorizontalScrollUnit.PIXEL
    private val caretMovedListeners: MutableList<CaretMovedListener> = ArrayList()
    private val scrollingListeners: MutableList<ScrollingListener> = ArrayList()
    private val selectionChangedListeners: MutableList<SelectionChangedListener> = ArrayList()
    private val editModeChangedListeners: MutableList<EditModeChangedListener> = ArrayList()

    /**
     * Creates new instance with default command handler and painter.
     */
    constructor(context: Context?, attrs: AttributeSet?) : super(
        context,
        attrs,
        com.binfile.opener.viewer.reader.pdf.converter.utils.basics.CodeAreaCmdHandlerCodeAreaDefault.createDefaultCodeAreaCommandHandlerFactory(context)
    ) {
        caret =
            com.binfile.opener.viewer.reader.pdf.converter.utils.basics.CodeAreaCaretDefault { notifyCaretChanged() }
        painter =
            com.binfile.opener.viewer.reader.pdf.converter.utils.basics.PaintersDefaultArea(this)
        painter.attach()
        init()
    }

    /**
     * Creates new instance with provided command handler factory method.
     *
     * @param commandHandlerFactory command handler or null for default handler
     */
    constructor(
        context: Context?,
        attrs: AttributeSet?,
        commandHandlerFactory: CodeAreaCommandHandlerFactory?
    ) : super(context, attrs, commandHandlerFactory) {
        caret = com.binfile.opener.viewer.reader.pdf.converter.utils.basics.CodeAreaCaretDefault {
            notifyCaretChanged()
            repaint()
        }
        painter =
            com.binfile.opener.viewer.reader.pdf.converter.utils.basics.PaintersDefaultArea(this)
        painter.attach()
        init()
    }

    private fun init() {
        // TODO: Use swing color instead
//        setBackground(Color.WHITE);
        caret.section = BasicCodeAreaSection.CODE_MATRIX
    }

    
    fun getPainter(): CodeAreaPainter {
        return painter
    }

    fun setPainter(painter: CodeAreaPainter) {
        CodeAreaUtils.requireNonNull(painter)
        this.painter.detach()
        this.painter = painter
        painter.attach()
        reset()
        repaint()
    }

    override fun paintView(g: Canvas?) {
        if (!isInitialized) {
            (this as CapableTextStyle).codeTextStyles = TextStyles.fromPaint(Paint())
        }
        paintComponent(g!!)
    }

    override fun paintComponent(g: Canvas?) {
        painter.paintComponent(g)
    }

    
    override fun getCaret(): com.binfile.opener.viewer.reader.pdf.converter.utils.basics.CodeAreaCaretDefault {
        return caret
    }

    override fun isShowMirrorCursor(): Boolean {
        return showMirrorCursor
    }

    override fun setShowMirrorCursor(showMirrorCursor: Boolean) {
        this.showMirrorCursor = showMirrorCursor
        updateLayout()
    }

    override fun getMinRowPositionLength(): Int {
        return minRowPositionLength
    }

    override fun setMinRowPositionLength(minRowPositionLength: Int) {
        this.minRowPositionLength = minRowPositionLength
        updateLayout()
    }

    override fun getMaxRowPositionLength(): Int {
        return maxRowPositionLength
    }

    override fun setMaxRowPositionLength(maxRowPositionLength: Int) {
        this.maxRowPositionLength = maxRowPositionLength
        updateLayout()
    }

    private val isInitialized: Boolean
        get() = painter.initialized

    override fun getDataPosition(): Long {
        return caret.dataPosition
    }

    override fun getCodeOffset(): Int {
        return caret.codeOffset
    }

    
    override fun getActiveSection(): CodeAreaSection {
        return caret.section
    }

    
    override fun getCaretPosition(): CodeAreaCaretPosition {
        return caret.caretPosition
    }

    override fun setCaretPosition(caretPosition: CodeAreaCaretPosition) {
        caret.setCaretPosition(caretPosition)
        notifyCaretMoved()
    }

    override fun setCaretPosition(dataPosition: Long) {
        caret.setCaretPosition(dataPosition)
        notifyCaretMoved()
    }

    override fun setCaretPosition(dataPosition: Long, codeOffset: Int) {
        caret.setCaretPosition(dataPosition, codeOffset)
        notifyCaretMoved()
    }

    override fun getMouseCursorShape(positionX: Int, positionY: Int): Int {
        return painter.getMouseCursorShape(positionX, positionY)
    }

    
    override fun getCodeCharactersCase(): CodeCharactersCase {
        return codeCharactersCase
    }

    override fun setCodeCharactersCase(codeCharactersCase: CodeCharactersCase) {
        this.codeCharactersCase = codeCharactersCase
        updateLayout()
    }

    override fun resetColors() {
        painter.resetColors()
        repaint()
    }

    
    override fun getViewMode(): CodeAreaViewMode {
        return viewMode
    }

    override fun setViewMode(viewMode: CodeAreaViewMode) {
        if (viewMode != this.viewMode) {
            this.viewMode = viewMode
            when (viewMode) {
                CodeAreaViewMode.CODE_MATRIX -> {
                    getCaret().section = BasicCodeAreaSection.CODE_MATRIX
                    reset()
                    notifyCaretMoved()
                }
                CodeAreaViewMode.TEXT_PREVIEW -> {
                    getCaret().section = BasicCodeAreaSection.TEXT_PREVIEW
                    reset()
                    notifyCaretMoved()
                }
                else -> reset()
            }
            updateLayout()
        }
    }

    
    override fun getCodeType(): CodeType {
        return codeType
    }

    override fun setCodeType(codeType: CodeType) {
        this.codeType = codeType
        updateLayout()
    }

    override fun revealCursor() {
        revealPosition(caret.caretPosition)
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    override fun revealPosition(caretPosition: CodeAreaCaretPosition) {
        if (!isInitialized) {
            // Silently ignore if painter is not yet initialized
            return
        }
        val revealScrollPosition = painter.computeRevealScrollPosition(caretPosition)
        if (revealScrollPosition!!.isPresent) {
            setScrollPosition(revealScrollPosition.get()!!)
        }
    }

    fun revealPosition(dataPosition: Long, dataOffset: Int, section: CodeAreaSection) {
        revealPosition(DefaultCodeAreaCaretPosition(dataPosition, dataOffset, section))
    }

    override fun centerOnCursor() {
        centerOnPosition(caret.caretPosition)
    }

    override fun centerOnPosition(caretPosition: CodeAreaCaretPosition) {
        if (!isInitialized) {
            // Silently ignore if painter is not yet initialized
            return
        }
        val centerOnScrollPosition = painter.computeCenterOnScrollPosition(caretPosition)
        if (centerOnScrollPosition!!.isPresent) {
            setScrollPosition(centerOnScrollPosition.get()!!)
        }
    }

    fun centerOnPosition(dataPosition: Long, dataOffset: Int, section: CodeAreaSection) {
        centerOnPosition(DefaultCodeAreaCaretPosition(dataPosition, dataOffset, section))
    }

    
    override fun mousePositionToClosestCaretPosition(
        positionX: Int,
        positionY: Int,
        overflowMode: CaretOverlapMode
    ): CodeAreaCaretPosition {
        return painter.mousePositionToClosestCaretPosition(positionX, positionY, overflowMode)!!
    }

    
    override fun computeMovePosition(
        position: CodeAreaCaretPosition,
        direction: MovementDirection
    ): CodeAreaCaretPosition {
        return painter.computeMovePosition(position, direction)!!
    }

    
    override fun computeScrolling(
        startPosition: CodeAreaScrollPosition,
        scrollingShift: ScrollingDirection
    ): CodeAreaScrollPosition {
        return painter.computeScrolling(startPosition, scrollingShift)!!
    }

    fun updateScrollBars() {
        painter.updateScrollBars()
        repaint()
    }

    
    override fun getScrollPosition(): CodeAreaScrollPosition {
        return scrollPosition
    }

    override fun setScrollPosition(scrollPosition: CodeAreaScrollPosition) {
        if (scrollPosition != this.scrollPosition) {
            this.scrollPosition.setScrollPosition(scrollPosition)
            painter.scrollPositionModified()
            updateScrollBars()
            notifyScrolled()
        }
    }

    
    override fun getVerticalScrollBarVisibility(): ScrollBarVisibility {
        return verticalScrollBarVisibility
    }

    override fun setVerticalScrollBarVisibility(verticalScrollBarVisibility: ScrollBarVisibility) {
        this.verticalScrollBarVisibility = verticalScrollBarVisibility
        resetPainter()
        updateScrollBars()
    }

    
    override fun getVerticalScrollUnit(): VerticalScrollUnit {
        return verticalScrollUnit
    }

    override fun setVerticalScrollUnit(verticalScrollUnit: VerticalScrollUnit) {
        this.verticalScrollUnit = verticalScrollUnit
        val linePosition = scrollPosition.rowPosition
        if (verticalScrollUnit == VerticalScrollUnit.ROW) {
            scrollPosition.rowOffset = 0
        }
        resetPainter()
        scrollPosition.rowPosition = linePosition
        updateScrollBars()
        notifyScrolled()
    }

    
    override fun getHorizontalScrollBarVisibility(): ScrollBarVisibility {
        return horizontalScrollBarVisibility
    }

    override fun setHorizontalScrollBarVisibility(horizontalScrollBarVisibility: ScrollBarVisibility) {
        this.horizontalScrollBarVisibility = horizontalScrollBarVisibility
        resetPainter()
        updateScrollBars()
    }

    
    override fun getHorizontalScrollUnit(): HorizontalScrollUnit {
        return horizontalScrollUnit
    }

    override fun setHorizontalScrollUnit(horizontalScrollUnit: HorizontalScrollUnit) {
        this.horizontalScrollUnit = horizontalScrollUnit
        val bytePosition = scrollPosition.charPosition
        if (horizontalScrollUnit == HorizontalScrollUnit.CHARACTER) {
            scrollPosition.charOffset = 0
        }
        resetPainter()
        scrollPosition.charPosition = bytePosition
        updateScrollBars()
        notifyScrolled()
    }

    override fun onDraw(g: Canvas) {
        super.onDraw(g)
        if (g == null) {
            return
        }
        if (!isInitialized) {
            codeTextStyles = TextStyles.fromPaint(Paint())
        }
        paintComponent(g)
    }

    override fun reset() {
        resetPainter()
    }

    override fun updateLayout() {
        painter.resetLayout()
    }

    override fun repaint() {
        super.repaint()
    }

    override fun resetPainter() {
        painter.reset()
    }

    protected fun notifyCaretChanged() {
        repaint()
    }

    
    override fun getSelection(): SelectionRange {
        return selection.range
    }

    override fun setSelection(selectionRange: SelectionRange) {
        selection.range = CodeAreaUtils.requireNonNull(selectionRange)
        notifySelectionChanged()
        repaint()
    }

    override fun setSelection(start: Long, end: Long) {
        selection.setSelection(start, end)
        notifySelectionChanged()
        repaint()
    }

    override fun clearSelection() {
        selection.clearSelection()
        notifySelectionChanged()
        repaint()
    }

    override fun hasSelection(): Boolean {
        return !selection.isEmpty
    }

    
    override fun getSelectionHandler(): CodeAreaSelection {
        return selection
    }

    
    override fun getCharset(): Charset {
        return charset
    }

    override fun setCharset(charset: Charset) {
        CodeAreaUtils.requireNonNull(charset)
        this.charset = charset
        reset()
        repaint()
    }

    
    override fun getEditMode(): EditMode {
        return editMode
    }

    override fun isEditable(): Boolean {
        return editMode != EditMode.READ_ONLY
    }

    override fun setEditMode(editMode: EditMode) {
        val changed = editMode != this.editMode
        this.editMode = editMode
        if (changed) {
            for (listener in editModeChangedListeners) {
                listener.editModeChanged(editMode, activeOperation)
            }
            caret.resetBlink()
            notifyCaretChanged()
            repaint()
        }
    }

    
    override fun getActiveOperation(): EditOperation {
        return when (editMode) {
            EditMode.READ_ONLY -> EditOperation.INSERT
            EditMode.INPLACE -> EditOperation.OVERWRITE
            EditMode.CAPPED, EditMode.EXPANDING -> editOperation
            else -> throw CodeAreaUtils.getInvalidTypeException(editMode)
        }
    }

    
    override fun getEditOperation(): EditOperation {
        return editOperation
    }

    override fun setEditOperation(editOperation: EditOperation) {
        val previousOperation = activeOperation
        this.editOperation = editOperation
        val currentOperation = activeOperation
        val changed = previousOperation != currentOperation
        if (changed) {
            for (listener in editModeChangedListeners) {
                listener.editModeChanged(editMode, currentOperation)
            }
            caret.resetBlink()
            notifyCaretChanged()
            repaint()
        }
    }

    
    override fun getClipboardHandlingMode(): ClipboardHandlingMode {
        return clipboardHandlingMode
    }

    override fun setClipboardHandlingMode(clipboardHandlingMode: ClipboardHandlingMode) {
        this.clipboardHandlingMode = clipboardHandlingMode
    }


    override var backgroundPaintMode: BasicBackgroundPaintMode?
        get() = borderPaintMode
        set(borderPaintMode) {
            this.borderPaintMode = borderPaintMode!!
            updateLayout()
        }

    
    override fun getRowWrapping(): RowWrappingMode {
        return rowWrapping
    }

    override fun setRowWrapping(rowWrapping: RowWrappingMode) {
        this.rowWrapping = rowWrapping
        updateLayout()
    }

    override fun getWrappingBytesGroupSize(): Int {
        return wrappingBytesGroupSize
    }

    override fun setWrappingBytesGroupSize(groupSize: Int) {
        wrappingBytesGroupSize = groupSize
        updateLayout()
    }

    override fun getMaxBytesPerRow(): Int {
        return maxBytesPerRow
    }

    override fun setMaxBytesPerRow(maxBytesPerRow: Int) {
        this.maxBytesPerRow = maxBytesPerRow
        updateLayout()
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    
    override fun getBasicColors(): Optional<com.binfile.opener.viewer.reader.pdf.converter.utils.basics.colorPKG.SimpleCodeAreasColor> {
        return if (painter is com.binfile.opener.viewer.reader.pdf.converter.utils.basics.SimpleColorCapableAreaPainters) {
            Optional.of((painter as com.binfile.opener.viewer.reader.pdf.converter.utils.basics.SimpleColorCapableAreaPainters).basicColors)
        } else Optional.empty()
    }

    override fun setBasicColors(colors: com.binfile.opener.viewer.reader.pdf.converter.utils.basics.colorPKG.SimpleCodeAreasColor?) {
        if (painter is com.binfile.opener.viewer.reader.pdf.converter.utils.basics.SimpleColorCapableAreaPainters) {
            (painter as com.binfile.opener.viewer.reader.pdf.converter.utils.basics.SimpleColorCapableAreaPainters).basicColors = colors
        }
    }

    fun notifySelectionChanged() {
        for (listener in selectionChangedListeners) {
            listener.selectionChanged()
        }
    }

    protected fun notifyCaretMoved() {
        for (listener in caretMovedListeners) {
            listener.caretMoved(caret.caretPosition)
        }
    }

    protected fun notifyScrolled() {
        for (listener in scrollingListeners) {
            listener.scrolled()
        }
    }

    override fun addSelectionChangedListener(selectionChangedListener: SelectionChangedListener) {
        selectionChangedListeners.add(selectionChangedListener)
    }

    override fun removeSelectionChangedListener(selectionChangedListener: SelectionChangedListener) {
        selectionChangedListeners.remove(selectionChangedListener)
    }

    override fun addCaretMovedListener(caretMovedListener: CaretMovedListener) {
        caretMovedListeners.add(caretMovedListener)
    }

    override fun removeCaretMovedListener(caretMovedListener: CaretMovedListener) {
        caretMovedListeners.remove(caretMovedListener)
    }

    override fun addScrollingListener(scrollingListener: ScrollingListener) {
        scrollingListeners.add(scrollingListener)
    }

    override fun removeScrollingListener(scrollingListener: ScrollingListener) {
        scrollingListeners.remove(scrollingListener)
    }

    override fun addEditModeChangedListener(editModeChangedListener: EditModeChangedListener) {
        editModeChangedListeners.add(editModeChangedListener)
    }

    override fun removeEditModeChangedListener(editModeChangedListener: EditModeChangedListener) {
        editModeChangedListeners.remove(editModeChangedListener)
    }
}