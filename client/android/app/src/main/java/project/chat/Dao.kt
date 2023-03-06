package project.chat

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface Dao {

    @Insert
    fun insert(item: Item)

    @Query("SELECT * FROM Items")
    fun getItemList(): Flow<List<Item>>
}