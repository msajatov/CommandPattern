package at.ac.fhcampuswien.command;

public class MenuItem
{
    Command command;
    
    public void storeCommand(Command command)
    {
        this.command = command;
    }
    
    public void invoke()
    {
        command.execute();
    }
}