package com.myapp.businesscardapp

import android.app.Application
import com.myapp.businesscardapp.data.AppDatabase
import com.myapp.businesscardapp.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this)}
    val repository by lazy { BusinessCardRepository(database.businessDao())}
}