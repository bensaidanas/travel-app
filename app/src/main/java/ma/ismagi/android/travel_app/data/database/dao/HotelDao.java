package ma.ismagi.android.travel_app.data.database.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import ma.ismagi.android.travel_app.data.database.entities.HotelEntity;

@Dao
public interface HotelDao {
    @Query("SELECT * FROM hotels")
    LiveData<List<HotelEntity>> getAllHotels();

    @Query("SELECT * FROM hotels WHERE id = :hotelId")
    HotelEntity getHotelById(int hotelId);

    @Insert
    void insertHotel(HotelEntity hotel);

    @Delete
    void deleteHotel(HotelEntity hotel);

    @Query("SELECT * FROM hotels WHERE countryId = :countryId")
    LiveData<List<HotelEntity>> getHotelsByCountry(int countryId);
}

