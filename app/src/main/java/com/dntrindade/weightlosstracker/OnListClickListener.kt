package com.dntrindade.weightlosstracker

import com.dntrindade.weightlosstracker.model.Calc

interface OnListClickListener {

    fun onClick(id: Int, type: String)
    fun onLongClick(position: Int, calc: Calc)

}