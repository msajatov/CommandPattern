package at.ac.fhcampuswien.command;

public class PasteCommand extends Command
{
    Document receiverDoc;
    
    PasteCommand(Document doc)
    {
        this.receiverDoc = doc;
    }
    
    public void execute()
    {
    	receiverDoc.paste();
    }
}