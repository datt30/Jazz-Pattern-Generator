package com.monkeyslabteam.www.jazzpatterngenerator.models

/**
 * Created by David Tamayo on 28/02/2020.
 * github: datt30
 */

import com.monkeyslabteam.www.jazzpatterngenerator.contracts.JazzPattern


class JazzPatternModel : JazzPattern.model {

    private var presenter : JazzPattern.presenter? = null
    private var dataElement : String = ""

    constructor(presenter : JazzPattern.presenter){
        this.presenter = presenter
    }

    override fun knowElement(res: String) {  //json, xml, all data what you want to retrieve to the view
        dataElement = "add and Save Element:$res"
        presenter!!.showResultToView(dataElement)
    }

}