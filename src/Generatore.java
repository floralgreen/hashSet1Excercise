import java.util.HashSet;
import java.util.List;

public class Generatore {

    public HashSet generaHashSet() {
        HashSet<Integer> collectionOfInt = new HashSet<Integer>(List.of(10, 50, 3, 4));
        return collectionOfInt;
    }

}
