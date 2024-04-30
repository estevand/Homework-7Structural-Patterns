import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class SongServiceData implements SongService
{
    private Map<Integer, Song> songDatabase;

    public SongServiceData()
    {
        songDatabase = new HashMap<>();
        songDatabase.put(1, new Song(1, "Song: ", "Artist: ", "Album: ", 200));
        songDatabase.put(2, new Song(2, "Song: ", "Artist: ", "Album: ", 220));
        songDatabase.put(3, new Song(3, "Song: ", "Artist: ", "Album: ", 180));
        songDatabase.put(4, new Song(4, "Song: ", "Artist: ", "Album: ", 240));

    }

    @Override
    public Song searchById(Integer songID)
    {
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        return songDatabase.get(songID);
    }

    @Override
    public List<Song> searchByTitle(String title)
    {
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        List<Song> songsWithTitle = new ArrayList<>();
        for (Song song : songDatabase.values()) {
            if (song.getTitle().equals(title)) {
                songsWithTitle.add(song);
            }
        }
        return songsWithTitle;
    }

    @Override
    public List<Song> searchByAlbum(String album)
    {
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        List<Song> songsInAlbum = new ArrayList<>();
        for (Song song : songDatabase.values()) {
            if (song.getAlbum().equals(album)) {
                songsInAlbum.add(song);
            }
        }
        return songsInAlbum;
    }
}
