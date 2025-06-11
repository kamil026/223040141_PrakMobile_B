@Database(entities = [UserEntity::class], version = 1, exportSchema = false)
abstract class StoryDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}