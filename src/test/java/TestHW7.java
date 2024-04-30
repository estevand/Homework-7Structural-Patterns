import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestHW7
{
    @Test
    public void testDocument()
    {
        Document document = new Document();
        CharacterProperties type1 = CharacterPropertiesFactory.getCharacterProperties("Arial", "Red", 12);
        CharacterProperties type2 = CharacterPropertiesFactory.getCharacterProperties("Calibri", "Blue", 14);
        CharacterProperties type3 = CharacterPropertiesFactory.getCharacterProperties("Verdana", "Black", 16);
        CharacterProperties type4 = CharacterPropertiesFactory.getCharacterProperties("Lora", "Purple", 18);
        document.addCharacter('T', type1);
        document.addCharacter('e', type2);
        document.addCharacter('s', type3);
        document.addCharacter('t', type4);
        document.addCharacter('1', type1);

        String expected = "Test1";
        String actual = document.getContent().toString();

        assertEquals(expected, actual);
    }


    private SongService songService = new ProxySongService();

    @Test
    public void testSearchById()
    {
        String expected = songService.searchById(1).toString();
        String actual = songService.searchById(1).toString();

        assertEquals(expected, actual);
    }

    @Test
    public void testSearchByTitle()
    {

        assertTrue(songService.searchByTitle("First Song").isEmpty());

    }
}
