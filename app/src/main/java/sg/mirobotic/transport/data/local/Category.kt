package sg.mirobotic.transport.data.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Category(
    @PrimaryKey(autoGenerate = false) val id: Int,
    @ColumnInfo(name = "name") var name: String,
    @ColumnInfo(name = "description") val description: String
    )
