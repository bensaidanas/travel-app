package ma.ismagi.android.travel_app.data.models;

import java.util.List;

public class Country {
    private int id;
    private String name;
    private String image;
    private boolean favorite;
    private List<Hotel> hotels;
    private List<Restaurant> restaurants;
    private List<PlaceToVisit> placesToVisit;

    public Country(int id, String name, String image, boolean favorite,
                   List<Hotel> hotels, List<Restaurant> restaurants, List<PlaceToVisit> placesToVisit) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.favorite = favorite;
        this.hotels = hotels;
        this.restaurants = restaurants;
        this.placesToVisit = placesToVisit;
    }

    // Getters and setters for the properties

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public List<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    public List<PlaceToVisit> getPlacesToVisit() {
        return placesToVisit;
    }

    public void setPlacesToVisit(List<PlaceToVisit> placesToVisit) {
        this.placesToVisit = placesToVisit;
    }
}

