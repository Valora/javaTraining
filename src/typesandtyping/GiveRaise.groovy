package typesandtyping

/**
 * Created by valora on 2017/3/12.
 */
void giveraise(Employee employee) {
    employee.raise(new BigDecimal(10000.00))
}
giveraise(new Employee())
giveraise(new Executive())