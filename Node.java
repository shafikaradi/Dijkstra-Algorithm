import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Node{

    private Map<Node,Integer> nodes = new HashMap<>();
    private String nodeName;
    private Integer nodeEdgeValue;
    

    public Node(String nodeName){

        this.nodeName = nodeName;

    }

    //The Constructor for an initial and end point of a graph
    public Node(String nodeName,Integer nodeEdgeValue){

        this.nodeName = nodeName;
        this.nodeEdgeValue = nodeEdgeValue;

    }

    public Node(String nodeName, Integer nodeEdgeValue, Node node){

        this.nodeName = nodeName;
        this.nodeEdgeValue = nodeEdgeValue;
        this.nodes.put(node,nodeEdgeValue);
  
    }

    public void addNodeToGraph(Node node, Integer nodeEdgeValue){

        nodes.put(node,nodeEdgeValue);

    }

    public HashMap<Node,Integer> getNodes(){

        return (HashMap) nodes;
    }


    public void setNodeName(String nodeName){

        this.nodeName = nodeName;

    }

    public String getNodeName(){

        return this.nodeName;

    }

    public void setNodeEdgeValue(Integer nodeEdgeValue){

        this.nodeEdgeValue = nodeEdgeValue;

    }

    public Integer getNodeEdgeValue(){

        return this.nodeEdgeValue;

    }




}