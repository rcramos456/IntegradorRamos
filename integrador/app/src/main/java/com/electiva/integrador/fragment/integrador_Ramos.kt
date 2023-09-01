package com.electiva.integrador.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.electiva.integrador.R

class integrador_Ramos : Fragment() {

    private lateinit var v:View
    private lateinit var button: Button
    private lateinit var editText1:EditText
    private lateinit var editText2:EditText
    private lateinit var textView: TextView
    private lateinit var viewModel:IntegradorRamosViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v= inflater.inflate(R.layout.fragment_integrador__ramos, container, false)
        viewModel = ViewModelProvider(this)[IntegradorRamosViewModel::class.java]

        button=v.findViewById(R.id.button)
        editText1=v.findViewById(R.id.editText1)
        editText2=v.findViewById(R.id.editText2)
        textView=v.findViewById(R.id.textView)
        return v
    }

    override fun onStart() {
        super.onStart()

        val inputText1=editText1.text.toString()
        val inputText2=editText2.text.toString()
        val comparisionResult= viewModel.characterString(inputText1,inputText2)
        textView.text=comparisionResult

    }

}