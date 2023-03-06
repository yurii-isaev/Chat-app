package project.chat

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Item::class], version = 1)
abstract class InstanceDatabase : RoomDatabase() {

    abstract fun getDao(): Dao

    companion object {
        @JvmStatic
        fun getInstance(ctx: Context): InstanceDatabase {
            return Room
                .databaseBuilder(ctx.applicationContext, InstanceDatabase::class.java, "chat.db")
                .build()
        }
    }
}