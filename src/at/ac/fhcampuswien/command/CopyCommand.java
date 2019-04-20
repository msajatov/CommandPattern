package at.ac.fhcampuswien.command;

/**
* Corresponds to the ConcreteCommand
*/
public class CopyCommand extends Command
{
    Document receiver;
    
    public CopyCommand(Document receiver)
    {
        this.receiver = receiver;
    }
    
    public void execute()
    {
        receiver.copy();
    }
}