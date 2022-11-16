import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Runner {

    public static void main(String[] args) {

        LocalDateTime localDate = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM dd, YYY");
        System.out.println(dtf.format(localDate));


    }
}

