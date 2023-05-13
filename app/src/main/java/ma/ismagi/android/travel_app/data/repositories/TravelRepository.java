package ma.ismagi.android.travel_app.data.repositories;


import androidx.lifecycle.LiveData;

import com.android.volley.RequestQueue;
import com.android.volley.Response;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

import ma.ismagi.android.travel_app.data.database.AppDatabase;
import ma.ismagi.android.travel_app.data.database.TravelApp;
import ma.ismagi.android.travel_app.data.database.dao.CountryDao;
import ma.ismagi.android.travel_app.data.database.dao.HotelDao;
import ma.ismagi.android.travel_app.data.database.dao.PlaceToVisitDao;
import ma.ismagi.android.travel_app.data.database.dao.RestaurantDao;
import ma.ismagi.android.travel_app.data.database.entities.CountryEntity;
import ma.ismagi.android.travel_app.data.database.entities.HotelEntity;
import ma.ismagi.android.travel_app.data.database.entities.PlaceToVisitEntity;
import ma.ismagi.android.travel_app.data.database.entities.RestaurantEntity;
import ma.ismagi.android.travel_app.data.models.Country;
import ma.ismagi.android.travel_app.data.remote.ApiService;

public class TravelRepository {
    private CountryDao countryDao;
    private HotelDao hotelDao;
    private RestaurantDao restaurantDao;
    private PlaceToVisitDao placeToVisitDao;
    private ApiService apiService;

    public TravelRepository(RequestQueue requestQueue) {
        AppDatabase database = TravelApp.getDatabase();
        countryDao = database.countryDao();
        hotelDao = database.hotelDao();
        restaurantDao = database.restaurantDao();
        placeToVisitDao = database.placeToVisitDao();

        apiService = new ApiService(requestQueue);
    }

    // Country methods
    public LiveData<List<CountryEntity>> getAllCountries() {
        return countryDao.getAllCountries();
    }

    public CountryEntity getCountryById(int countryId) {
        return countryDao.getCountryById(countryId);
    }

    public void markCountryAsFavorite(int countryId) {
        countryDao.markCountryAsFavorite(countryId);
    }

    public void removeCountryFromFavorites(int countryId) {
        countryDao.removeCountryFromFavorites(countryId);
    }

    public void insertCountry(CountryEntity country) {
        countryDao.insertCountry(country);
    }

    public void deleteCountry(CountryEntity country) {
        countryDao.deleteCountry(country);
    }

    // Hotel methods
    public LiveData<List<HotelEntity>> getAllHotels() {
        return hotelDao.getAllHotels();
    }

    public HotelEntity getHotelById(int hotelId) {
        return hotelDao.getHotelById(hotelId);
    }

    public void insertHotel(HotelEntity hotel) {
        hotelDao.insertHotel(hotel);
    }

    public void deleteHotel(HotelEntity hotel) {
        hotelDao.deleteHotel(hotel);
    }

    public LiveData<List<HotelEntity>> getHotelsByCountryId(int countryId) {
        return hotelDao.getHotelsByCountry(countryId);
    }

    // Restaurant methods

    public LiveData<List<RestaurantEntity>> getAllRestaurants() {
        return restaurantDao.getAllRestaurants();
    }

    public RestaurantEntity getRestaurantById(int restaurantId) {
        return restaurantDao.getRestaurantById(restaurantId);
    }


    // PlaceToVisit methods

    public LiveData<List<PlaceToVisitEntity>> getAllPlacesToVisit(int countryId) {
        return placeToVisitDao.getPlacesToVisitByCountry(countryId);
    }

    public PlaceToVisitEntity getPlaceToVisitById(int placeId) {
        return placeToVisitDao.getPlaceToVisitById(placeId);
    }

    public void markPlaceAsVisited(int placeId, boolean isVisited) {
        PlaceToVisitEntity placeToVisit = placeToVisitDao.getPlaceToVisitById(placeId);
        if (placeToVisit != null) {
            placeToVisit.setVisited(isVisited);
            placeToVisitDao.updatePlaceToVisit(placeToVisit);
        }
    }

//    API


    public void getCountries(Response.Listener<JSONArray> successListener, Response.ErrorListener errorListener) {
        apiService.getCountries(successListener, errorListener);
    }

    public void getCountryById(int id, Response.Listener<JSONObject> successListener, Response.ErrorListener errorListener) {
        apiService.getCountryById(id, successListener, errorListener);
    }

    public void addToFavorites(Country country, Response.Listener<JSONObject> successListener, Response.ErrorListener errorListener) {
        apiService.addToFavorites(country, successListener, errorListener);
    }

    public void removeFromFavorites(Country country, Response.Listener<JSONObject> successListener, Response.ErrorListener errorListener) {
        apiService.removeFromFavorites(country, successListener, errorListener);
    }

    public void markPlaceAsVisited(int placeId, boolean isVisited, Response.Listener<JSONObject> successListener, Response.ErrorListener errorListener) {
        apiService.markPlaceAsVisited(placeId, isVisited, successListener, errorListener);
    }
}


