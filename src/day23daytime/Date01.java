package day23daytime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date01 {

	public static void main(String[] args) {
		// anlik tarih nasil yazilir
      LocalDate ld =LocalDate.now();
      System.out.println(ld);
    
      //ileri tarihler ekrana nasil yazdirilir
     System.out.println(ld.plusDays(275));
     System.out.println(ld.plusMonths(3));
     System.out.println(ld.plusYears(3));
     
     //gecmis tarihler ekrana nasil yazdirilir
     
     System.out.println(ld.minusDays(34));
     System.out.println(ld.minusMonths(6));
     System.out.println(ld.minusYears(4));
     
     //tarihi nasil farkli formatta yazdiriz
     //MM==>kacinci ay   MMM==>ayin ilk harfi    MMMM==>ayin isminin tamami
     DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/mm/yyyy");
     System.out.println(dtf.format(ld.plusMonths(2)));
     DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/mmm/yyyy");
     System.out.println(dtf1.format(ld));
     
	}

}
