
import java.util.*;

public class StateMachine {
    private HashSet<Node> Nodes;
    private Node StartNode;

    public StateMachine(HashSet Nodes, Node StartNode) {
        this.Nodes = Nodes;
        this.StartNode = StartNode;
    }

    public void StartText(){}

    public void StartRandom(){}
}
