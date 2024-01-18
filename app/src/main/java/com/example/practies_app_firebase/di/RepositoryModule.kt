package com.example.practies_app_firebase.di

import com.example.practies_app_firebase.repository.Repository
import com.example.practies_app_firebase.repository.RepositoryImp
import com.google.firebase.firestore.FirebaseFirestore
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
object RepositoryModule {

    @Provides
    @Singleton
    fun provideNoteRepository(
        datbase:FirebaseFirestore
    ):Repository{
        return RepositoryImp(datbase)
    }
}