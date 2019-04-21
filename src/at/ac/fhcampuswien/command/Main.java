package at.ac.fhcampuswien.command;

public class Main
{
    public static void main(String[] args)
    {
    	Document doc = new Document("doc1");
    	
    	MenuItem copyMenuItem = new MenuItem();                
        Command copyCommand = new CopyCommand(doc);
        copyMenuItem.storeCommand(copyCommand);             
        
        MenuItem pasteMenuItem = new MenuItem();
        Command pasteCommand = new PasteCommand(doc);
        pasteMenuItem.storeCommand(pasteCommand);
        
        copyMenuItem.invoke();
        pasteMenuItem.invoke();
    }
}
