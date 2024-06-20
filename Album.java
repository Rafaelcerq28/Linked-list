package monday;
/** * @author Eugene */
import java.sql.Date;

public class Album {
    private int albumId;
    private int artistId;
    private String name;
    private String publisher;
    private Date releaseDate;

    public Album(int albumId, int artistId, String name, String publisher, Date releaseDate) {
        this.albumId = albumId;
        this.artistId = artistId;
        this.name = name;
        this.releaseDate = releaseDate;
    }

    // Getters and setters for all fields
    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    @Override
    public String toString() {
        return "Album{" +
                "albumId=" + albumId +
                ", artistId=" + artistId +
                ", name='" + name + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }


}

