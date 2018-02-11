public class Graph{

    Node a = null;
    Node b = null;
    Node c = null;
    Node d = null;
    /* First Function has to be invoked after the object being
     instantiated to build the graph */

    public Graph buildGraph(){

         a = new Node("A",0);
         b = new Node("B",4,a);
         c = new Node("C",3,a);
         d = new Node("D",5,a);
    

        return this;
    }
     
    public void findShortestPath(){


        
    }


}