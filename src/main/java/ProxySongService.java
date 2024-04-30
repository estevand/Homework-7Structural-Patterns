import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class ProxySongService implements SongService
{
    private SongServiceData songServiceData;
    private Map<Integer, Song> cache;

    public ProxySongService()
    {
        songServiceData = new SongServiceData();
        cache = new HashMap<>();
    }

    @Override
    public Song searchById(Integer songID)
    {
        if (cache.containsKey(songID))
        {
            System.out.println("Getting song metadata: ");
            return cache.get(songID);
        }
        else
        {
            System.out.println("The song's ID: ");
            Song song = songServiceData.searchById(songID);
            cache.put(songID, song);
            return song;
        }
    }

    @Override
    public List<Song> searchByTitle(String title)
    {
        System.out.println("Searching for songs by title: " + title);
        return songServiceData.searchByTitle(title);
    }

    @Override
    public List<Song> searchByAlbum(String album)
    {
        System.out.println("Searching for songs by album: " + album);
        return songServiceData.searchByAlbum(album);
    }
}
