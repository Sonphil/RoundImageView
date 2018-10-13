package com.sonphil.roundimageview

import android.graphics.Rect
import android.view.View

/**
 * Created by Sonphil on 13-10-18.
 */
 
internal val View.bounds: Rect
    get() {
        val widthWithoutPadding = width - paddingLeft - paddingRight
        val heightWithoutPadding = height - paddingTop - paddingBottom

        /** Diameter of the circular view **/
        val diameter = Math.min(widthWithoutPadding, heightWithoutPadding)

        /** The distance between x = 0 and the left side **/
        val left = paddingLeft + ((widthWithoutPadding - diameter) / 2)

        /** The distance between x = 0 and the right side **/
        val right = left + diameter

        /** The distance between y = 0 and the top side **/
        val top = paddingTop + ((heightWithoutPadding - diameter) / 2)

        /** The distance between y = 0 and the bottom side **/
        val bottom = top + diameter

        return Rect(left, top, right, bottom)
    }