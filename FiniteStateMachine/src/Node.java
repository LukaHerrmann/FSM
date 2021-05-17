
import java.util.*;

public class Node{
    private String naam;
    private HashMap<String, Node> Overgangen;


    public Node (String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }


    public HashMap<String, Node> getOvergangen() {
        return Overgangen;
    }

    public void setOvergangen(HashMap<String, Node> overgangen) {
        Overgangen = overgangen;
    }


}
