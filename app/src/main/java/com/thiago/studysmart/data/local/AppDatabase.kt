package com.thiago.studysmart.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.thiago.studysmart.domain.model.Session
import com.thiago.studysmart.domain.model.Subject
import com.thiago.studysmart.domain.model.Task

@Database(
    entities = [Subject::class, Session::class, Task::class],
    version = 2
)
@TypeConverters(ColorListConverter::class)
abstract class AppDatabase: RoomDatabase() {

    abstract fun subjectDao(): SubjectDao
    abstract fun taskDao(): TaskDao
    abstract fun sessionDao(): SessionDao
}