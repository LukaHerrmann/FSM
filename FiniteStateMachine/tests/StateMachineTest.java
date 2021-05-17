import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StateMachineTest {
    Node node = new Node("node");
    Node node1 = new Node("anothernode");
    Node node2 = new Node("newnode");
    Node node3 = new Node("subnode");
    StateMachine State = new StateMachine();

    @Test
    void getNodes() {
        State.setNodes(Stream.of(node3, node2, node).collect(Collectors.toCollection(HashSet::new)));
        assertEquals(Stream.of(node3, node2, node).collect(Collectors.toCollection(HashSet::new)),
                State.getNodes());
    }

    @Test
    void getCurrentNode() {
        State.setCurrentNode(node2);
        assertEquals(node2, State.getCurrentNode());
    }
}