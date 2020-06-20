package exercisesPresentation;

import java.text.DateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeTraining {
    public static void dateNow(){
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("LocalDateTime" + ldt);
        Instant now = Instant.now();
        System.out.println("Instant: " + now);

    }
    public static void tokyoTime(){
        Clock clock = Clock.system(ZoneId.of("Asia/Tokyo"));
        LocalDateTime ldt = LocalDateTime.now(clock);
        System.out.println("Japan time: " + ldt);

    }
    public static void DateFormat(){
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
        System.out.println("Date in format yyyy/MM/dd hh:MM:ss");
        
    }
}
