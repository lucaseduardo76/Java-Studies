package aplicattion;

import java.time.Duration;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		LocalDate a = LocalDate.parse("2024-04-29");
		
		System.out.println(a.getMonthValue());
	}

}
