import java.util.Objects;
public class CharacterProperties
{
    private final String font;
    private final String color;
    private final int size;

    public CharacterProperties(String font, String color, int size)
    {
        this.font = font;
        this.color = color;
        this.size = size;
    }

    public String getFont()
    {
        return font;
    }

    public String getColor()
    {
        return color;
    }

    public int getSize()
    {
        return size;
    }

    @Override
    public boolean equals(Object object)
    {
        if(this == object)
            return true;
        if(!(object instanceof CharacterProperties other))
            return false;
        return font.equals(other.font) && color.equals(other.color) && size == other.size;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(font, color, size);
    }
}
