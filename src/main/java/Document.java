import java.io.*;
import java.util.*;
public class Document
{
    private final StringBuilder content = new StringBuilder();

    public void addCharacter(char value, CharacterProperties properties)
    {
        content.append(value);
        new Character(value, properties).display();
    }

    public void saveToFile(String fileName)
    {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName)))
        {
            writer.println(content);
            System.out.println("Document saved to file: " + fileName);
        }
        catch (IOException exception)
        {
            exception.printStackTrace();
        }
    }

    public void loadFromFile(String fileName)
    {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName)))
        {
            String line;
            while ((line = reader.readLine()) != null)
            {
                content.append(line);
            }
            System.out.println("Document loaded from file: " + fileName);
        }
        catch (IOException exception)
        {
            exception.printStackTrace();
        }
    }

    public String getContent()
    {
        return content.toString();
    }
}
