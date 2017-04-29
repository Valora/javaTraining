package typesandtyping;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by valora on 2017/3/12.
 */
public class UsingCollection {
    public static void main(String[] args) {
        ArrayList<String> lst = new ArrayList<>();
        Collection<String> col = lst;
        
        lst.add("one");
        lst.add("two");
        lst.add("three");
        lst.remove(0);
        col.remove(0);
    }
}
