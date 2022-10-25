package sg.mirobotic.transport.data.local.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import sg.mirobotic.transport.data.local.Category
import sg.mirobotic.transport.data.local.dao.CategoryDao

@Database(entities = [Category::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun categoryDao(): CategoryDao

    companion object {
        private var instance: AppDatabase? = null

        @Synchronized
        fun getInstance(ctx: Context): AppDatabase {
            if(instance == null){
                instance = Room.databaseBuilder(ctx.applicationContext, AppDatabase::class.java,
                    "wow.db")
                    .fallbackToDestructiveMigration()
                    .addCallback(roomCallback)
                    .allowMainThreadQueries()
                    .build()
            }
            return instance!!
        }

        private val roomCallback = object : Callback() {
            override fun onCreate(db: SupportSQLiteDatabase) {
                super.onCreate(db)
            }
        }
    }

}