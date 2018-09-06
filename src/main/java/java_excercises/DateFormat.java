package java_excercises;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static void main(String ar[]) {
		Date today = new Date();

		System.out.println("Today's Date is > " + today);

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/YY");
		System.out.println(formatter.format(today));
		SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/YYY");
		System.out.println(formatter1.format(today));
		SimpleDateFormat formatter2 = new SimpleDateFormat("dd-MM-YYY");
		System.out.println(formatter2.format(today));
		SimpleDateFormat formatter3 = new SimpleDateFormat("MM-dd-YYYY");
		System.out.println(formatter3.format(today));
		SimpleDateFormat formatter4 = new SimpleDateFormat("E,MMM dd YYYY");
		System.out.println(formatter4.format(today));
		SimpleDateFormat formatter5 = new SimpleDateFormat("E,MMMM dd YYYY");
		System.out.println(formatter5.format(today));
		SimpleDateFormat formatter6 = new SimpleDateFormat("dd MMMM YYYY");
		System.out.println(formatter6.format(today));
		SimpleDateFormat formatter7 = new SimpleDateFormat("dd MM YYY hh:mm:ss");
		System.out.println(formatter7.format(today));
		SimpleDateFormat formatter8 = new SimpleDateFormat("EEEE,MMM dd YYYY hh:mm:ss a");
		System.out.println(formatter8.format(today));
		SimpleDateFormat formatter9 = new SimpleDateFormat("dd MMM YYYY HH:mm:ss zzzz");
		System.out.println(formatter9.format(today));
		SimpleDateFormat formatter10 = new SimpleDateFormat("dd MMM YYYY HH:mm:ss Z");
		System.out.println(formatter10.format(today));
	}

}
