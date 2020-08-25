package day23daytime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Time01 {

	public static void main(String[] args) {
		LocalTime lt=LocalTime.now();
		System.out.println(lt); //nano second
		
		// Zamanda ileri nasil gidilir
		System.out.println(lt.plusMinutes(7));
		System.out.println(lt.plusHours(6));
		
		//Zaman nasil iler alinir
		System.out.println(lt.minusSeconds(23));
		
		//Time Farmati nasil degistirilir
		//hh==>12lik sistem kullani HH==>24 luk sistem kullanir
		DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("hh:mm");
		System.out.println(dtf1.format(lt));
		
		//farkli ulkelerdeki yerel saati nasil yazalim
		System.out.println(LocalTime.now(ZoneId.of("Turkey")));
		System.out.println(LocalTime.now(ZoneId.of("Japan")));
		
		}
	

}
