package com.monkeyslabteam.www.jazzpatterngenerator.contracts


/**
 * Created by David Tamayo on 28/02/2020.
 * github: datt30
 */

//Our contracts are a good way to follow the implementation of our architecture.
// we will define here all those functions that we will need for each of our mvp layers.
interface JazzPattern {

    interface view{
        fun showResult(res:String)
    }

    interface presenter{
        fun showResultToView(res:String)
        fun knowElementFromModel(res:String)
    }

    interface model{
        fun knowElement(res:String)
    }

}