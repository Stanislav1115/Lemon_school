import java.util.Scanner;

public class StartClass {
        public static void main(String[] args)
        {
            System.out.println("What day you want to check? ");
            Scanner input = new Scanner(System.in);
            String day = input.nextLine().toUpperCase();
            System.out.println(day);
            System.out.println(weekendOrWorkDay(day));
        }
    public static String weekendOrWorkDay(String day)
    {
        String[] days = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY",
                "FRIDAY", "SATURDAY" };
        String ret = null;
        for(int i = 0; i < days.length; i++)
        {
            if(day.equals(days[i]))
            {
                if(i >=0 && i <=4)
                {
                    ret = "Workday";
                    break;
                }
                else {
                    ret = "Weekend";
                    break;
                }
            }
            else {
                ret = "Your data is incorrect";
            }
        }
        return ret;
    }
}
