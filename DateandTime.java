import java.time.*;
import java.time.format.DateTimeFormatter; 

class DateandTime {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDate d = LocalDate.now(); 
        System.out.println(d); 

        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
  }
    
}
