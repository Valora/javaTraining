package typesandtyping;

import java.math.BigDecimal;

/**
 * Created by valora on 2017/3/12.
 */
public class Executive extends Employee{
    @Override
    public void raise(Number amount) {
        System.out.println("Executive got raise");
    }
    public void raise(BigDecimal amount) {
        System.out.println("Executive got outlandish raise");
    }
}
