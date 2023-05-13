package ma.ismagi.android.travel_app.data.database.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import ma.ismagi.android.travel_app.data.database.entities.CountryEntity;

@Dao
public interface CountryDao {
    @Query("SELECT * FROM countries")
    LiveData<List<CountryEntity>> getAllCountries();

    @Query("SELECT * FROM countries WHERE id = :countryId")
    CountryEntity getCountryById(int countryId);

    @Query("UPDATE countries SET favorite = 1 WHERE id = :countryId")
    void markCountryAsFavorite(int countryId);

    @Query("UPDATE countries SET favorite = 0 WHERE id = :countryId")
    void removeCountryFromFavorites(int countryId);

    @Insert
    void insertCountry(CountryEntity country);

    @Delete
    void deleteCountry(CountryEntity country);
}

