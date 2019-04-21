package at.ac.fhcampuswien.command;

public class Document
{
    private String documentName;
    
    public Document(String name)
    {
        this.documentName = name;
    }
            
    public void copy()
    {
    	System.out.println("handling copy in " + documentName);
    }
    
    public void paste()
    {
    	System.out.println("handling paste in " + documentName);
    }
}