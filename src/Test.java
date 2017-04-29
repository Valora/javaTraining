import java.util.ArrayList;
import java.util.List;

/**
 * Created by valora on 2017/3/13.
 */
public class Test {
    private String value = null;
    public Test(String v) {
        value = v;
    }
    public boolean equals(Test o) {
        if (o == this)
            return true;
        if (o instanceof Object) {
            Test test = (Test) o;
            return value.equals(test.value);
        }
        return false;
    }

    public static void main(String[] args) {
        List list = new ArrayList<>();
        
    }
}
