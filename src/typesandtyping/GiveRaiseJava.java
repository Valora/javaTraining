package typesandtyping;

import java.math.BigDecimal;

/**
 * Created by valora on 2017/3/12.
 */
public class GiveRaiseJava {
    public static void giveRaise(Employee employee) {
        employee.raise(new BigDecimal(10000.00));
    }

    public static void main(String[] args) {
        giveRaise(new Employee());
        giveRaise(new Executive());
    }
}
