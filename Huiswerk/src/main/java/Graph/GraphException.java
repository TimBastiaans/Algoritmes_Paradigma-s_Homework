package Graph;

// Used to signal violations of preconditions for
// various shortest path algorithms.
class GraphException extends RuntimeException
{
    public GraphException( String name )
    { super( name ); }
}