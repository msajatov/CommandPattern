package at.ac.fhcampuswien.command;

/**
* Corresponds to the ConcreteCommand
*/
public class PasteCommand extends Command
{
    Document receiver;
    
    PasteCommand(Document receiver)
    {
        this.receiver = receiver;
    }
    
    public void execute()
    {
        receiver.paste();
    }
}