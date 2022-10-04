package com.dntrindade.weightlosstracker

import android.app.Application
import com.dntrindade.weightlosstracker.model.AppDatabase

class App : Application() {

    lateinit var db: AppDatabase

    override fun onCreate() {
        super.onCreate()
        db = AppDatabase.getDatabase(this)
    }
}