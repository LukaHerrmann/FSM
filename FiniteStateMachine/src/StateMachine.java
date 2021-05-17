
import java.util.*;

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

    public void StartRandom(){}
}
