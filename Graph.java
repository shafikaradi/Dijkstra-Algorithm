import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class Graph{

    private Node a = null;
    private Node b = null;
    private Node c = null;
    private Node d = null;
    private Node e = null;

    private List<Node> arrayOfNodes;
    private Map<String,Integer> tableOfValues;
    private Map<String,Integer> j;


    public Graph(){

        arrayOfNodes = new ArrayList<>();
        tableOfValues = new HashMap<>();
        j = new HashMap<>();

    }
 

    /*  buildGraph method must be invoked first after the object being
     instantiated to build the graph */

    public Graph buildGraph(){

         a = new Node("A",0);
         e = new Node("E",0);
         b = new Node("B");
         c = new Node("C");
         d = new Node("D");
         a.addNodeToGraph(a,0);
         a.addNodeToGraph(b,4);
         a.addNodeToGraph(c,3);
         a.addNodeToGraph(d,5);
         b.addNodeToGraph(e,1);
         c.addNodeToGraph(e,3);
         d.addNodeToGraph(e,1);


         arrayOfNodes.add(0, a);
         arrayOfNodes.add(1, b);
         arrayOfNodes.add(2, c);
         arrayOfNodes.add(3, d);
         arrayOfNodes.add(4, e);

        return this;
    }
     

    public void findShortestPath(){

        int temp = 0;
        for(int i = 0; i < arrayOfNodes.size(); i++){

         if(arrayOfNodes.get(i).getNodeEdgeValue() == 0){
           
            for(Map.Entry<Node,Integer> node: arrayOfNodes.get(i).getNodes().entrySet()){

                try {
                    tableOfValues.put(arrayOfNodes.get(i).getNodeName().concat(node.getKey().getNodeName()), node.getValue()+ arrayOfNodes.get(i).getNodeEdgeValue());
                } catch (Exception e) {
                    //TODO: handle exception
                }
   
           }

        }else if(i == arrayOfNodes.size() - 1){
                   
            for(Map.Entry<String,Integer> connectedNodes : tableOfValues.entrySet()){
                try {
                    j.put(connectedNodes.getKey().concat(arrayOfNodes.get(i).getNodeName()),  connectedNodes.getValue());
                } catch (Exception e) {
                    //TODO: handle exception
                }

            }
           

        }

        }

    }

    public void iterateOverMap(){

        for(Map.Entry<String,Integer> a: j.entrySet()){

            System.out.println(a.getKey()+" -> "+a.getValue());
        }
    }
}