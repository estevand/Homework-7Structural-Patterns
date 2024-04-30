public class TextEditor
{
    public static void main(String[] args)
    {
        Document document = new Document();

        CharacterProperties type1 = CharacterPropertiesFactory.getCharacterProperties("Arial", "Red", 12);
        CharacterProperties type2 = CharacterPropertiesFactory.getCharacterProperties("Calibri", "Blue", 14);
        CharacterProperties type3 = CharacterPropertiesFactory.getCharacterProperties("Verdana", "Black", 16);
        CharacterProperties type4 = CharacterPropertiesFactory.getCharacterProperties("Lora", "Purple", 18);

        document.addCharacter('H', type1);
        document.addCharacter('e', type1);
        document.addCharacter('l', type1);
        document.addCharacter('l', type1);
        document.addCharacter('o', type2);
        document.addCharacter('W', type2);
        document.addCharacter('o', type2);
        document.addCharacter('r', type2);
        document.addCharacter('l', type3);
        document.addCharacter('d', type3);
        document.addCharacter('C', type3);
        document.addCharacter('S', type3);
        document.addCharacter('4', type3);
        document.addCharacter('8', type4);
        document.addCharacter('0', type4);
        document.addCharacter('0', type4);

        document.addCharacter(' ', type1);


        document.addCharacter('H', type4);
        document.addCharacter('e', type4);
        document.addCharacter('l', type4);
        document.addCharacter('l', type4);
        document.addCharacter('o', type3);
        document.addCharacter('W', type3);
        document.addCharacter('o', type3);
        document.addCharacter('r', type3);
        document.addCharacter('l', type2);
        document.addCharacter('d', type2);
        document.addCharacter('C', type2);
        document.addCharacter('S', type2);
        document.addCharacter('4', type1);
        document.addCharacter('8', type1);
        document.addCharacter('0', type1);
        document.addCharacter('0', type1);

        document.saveToFile("document.txt");

        Document loadedDocument = new Document();
        loadedDocument.loadFromFile("document.txt");

        System.out.println("Document content:");
        System.out.println(document.getContent());
    }
}
