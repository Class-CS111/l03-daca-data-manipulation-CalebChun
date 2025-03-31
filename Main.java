// STUDENT NAME:Caleb
// DATE: Chun

public class Main 
{
  public static void main(String[] args) 
	{

		/***** DECLARATION SECTION *****/
	int days = 2, month = 2, year = 2002;
		/***** INITIALIZATION SECTION *****/
		
		/***** INPUT SECTION *****/
		// N/A (no input for this lab)
		
		/***** CALCULATION & PROCESSING SECTION *****/
int jdn = days + (153*month+2)/5 + 365*year + year*0.25 - year*0.01 + year/400 - 32045;
		
		/***** OUTPUT SECTION *****/
		System.out.println("Julian Date Number: " + jdn);
  }
}
