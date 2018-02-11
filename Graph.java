public class Graph{

    Node a = null;
    Node b = null;
    Node c = null;
    Node d = null;
    Node e = null;

    /*  buildGraph method must be invoked first after the object being
     instantiated to build the graph */

    public Graph buildGraph(){

         a = new Node("A",0);
         e = new Node("E",0);
         b = new Node("B");
         c = new Node("C");
         d = new Node("D");
         a.addNodeToGraph(b,4);
         a.addNodeToGraph(c,3);
         a.addNodeToGraph(d,5);
         b.addNodeToGraph(e,1);
         c.addNodeToGraph(e,2);
         d.addNodeToGraph(e,1);

         

        return this;
    }
     
    public void findShortestPath(){

         
        
    }


}