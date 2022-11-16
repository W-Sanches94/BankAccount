import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Runner {

    public static void main(String[] args) {

        LocalDateTime localDate = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM dd, YYY");
        System.out.println(dtf.format(localDate));

        BankAccount Kaelyn = new BankAccount("Kaelyn","Blake","22/04/93",69677441, 3278);

        System.out.println(Kaelyn.getFirstName());

        Kaelyn.setFirstName("Rebecca");
        System.out.println(Kaelyn.getFirstName());



    }
}

