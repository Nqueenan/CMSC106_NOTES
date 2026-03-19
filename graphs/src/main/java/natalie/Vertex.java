package natalie ;
import java.util.ArrayList ;
import java.util.List ;
public class Vertex
{
    private String name ;
    private ArrayList<Vertex> edges ;
    public Vertex(String name)
    {
        this.name = name ;
        this.edges = new ArrayList<Vertex>() ;
    }
    public String getName()
    {
        return this.name ;
    }
    public boolean equals(Vertex other)
    {
        return this.name.equals(other.name) ;
    }
    public void addEdge(Vertex destination)
    {
        if (destination != null)
        {
            this.edges.add(destination) ;
        }
    }
    public boolean hasEdge(Vertex destination)
    {
        for (int i = 0 ; i < this.edges.size() ; i++)
        {
            if (this.edges.get(i).equals(destination))
            {
                return true ;
            }
        }
        return false ;
    }

    // in class
    // adding this to make outgoingEdges in AdjacencyGraph
    public List<Vertex> edges()
    {
        return this.edges ;
    }

    @Override
    public String toString()
    {
        return this.name ;
    }
}