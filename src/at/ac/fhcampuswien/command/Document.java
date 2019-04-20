package at.ac.fhcampuswien.command;

/**
* Corresponds to the ConcreteReceiver
*/

public class Document
{
    private String name;
    
    public Document(String name)
    {
        this.name = name;
    }
            
    public void copy()
    {
    	System.out.println("handling copy in " + name);
    }
    
    public void paste()
    {
    	System.out.println("handling paste in " + name);
    }
}