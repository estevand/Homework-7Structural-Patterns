public class Song
{
    private Integer id;
    private String title;
    private String artist;
    private String album;
    private int duration;

    public Song(Integer id, String title, String artist, String album, int duration)
    {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
    }

    public String getTitle()
    {
        return title;
    }

    public String getAlbum()
    {
        return album;
    }

}
