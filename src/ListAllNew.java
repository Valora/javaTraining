import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by valora on 2017/3/13.
 */
public class ListAllNew {
    public static void main(String[] args) {
        Integer[] a = {1, 2, 2, 3, 4, 5};
        List<Integer> list = Arrays.asList(a);
        HashSet<String> hs = new HashSet<String>();
        NewListAll(list, "", hs);
    }

    private static void NewListAll(List<Integer> Candidate, String Prefix, HashSet<String> hs) {
         if (Prefix.length()!=0 && !hs.contains(Prefix)) {
            System.out.println(Prefix);
            hs.add(Prefix);
        }

        for (int i = 0; i < Candidate.size(); i++) {
            List<Integer> temp = new LinkedList<>(Candidate);
            int item = temp.remove(i);
            NewListAll(temp, Prefix+item, hs);
        }
    }
}
