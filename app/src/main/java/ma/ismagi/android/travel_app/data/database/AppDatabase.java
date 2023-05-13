package ma.ismagi.android.travel_app.data.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import ma.ismagi.android.travel_app.data.database.dao.CountryDao;
import ma.ismagi.android.travel_app.data.database.dao.HotelDao;
import ma.ismagi.android.travel_app.data.database.dao.PlaceToVisitDao;
import ma.ismagi.android.travel_app.data.database.dao.RestaurantDao;
import ma.ismagi.android.travel_app.data.database.entities.CountryEntity;
import ma.ismagi.android.travel_app.data.database.entities.HotelEntity;
import ma.ismagi.android.travel_app.data.database.entities.PlaceToVisitEntity;
import ma.ismagi.android.travel_app.data.database.entities.RestaurantEntity;

@Database(entities = {CountryEntity.class, HotelEntity.class, RestaurantEntity.class, PlaceToVisitEntity.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract CountryDao countryDao();
    public abstract HotelDao hotelDao();
    public abstract RestaurantDao restaurantDao();
    public abstract PlaceToVisitDao placeToVisitDao();
}

