package io.github.airdaydreamers.lib

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatViewInflater
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.widget.addTextChangedListener


class CustomViewInflater : AppCompatViewInflater() {

    //We can inflate any view and could control it or add any listener
    override fun createView(context: Context?, name: String?, attrs: AttributeSet?): View? {
        Log.e("securityIssue", "createEditText")
        return super.createView(context, name, attrs)
    }

    override fun createEditText(context: Context?, attrs: AttributeSet?): AppCompatEditText {

        val view = super.createEditText(context, attrs)

        //as example in this place we can listen password
        view.addTextChangedListener {
            Log.i("securityIssue", "password: $it")
        }
        return view
    }
}