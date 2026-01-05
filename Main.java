import java.util.*;
public class Main{

    static void addRedToList(){
        System.out.println("test");
    }

    public static void main(String[] args){
        Random r = new Random();

        ArrayList<Node> allNodes = new ArrayList<Node>();
        ArrayList<Node> greenNodeList = new ArrayList<Node>();
        ArrayList<Node> redNodeList = new ArrayList<Node>();
        ArrayList<Node> connectableNodes = new ArrayList<Node>();

        //Change this later to depend on easy, medium, hard
        Integer greenNodes = r.nextInt(4, 8);

        //Adding the green nodes
        for (int i = 0; i<greenNodes; i++){
            allNodes.add(new Node(true));
            greenNodeList.add(new Node(true));
            connectableNodes.add(new Node(true));
        }
        //Removing last node from connectables
        connectableNodes.remove(connectableNodes.getLast());

        //Adding the front connection
        for (int i = 0; i<greenNodes-1; i++){
            allNodes.get(i).con2 = allNodes.get(i+1);
        }
        //Adding the back connection
        for (int i = 1; i<greenNodes; i++){
            allNodes.get(i).con1 = allNodes.get(i-1);
        }
        //Creating the loop that adds the red nodes
        for (Node node : connectableNodes) {
            System.out.println("test");
        }

    }
}
