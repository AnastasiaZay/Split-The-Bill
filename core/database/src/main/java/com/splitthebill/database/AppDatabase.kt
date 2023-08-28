import androidx.room.Database
import androidx.room.RoomDatabase
import com.splitthebill.database.models.ExampleEntity

@Database(
    version = 1,
    entities = [
        ExampleEntity::class
    ]
)
abstract class AppDatabase : RoomDatabase() {

}