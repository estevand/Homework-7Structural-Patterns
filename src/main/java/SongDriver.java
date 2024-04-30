import java.util.List;

public class SongDriver
{
    public static void main(String[] args)
    {
        SongService songService = new ProxySongService();

        System.out.println(songService.searchById(1));
        System.out.println(songService.searchById(2));


        List<Song> songsWithTitle = songService.searchByTitle("First Song");
        for (Song song : songsWithTitle)
        {
            System.out.println(song);
        }

        List<Song> songsWithTitle2 = songService.searchByTitle("Second Song");
        for (Song song : songsWithTitle2)
        {
            System.out.println(song);
        }


        List<Song> songsInAlbum = songService.searchByAlbum("First Album");
        for (Song song : songsInAlbum)
        {
            System.out.println(song);
        }

        List<Song> songsInAlbum2 = songService.searchByAlbum("Second Album");
        for (Song song : songsInAlbum2)
        {
            System.out.println(song);
        }


    }
}
