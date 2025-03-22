package com.zcg.zcgtoast

import android.content.Context
import android.widget.Toast
/**
 * 项目名称：ZCGTools
 * 描述：
 * 创建人：ZCG
 * 创建时间：2025/3/22
 */
class ZcgToast {


    fun showShortToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    // 长时间吐司
    fun showLongToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }

}