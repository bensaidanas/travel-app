package ma.ismagi.android.travel_app.ui.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.android.volley.RequestQueue;

import java.util.List;

import ma.ismagi.android.travel_app.data.database.entities.CountryEntity;
import ma.ismagi.android.travel_app.data.database.entities.HotelEntity;
import ma.ismagi.android.travel_app.data.database.entities.PlaceToVisitEntity;
import ma.ismagi.android.travel_app.data.database.entities.RestaurantEntity;
import ma.ismagi.android.travel_app.data.repositories.TravelRepository;

public class TravelViewModel extends ViewModel {
    private TravelRepository repository;

    public TravelViewModel(RequestQueue requestQueue) {
        repository = new TravelRepository(requestQueue);
    }

    // Country methods
    public LiveData<List<CountryEntity>> getAllCountries() {
        return repository.getAllCountries();
    }

    public CountryEntity getCountryById(int countryId) {
        return repository.getCountryById(countryId);
    }

    public void markCountryAsFavorite(int countryId) {
        repository.markCountryAsFavorite(countryId);
    }

    public void removeCountryFromFavorites(int countryId) {
        repository.removeCountryFromFavorites(countryId);
    }

    public void insertCountry(CountryEntity country) {
        repository.insertCountry(country);
    }

    public void deleteCountry(CountryEntity country) {
        repository.deleteCountry(country);
    }

    // Hotel methods
    public LiveData<List<HotelEntity>> getAllHotels() {
        return repository.getAllHotels();
    }

    public HotelEntity getHotelById(int hotelId) {
        return repository.getHotelById(hotelId);
    }

    public void insertHotel(HotelEntity hotel) {
        repository.insertHotel(hotel);
    }

    public void deleteHotel(HotelEntity hotel) {
        repository.deleteHotel(hotel);
    }

    public LiveData<List<HotelEntity>> getHotelsByCountryId(int countryId) {
        return repository.getHotelsByCountryId(countryId);
    }

    // Restaurant methods


    // PlaceToVisit methods
    public LiveData<List<PlaceToVisitEntity>> getAllPlacesToVisit(int countryId) {
        return repository.getAllPlacesToVisit(countryId);
    }

    public PlaceToVisitEntity getPlaceToVisitById(int placeId) {
        return repository.getPlaceToVisitById(placeId);
    }



    public void markPlaceAsVisited(int placeId, boolean isVisited) {
        repository.markPlaceAsVisited(placeId, isVisited);
    }
}

