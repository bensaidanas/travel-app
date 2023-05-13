package ma.ismagi.android.travel_app.data.database.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "countries")
public class CountryEntity {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String name;
    private String image;
    private boolean favorite;

    public CountryEntity(int id, String name, String image, boolean favorite) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.favorite = favorite;
    }

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
}
