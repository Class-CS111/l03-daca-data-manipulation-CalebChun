// STUDENT NAME:Caleb
// DATE: Chun


public class Main 
{
  public static void main(String[] args) 
	{

		/***** DECLARATION SECTION *****/
		int month = 2, year=2020, day=2;
int a = (14 - month) / 12, m = month + 12*a - 3, y = year + 4800 - a;
        int monthBday = 8, yearBday=1918, dayBday=26;
int aB = (14 - monthBday) / 12, mB = monthBday + 12*aB - 3, yB = yearBday + 4800 - aB;


		/***** INITIALIZATION SECTION *****/
		
		/***** INPUT SECTION *****/
		// N/A (no input for this lab)
		
		/***** CALCULATION & PROCESSING SECTION *****/
int jdnToday = (int)(day + ((153*m)+2)/5 + 365*y + y*0.25 - y*0.01 + y/400 - 32045);

int jdnBday = (int) (dayBday + ((153*mB)+2)/5 + 365*yB + yB*0.25 - yB*0.01 + yB/400 - 32045);

		/***** OUTPUT SECTION *****/
		System.out.println("Julian Day Number for today's date, 2/2/2020, is " + jdnToday);
		System.out.println("Julian Day Number for birthday, 8/26/1918, is " + jdnBday);
		System.out.println("The difference in days is " + (jdnToday - jdnBday) + ", which makes you approximately 101 years old!");
		
  }
}
