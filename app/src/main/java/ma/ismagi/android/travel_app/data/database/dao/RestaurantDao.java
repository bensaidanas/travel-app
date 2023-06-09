package ma.ismagi.android.travel_app.data.database.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import ma.ismagi.android.travel_app.data.database.entities.RestaurantEntity;

@Dao
public interface RestaurantDao {
    @Query("SELECT * FROM restaurants")
    LiveData<List<RestaurantEntity>> getAllRestaurants();

    @Query("SELECT * FROM restaurants WHERE id = :restaurantId")
    RestaurantEntity getRestaurantById(int restaurantId);

    @Insert
    void insertCountry(RestaurantEntity country);

    @Delete
    void deleteCountry(RestaurantEntity country);

    @Query("SELECT * FROM hotels WHERE countryId = :countryId")
    LiveData<List<RestaurantEntity>> getRestaurantsByCountry(int countryId);
}

