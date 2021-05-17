import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {
    private Node node = new Node("node");
    private Node node1 = new Node("anothernode");
    private Node node2 = new Node("newnode");
    private Node node3 = new Node("subnode");

    @Test
    void getNaam() throws Exception {
        assertEquals("node", node.getNaam());
    }

    @Test
    void getOvergangen() throws Exception{
        node.setOvergangen(new HashMap<>() {{
            put("A", node2);
            put("B", node1);
        }});
        assertEquals(new HashMap<>() {{
            put("A", node2);
            put("B", node1);
        }}, node.getOvergangen());
    }
}
