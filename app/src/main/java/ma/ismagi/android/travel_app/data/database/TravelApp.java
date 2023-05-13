package ma.ismagi.android.travel_app.data.database;

import android.app.Application;

import androidx.room.Room;

public class TravelApp extends Application {
    private static AppDatabase database;

    @Override
    public void onCreate() {
        super.onCreate();

        database = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "travel_db")
                .build();
    }

    public static AppDatabase getDatabase() {
        return database;
    }
}

