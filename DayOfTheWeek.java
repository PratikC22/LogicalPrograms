/**
 * This code takes 3 command line arguments Month, Date, Year as input and
 * prints the day of the week that date falls on.
 *
 * @author Pratik Chaudhari
 * @since 14/06/2021
*/
public class DayOfTheWeek {

    static int M, D, Y;

    public static void main(String[] args) {

        DayOfTheWeek dayOfTheWeek = new DayOfTheWeek();

        M = Integer.parseInt(args[0]);
        D = Integer.parseInt(args[1]);
        Y = Integer.parseInt(args[2]);

        dayOfTheWeek.dayOfWeek();
    }

    public void dayOfWeek() {
        int y0 = Y - (14 - M) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = M + 12 * ((14 - M) / 12) - 2;
        int d0 = (D + x + 31 * m0 / 12) % 7;

        if(d0==0)
            System.out.println("The day is: SUNDAY");
        else if(d0==1)
            System.out.println("The day is: MONDAY");
        else if(d0==2)
            System.out.println("The day is: TUESDAY");
        else if(d0==3)
            System.out.println("The day is: WEDNESDAY");
        else if(d0==4)
            System.out.println("The day is: THURSDAY");
        else if(d0==5)
            System.out.println("The day is: FRIDAY");
        else if(d0==6)
            System.out.println("The day is: SATURDAY");
    }
}
