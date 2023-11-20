package com.thiago.studysmart.di

import com.thiago.studysmart.data.repository.SessionRepositoryImpl
import com.thiago.studysmart.data.repository.SubjectRepositoryImpl
import com.thiago.studysmart.data.repository.TaskRepositoryImpl
import com.thiago.studysmart.domain.repository.SessionRepository
import com.thiago.studysmart.domain.repository.SubjectRepository
import com.thiago.studysmart.domain.repository.TaskRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun bindSubjectRepository(
        impl: SubjectRepositoryImpl
    ): SubjectRepository

    @Singleton
    @Binds
    abstract fun bindTaskRepository(
        impl: TaskRepositoryImpl
    ): TaskRepository

    @Singleton
    @Binds
    abstract fun bindSessionRepository(
        impl: SessionRepositoryImpl
    ): SessionRepository
}