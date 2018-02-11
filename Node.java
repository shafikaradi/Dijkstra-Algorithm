public class Node{

    private Node node;
    private String nodeName;
    private Integer nodeValue;
    

    //The Constructor for an initial graph
    public Node(String nodeName, Integer nodeValue){

        this.nodeName = nodeName;
        this.nodeValue = nodeValue;

    }

    public Node(String nodeName, Integer nodeValue, Node node){

        this.nodeName = nodeName;
        this.nodeValue = nodeValue;
        this.node = node;
    }

    public void setNodeValue(Node node){

        this.node = node;

    }

    public Node getNode(){

        return this.node;

    }

    public void setNodeName(String nodeName){

        this.nodeName = nodeName;

    }

    public String getNodeName(){

        return this.nodeName;

    }

    public void setNodeValue(Integer nodeValue){

        this.nodeValue = nodeValue;

    }

    public Integer getNodeValue(){

        return this.nodeValue;

    }




}