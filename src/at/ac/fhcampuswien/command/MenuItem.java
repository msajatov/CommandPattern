package at.ac.fhcampuswien.command;

/**
* Corresponds to the Invoker
*/
public class MenuItem
{
    Command command;
    
    public void storeCommand(Command command)
    {
        this.command = command;
    }
    
    public void operation()
    {
        command.execute();
    }
}