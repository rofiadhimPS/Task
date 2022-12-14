package com.d121201014.task.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "task_table")
data class Task(
    @PrimaryKey val id: Int,
    val description: String,
    val category: String,
)
