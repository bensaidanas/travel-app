package ma.ismagi.android.travel_app.data.database.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import ma.ismagi.android.travel_app.data.database.entities.PlaceToVisitEntity;

@Dao
public interface PlaceToVisitDao {
    @Query("SELECT * FROM placesToVisit WHERE id = :placeId")
    PlaceToVisitEntity getPlaceToVisitById(int placeId);

    @Insert
    void insertPlaceToVisit(PlaceToVisitEntity placeToVisit);

    @Delete
    void deletePlaceToVisit(PlaceToVisitEntity placeToVisit);

    @Query("SELECT * FROM placesToVisit WHERE countryId = :countryId")
    LiveData<List<PlaceToVisitEntity>> getPlacesToVisitByCountry(int countryId);

    @Update
    void updatePlaceToVisit(PlaceToVisitEntity placeToVisit);

}

