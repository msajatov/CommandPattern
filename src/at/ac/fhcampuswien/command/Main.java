package at.ac.fhcampuswien.command;

public class Main
{
    public static void main(String[] args)
    {
    	Document receiver = new Document("doc1");
    	
    	MenuItem copyInvoker = new MenuItem();                
        Command command = new CopyCommand(receiver);
        copyInvoker.storeCommand(command);     
        
        // at some point later
        copyInvoker.operation();
        
        MenuItem pasteInvoker = new MenuItem();
        command = new PasteCommand(receiver);
        pasteInvoker.storeCommand(command);
        
        // at some point later
        pasteInvoker.operation();
    }
}
