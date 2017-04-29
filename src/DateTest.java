import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by valora on 2017/4/28.
 */
public class DateTest {
    public static void main(String[] args) {
        String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        System.out.println(date);
    }
}
