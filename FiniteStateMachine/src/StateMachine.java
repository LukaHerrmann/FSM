
import java.util.*;
import java.util.Random;

public class StateMachine {
    private HashSet<Node> Nodes;
    private Node CurrentNode;

    public StateMachine(HashSet Nodes, Node StartNode) {
        this.Nodes = Nodes;
        this.CurrentNode = StartNode;
    }

    public void StartText(){
        while (true) {
            System.out.println("Huidige node: " + CurrentNode.getNaam());
            for (String key : CurrentNode.getOvergangen().keySet()) {
                System.out.println(key + ": " + CurrentNode.getOvergangen().get(key).getNaam());
            }
            Scanner scan = new Scanner(System.in);
            String input = scan.next();
            if (CurrentNode.getOvergangen().containsKey(input)) {
                CurrentNode = CurrentNode.getOvergangen().get(input);
            }
            else {
                System.out.println("Fout: dit is geen mogelijke overgang");
                return;
            }
        }
    }

    public void StartRandom(int iterations){
        for (int i = 0; i < iterations; i++) {
            System.out.println("Huidige node: " + CurrentNode.getNaam());
            Random random = new Random();
            Object[] values = CurrentNode.getOvergangen().keySet().toArray();
            Object randomvalue = values[random.nextInt(values.length)];
            Node newnode = CurrentNode.getOvergangen().get(randomvalue);
            System.out.println("Gekozen voor " + randomvalue + ", wat leidt naar node " + newnode.getNaam());
            CurrentNode = newnode;
        }
    }
}
