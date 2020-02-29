package com.monkeyslabteam.www.jazzpatterngenerator.presenters

import com.monkeyslabteam.www.jazzpatterngenerator.contracts.JazzPattern
import com.monkeyslabteam.www.jazzpatterngenerator.models.JazzPatternModel

/**
 * Created by David Tamayo on 28/02/2020.
 * github: datt30
 */


class JazzPatternPresenter : JazzPattern.presenter{

    private var view : JazzPattern.view? = null
    private var model : JazzPattern.model? = null

    constructor(view: JazzPattern.view) {
        this.view = view
        this.model = JazzPatternModel(this)
    }

    override fun showResultToView(res: String) {
        this.view?.showResult(res)
    }

    override fun knowElementFromModel(res: String) {
        this.model?.knowElement(res)
    }

}