import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by valora on 2017/3/8.
 */
public class ExecuteProcess {
    public static void main(String[] args) {
        try {
            Process proc = Runtime.getRuntime().exec("svn help");
            BufferedReader result = new BufferedReader( new InputStreamReader(proc.getInputStream()));
            String line;
            while((line = result.readLine())!=null){
                System.out.println(line);
            }
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
