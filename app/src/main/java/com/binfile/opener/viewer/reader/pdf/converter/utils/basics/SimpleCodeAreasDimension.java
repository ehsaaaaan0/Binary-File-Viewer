
package com.binfile.opener.viewer.reader.pdf.converter.utils.basics;

import android.graphics.Rect;




import org.exbin.bined.basic.BasicCodeAreaZone;



public class SimpleCodeAreasDimension {

    private int scrollPanelX;
    private int scrollPanelY;
    private int scrollPanelWidth;
    private int scrollPanelHeight;
    private int verticalScrollBarSize;
    private int horizontalScrollBarSize;
    private int dataViewWidth;
    private int dataViewHeight;
    private int lastCharOffset;
    private int lastRowOffset;

    private int headerAreaHeight;
    private int rowPositionAreaWidth;
    private int rowsPerRect;
    private int rowsPerPage;
    private int charactersPerPage;
    private int charactersPerRect;

    
    private final Rect componentRectangle = new Rect();
    
    private final Rect mainAreaRectangle = new Rect();
    
    private final Rect headerAreaRectangle = new Rect();
    
    private final Rect rowPositionAreaRectangle = new Rect();
    
    private final Rect scrollPanelRectangle = new Rect();
    
    private final Rect dataViewRectangle = new Rect();
    
    private final Rect dataViewInnerRectangle = new Rect();

    public void recomputeSizes(SimpleCodeAreasMetric metrics, int componentX, int componentY, int componentWidth, int componentHeight, int rowPositionLength, int verticalScrollBarSize, int horizontalScrollBarSize) {
        modifyRect(componentRectangle, componentX, componentY, componentWidth, componentHeight);
        this.verticalScrollBarSize = verticalScrollBarSize;
        this.horizontalScrollBarSize = horizontalScrollBarSize;
        rowPositionAreaWidth = metrics.getCharacterWidth() * (rowPositionLength + 1);
        headerAreaHeight = metrics.getFontHeight() + metrics.getFontHeight() / 4;

        scrollPanelX = componentX + rowPositionAreaWidth;
        scrollPanelY = componentY + headerAreaHeight;
        scrollPanelWidth = componentWidth - rowPositionAreaWidth;
        scrollPanelHeight = componentHeight - headerAreaHeight;
        dataViewWidth = scrollPanelWidth - verticalScrollBarSize;
        dataViewHeight = scrollPanelHeight - horizontalScrollBarSize;
        charactersPerRect = computeCharactersPerRectangle(metrics);
        charactersPerPage = computeCharactersPerPage(metrics);
        rowsPerRect = computeRowsPerRectangle(metrics);
        rowsPerPage = computeRowsPerPage(metrics);
        lastCharOffset = metrics.isInitialized() ? dataViewWidth % metrics.getCharacterWidth() : 0;
        lastRowOffset = metrics.isInitialized() ? dataViewHeight % metrics.getRowHeight() : 0;

        boolean availableWidth = rowPositionAreaWidth + verticalScrollBarSize <= componentWidth;
        boolean availableHeight = scrollPanelY + horizontalScrollBarSize <= componentHeight;

        if (availableWidth && availableHeight) {
            modifyRect(mainAreaRectangle, componentX + rowPositionAreaWidth, scrollPanelY, componentWidth - rowPositionAreaWidth - getVerticalScrollBarSize(), componentHeight - scrollPanelY - getHorizontalScrollBarSize());
        } else {
            mainAreaRectangle.setEmpty();
        }
        if (availableWidth) {
            modifyRect(headerAreaRectangle, componentX + rowPositionAreaWidth, componentY, componentWidth - rowPositionAreaWidth - getVerticalScrollBarSize(), headerAreaHeight);
        } else {
            headerAreaRectangle.setEmpty();
        }
        if (availableHeight) {
            modifyRect(rowPositionAreaRectangle, componentX, scrollPanelY, rowPositionAreaWidth, componentHeight - scrollPanelY - getHorizontalScrollBarSize());
        } else {
            rowPositionAreaRectangle.setEmpty();
        }

        modifyRect(scrollPanelRectangle, scrollPanelX, scrollPanelY, scrollPanelWidth, scrollPanelHeight);
        modifyRect(dataViewRectangle, scrollPanelX, scrollPanelY, Math.max(dataViewWidth, 0), Math.max(dataViewHeight, 0));
        modifyRect(dataViewInnerRectangle, 0, 0, Math.max(dataViewWidth, 0), Math.max(dataViewHeight, 0));
    }

    
    public BasicCodeAreaZone getPositionZone(int positionX, int positionY) {
        if (positionY <= scrollPanelY) {
            if (positionX < rowPositionAreaWidth) {
                return BasicCodeAreaZone.TOP_LEFT_CORNER;
            } else {
                return BasicCodeAreaZone.HEADER;
            }
        }

        if (positionX < rowPositionAreaWidth) {
            if (positionY >= scrollPanelY + scrollPanelHeight) {
                return BasicCodeAreaZone.BOTTOM_LEFT_CORNER;
            } else {
                return BasicCodeAreaZone.ROW_POSITIONS;
            }
        }

        if (positionX >= scrollPanelX + scrollPanelWidth && positionY < scrollPanelY + scrollPanelHeight) {
            return BasicCodeAreaZone.VERTICAL_SCROLLBAR;
        }

        if (positionY >= scrollPanelY + scrollPanelHeight) {
            if (positionX >= scrollPanelX + scrollPanelWidth) {
                return BasicCodeAreaZone.SCROLLBAR_CORNER;
            } else {
                return BasicCodeAreaZone.HORIZONTAL_SCROLLBAR;
            }
        }

        return BasicCodeAreaZone.CODE_AREA;
    }

    private int computeCharactersPerRectangle(SimpleCodeAreasMetric metrics) {
        int characterWidth = metrics.getCharacterWidth();
        return characterWidth == 0 ? 0 : (dataViewWidth + characterWidth - 1) / characterWidth;
    }

    private int computeCharactersPerPage(SimpleCodeAreasMetric metrics) {
        int characterWidth = metrics.getCharacterWidth();
        return characterWidth == 0 ? 0 : dataViewWidth / characterWidth;
    }

    private int computeRowsPerRectangle(SimpleCodeAreasMetric metrics) {
        int rowHeight = metrics.getRowHeight();
        return rowHeight == 0 ? 0 : (dataViewHeight + rowHeight - 1) / rowHeight;
    }

    private int computeRowsPerPage(SimpleCodeAreasMetric metrics) {
        int rowHeight = metrics.getRowHeight();
        return rowHeight == 0 ? 0 : dataViewHeight / rowHeight;
    }

    public int getScrollPanelX() {
        return scrollPanelX;
    }

    public int getScrollPanelY() {
        return scrollPanelY;
    }

    public int getVerticalScrollBarSize() {
        return verticalScrollBarSize;
    }

    public int getHorizontalScrollBarSize() {
        return horizontalScrollBarSize;
    }

    public int getScrollPanelWidth() {
        return scrollPanelWidth;
    }

    public int getScrollPanelHeight() {
        return scrollPanelHeight;
    }

    public int getDataViewWidth() {
        return dataViewWidth;
    }

    public int getDataViewHeight() {
        return dataViewHeight;
    }

    public int getHeaderAreaHeight() {
        return headerAreaHeight;
    }

    public int getRowPositionAreaWidth() {
        return rowPositionAreaWidth;
    }

    public int getRowsPerRect() {
        return rowsPerRect;
    }

    public int getCharactersPerRect() {
        return charactersPerRect;
    }

    public int getCharactersPerPage() {
        return charactersPerPage;
    }

    public int getRowsPerPage() {
        return rowsPerPage;
    }

    public int getLastCharOffset() {
        return lastCharOffset;
    }

    public int getLastRowOffset() {
        return lastRowOffset;
    }

    
    public Rect getComponentRectangle() {
        return componentRectangle;
    }

    
    public Rect getMainAreaRectangle() {
        return mainAreaRectangle;
    }

    
    public Rect getScrollPanelRectangle() {
        return scrollPanelRectangle;
    }

    
    public Rect getDataViewRectangle() {
        return dataViewRectangle;
    }

    
    public Rect getDataViewInnerRectangle() {
        return dataViewInnerRectangle;
    }

    
    public Rect getHeaderAreaRectangle() {
        return headerAreaRectangle;
    }

    
    public Rect getRowPositionAreaRectangle() {
        return rowPositionAreaRectangle;
    }

    private static void modifyRect(Rect rect, int x, int y, int width, int height) {
        rect.set(x, y, x + width, y + height);
    }
}
