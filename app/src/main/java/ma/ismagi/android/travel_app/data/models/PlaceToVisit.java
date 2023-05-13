package ma.ismagi.android.travel_app.data.models;

public class PlaceToVisit {
    private int id;
    private String name;
    private String image;
    private String city;
    private String address;
    private double rating;
    private boolean isVisited;

    public PlaceToVisit(int id, String name, String image, String city, String address, double rating, boolean isVisited) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.city = city;
        this.address = address;
        this.rating = rating;
        this.isVisited = isVisited;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }
}

