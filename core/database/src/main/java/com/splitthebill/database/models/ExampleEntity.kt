package com.splitthebill.database.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ExampleEntity(
    @PrimaryKey val exampleData: String
)