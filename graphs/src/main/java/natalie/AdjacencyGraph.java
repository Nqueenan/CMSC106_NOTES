package natalie;
import java.util.ArrayList ;
import java.util.List ;

public class AdjacencyGraph 
{
    private List<Vertex> verticies ;
    public AdjacencyGraph()
    {
        verticies = new ArrayList<Vertex>() ;
    }
    public List<Vertex> verticies()
    {
        return this.verticies ;
    }
    public void insertEdge(Vertex origin, Vertex destination)
    {
        origin.addEdge(destination) ;
    }
    public boolean hasEdge(Vertex origin, Vertex destination)
    {
        return origin.hasEdge(destination) ;
    }

    // in class
    public List<Vertex> outgoingEdges(Vertex origin)
    {
        return origin.edges() ;
    }
    
    // in class
    public List<Vertex> incomingEdges(Vertex destination)
    {
        ArrayList<Vertex> origins = new ArrayList<Vertex>() ;
        for (int i = 0 ; i < this.verticies().size() ; i++)
        {
            Vertex origin = verticies.get(i) ;
            if (origin.hasEdge(destination))
            {
                origins.add(origin) ;
            }
        }
        return origins ;
    }
    
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}