package ma.ismagi.android.travel_app.data.database.entities;


import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "restaurants",
        foreignKeys = @ForeignKey(entity = CountryEntity.class,
                parentColumns = "id",
                childColumns = "countryId",
                onDelete = ForeignKey.CASCADE))
public class RestaurantEntity {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private int countryId;
    private String name;
    private String image;
    private String city;
    private String address;
    private float rating;

    public RestaurantEntity(int countryId, String name, String image, String city, String address, float rating) {
        this.countryId = countryId;
        this.name = name;
        this.image = image;
        this.city = city;
        this.address = address;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
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

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
