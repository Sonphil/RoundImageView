package com.sonphil.roundimageview

import android.content.Context
import android.graphics.Outline
import android.util.AttributeSet
import android.view.View
import android.view.ViewOutlineProvider
import android.widget.ImageView

/**
 * Created by Sonphil on 13-10-18.
 */

class RoundImageView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ImageView(context, attrs, defStyleAttr) {
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