package ma.ismagi.android.travel_app.data.database.dao;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

import ma.ismagi.android.travel_app.data.database.entities.PlaceToVisitEntity;

@Dao
public interface PlaceToVisitDao {
    @Query("SELECT * FROM placesToVisit")
    List<PlaceToVisitEntity> getAllPlacesToVisit();

    @Query("SELECT * FROM placesToVisit WHERE id = :placeId")
    PlaceToVisitEntity getPlaceToVisitById(int placeId);
}

