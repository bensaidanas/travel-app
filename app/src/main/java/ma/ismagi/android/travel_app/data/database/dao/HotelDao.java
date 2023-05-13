package ma.ismagi.android.travel_app.data.database.dao;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

import ma.ismagi.android.travel_app.data.database.entities.HotelEntity;

@Dao
public interface HotelDao {
    @Query("SELECT * FROM hotels")
    List<HotelEntity> getAllHotels();

    @Query("SELECT * FROM hotels WHERE id = :hotelId")
    HotelEntity getHotelById(int hotelId);
}

