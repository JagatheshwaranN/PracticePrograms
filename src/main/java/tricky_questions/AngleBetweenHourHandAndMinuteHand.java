package tricky_questions;

public class AngleBetweenHourHandAndMinuteHand {

	public static void main(String ar[]) {
		calculateAngle(3, 0);
	}

	public static void calculateAngle(double hh, double mm) {
		if (hh < 0 || mm < 0 || hh > 12 || mm > 60) {
			System.out.println("Invalid input");
		}
		if (hh == 12) {
			hh = 0;
		}
		if (mm == 60) {
			mm = 0;
		}
		
	
/*		Both hour hand and minute hand are together at 12 o’clock so lets take 12 o’clock as reference.

		So lets see how many degrees these hands move in a single minute:

		Minute hand moves 360 degrees in 60 minutes. So the degrees covered in 1 minute =

		360/60 = 6 degrees/minute

		Hour hand moves 360 degrees in 12 hours. So the degrees covered in 1 hour =

		360/12 = 30 degrees/hour = 0.5 degree/minute

		At any given time HH:MM:

		The angle which hour hand will makes is = total number of minutes the hour hand has moved * degree hour hand moves per minute

		= (60*HH + MM) *0.5

		The angle which minute hand makes is = total number of minutes the Minute hand has moved * degrees minute hand moves per minute

		= 6*MM

		The angle between both hands will be the difference between the degrees moved:

		= (60*HH + MM)*0.5 - 6*MM*/

		double hourHand = 0.5 * (60 * hh + mm);
		double minuteHand = 6 * mm;
		
		double normalAngle = hourHand-minuteHand;

		double angle = Math.abs(hourHand - minuteHand);
		angle = Math.min(360 - angle, angle);

		System.out.println("Angle between HourHand and MinuteHand is " + normalAngle +" degree");
		System.out.println("Angle between HourHand and MinuteHand is " + angle +" degree");

	}

}
