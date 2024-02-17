package com.sagarannaldas.realmimplementation

import android.app.Application
import com.sagarannaldas.realmimplementation.models.Address
import com.sagarannaldas.realmimplementation.models.Course
import com.sagarannaldas.realmimplementation.models.Student
import com.sagarannaldas.realmimplementation.models.Teacher
import io.realm.kotlin.Realm
import io.realm.kotlin.RealmConfiguration

class MyApp: Application() {

    companion object {
        lateinit var realm: Realm
    }

    override fun onCreate() {
        super.onCreate()
        realm = Realm.open(
            configuration = RealmConfiguration.create(
                schema = setOf(
                    Address::class,
                    Teacher::class,
                    Course::class,
                    Student::class,
                )
            )
        )
    }
}