package com.sonphil.roundimageview

import android.content.Context
import android.graphics.Outline
import android.support.v7.widget.AppCompatImageView
import android.util.AttributeSet
import android.view.View
import android.view.ViewOutlineProvider

/**
 * Created by Sonphil on 13-10-18.
 */

class RoundImageView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AppCompatImageView(context, attrs, defStyleAttr) {
    init {
        outlineProvider = object : ViewOutlineProvider() {
            override fun getOutline(view: View, outline: Outline) {
                with(view.bounds) {
                    outline.setRoundRect(this, width() / 2f)
                }
            }
        }

        clipToOutline = true
    }
}