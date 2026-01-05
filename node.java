
public class Node{
    public Node con1;
    public Node con2;
    public Node con3;
    public Node con4;
    public Boolean green;

    public Node(Boolean green){
            this.con1 = null;
            this.con2 = null;
            this.con3 = null;
            this.con4 = null;
            
            this.green = green;

            System.out.println("Node created");
    }
}
