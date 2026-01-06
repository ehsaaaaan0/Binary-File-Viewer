
package com.binfile.opener.viewer.reader.pdf.converter.utils

import android.graphics.Canvas

/**
 * Code area swing control.

 */

interface ControlCodeAndroidAreas {
    /**
     * Paints the main component.
     */
    fun paintComponent(g: Canvas?)

    /**
     * Rebuilds colors after UIManager change.
     */
    fun resetColors()

    /**
     * Resets painter state for new painting.
     */
    fun reset()

    /**
     * Requests update of the component layout.
     *
     * Notifies code area, that change of parameters will affect layout and it
     * should be recomputed and updated if necessary.
     */
    fun updateLayout()
}