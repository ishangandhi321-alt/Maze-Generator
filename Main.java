import java.util.*;
public class Main{
    public static void main(String[] args){
        ArrayList<Node> nodes = new ArrayList<Node>();
        
        //Change this later to depend on easy, medium, hard
        Integer greenNodes = 5;

        //Adding the green nodes
        for (int i = 0; i<greenNodes; i++){
            nodes.add(new Node(true));
        }
        //Adding the front connection
        for (int i = 0; i<greenNodes-1; i++){
            nodes.get(i).con2 = nodes.get(i+1);
        }
        //Adding the back connection
        for (int i = 1; i<greenNodes; i++){
            nodes.get(i).con1 = nodes.get(i-1);
        }
    }
}
