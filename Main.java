// STUDENT NAME:Caleb
// DATE: Chun

public class Main 
{
  public static void main(String[] args) 
	{

		/***** DECLARATION SECTION *****/
	int dayToday = 2, monthToday = 2, yearToday = 2020;
	int dayBday = 8, monthBday = 26, yearBday = 1918;
		/***** INITIALIZATION SECTION *****/
		
		/***** INPUT SECTION *****/
		// N/A (no input for this lab)
		
		/***** CALCULATION & PROCESSING SECTION *****/
int jdnToday = dayToday + (153*monthToday+2)/5 + 365*yearToday + yearToday*0.25 - yearToday*0.01 + yearToday/400 - 32045;
int jdnBday = dayBday + (153*monthBday+2)/5 + 365*yearBday + yearBday*0.25 - yearBday*0.01 + yearBday/400 - 32045;
		
		/***** OUTPUT SECTION *****/
		System.out.println("Julian Day Number for today's date, 2/2/2020, is " + jdnToday);
		System.out.println("Julian Day Number for birthday, 8/26/1918, is " + jdnBday);
		System.out.println("The difference in days is " + jdnBday + ", which makes you approximately 101 years old!")
		
  }
}
