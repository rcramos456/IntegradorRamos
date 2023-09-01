package com.electiva.integrador.fragment

import androidx.lifecycle.ViewModel

class IntegradorRamosViewModel : ViewModel() {

    fun characterString(text1:String,text2:String):String{

        return if (text1 == text2) {
            "igual"
        }
        else {
            "distintos"
        }

    }


}