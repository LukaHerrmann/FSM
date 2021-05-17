import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] arg){
    Node s0 = new Node("s0");
    Node s1 = new Node("s1");
    Node s2 = new Node("s2");
    Node s3 = new Node("s3");
    s0.setOvergangen(new HashMap<>() {{
        put("A", s2);
        put("B", s1);
    }});
    s1.setOvergangen(new HashMap<>() {{
        put("A", s1);
        put("B", s2);
    }});
    s2.setOvergangen(new HashMap<>() {{
        put("B", s3);
    }});
    s3.setOvergangen(new HashMap<>() {{
        put("A", s3);
        put("B", s0);
    }});
    StateMachine State = new StateMachine(Stream.of(s0, s1, s2, s3).collect(Collectors.toCollection(HashSet::new)), s0);
    State.StartText();
    }
}
