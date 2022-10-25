package sg.mirobotic.transport.data.local.dao

import androidx.room.*
import sg.mirobotic.transport.data.local.Category

@Dao
interface CategoryDao {

    @Query("SELECT * FROM Category")
    suspend fun getAll(): List<Category>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(categories: List<Category>)

    @Delete
    suspend fun delete(category: Category)

    @Query("DELETE FROM Category")
    suspend fun deleteAll()

}