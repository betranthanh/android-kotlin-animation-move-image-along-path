package com.bett.androidkotlinanimationimagealongpath

import android.graphics.Bitmap
import android.graphics.Matrix

/**
 * Created by bett on 8/25/17.
 */

class PlayerDto {

    var image: String? = ""
    var bm: Bitmap? = null
    var offsetX: Float = 0.toFloat()
    var offsetY: Float = 0.toFloat()
    var distance: Float = 0.toFloat()
    var pos = FloatArray(2)
    var tan = FloatArray(2)
    var matrix = Matrix()
}
