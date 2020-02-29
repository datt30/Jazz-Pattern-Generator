package com.monkeyslabteam.www.jazzpatterngenerator.views

/**
 * Created by David Tamayo on 28/02/2020.
 * github: datt30
 */

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.monkeyslabteam.www.jazzpatterngenerator.R
import com.monkeyslabteam.www.jazzpatterngenerator.contracts.JazzPattern
import com.monkeyslabteam.www.jazzpatterngenerator.presenters.JazzPatternPresenter


class JazzPatternView : AppCompatActivity(), JazzPattern.view{

    private var presenter : JazzPattern.presenter? = null
    lateinit var txtElement : TextView
    lateinit var editTextElement : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.jazz_pattern_view)

        txtElement = findViewById(R.id.txtElement)
        editTextElement = findViewById(R.id.editTextElement)

        //set the view to our presenter
        presenter = JazzPatternPresenter(this)
    }

    //our presenter call a method (definite in the interface contract like "knowElementFromModel")
    // to interact with the model and then retrieves the data
    fun saveDataToElement(view: View) {
        presenter!!.knowElementFromModel(editTextElement.text.toString())
    }

    //this function is called when the presenter needs show up some data in the current layout from this view
    override fun showResult(res: String) {
        txtElement.text = res
    }
}
