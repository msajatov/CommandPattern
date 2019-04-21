package at.ac.fhcampuswien.command;

public class CopyCommand extends Command
{
    Document receiverDoc;
    
    public CopyCommand(Document doc)
    {
        this.receiverDoc = doc;
    }
    
    public void execute()
    {
    	receiverDoc.copy();
    }
}