import java.util.Scanner;

public class StartClass {
        public static void main(String[] args)
        {
            System.out.println("How many values do you want to check?");
            int numb = check_value();
            if(numb < 0){
                numb *= -1;
            }else if(numb == 0){
                System.out.println("Goodby!");
                System.exit(0);
            }
            int[] hours = new int [numb];
            String[] result = new String[numb];
            for(int i = 0; i < hours.length; i++)
            {
                hours[i] = check_hours();
                result[i] = mo_Day_Ev_Night(hours[i]);
            }
            for(int i = 0; i < hours.length; i++)
            {
                System.out.println(hours[i] + " = " + result[i]);
            }
        }

    public static int check_hours(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an your hours: ");
        int range;
        while(true){
            if(input.hasNextInt()){
                range = input.nextInt();
                if(0<=range && range <= 24)
                    break;
                else {
                    System.out.println("Exeption!!! Only 24 hours in a day!");
                    System.out.println("Enter an your hours: ");
                    continue;
                }
            }
            input.nextLine();  //Comsume the garbage value
        }
        return range;
    }

    public static int check_value(){
        Scanner input = new Scanner(System.in);
        //System.out.print("Enter an your hours: ");
        int range;
        while(true){
            if(input.hasNextInt()){
                range = input.nextInt();
                if(0<=range || range < 0)
                    break;
                else
                    continue;
            }  //Comsume the garbage value
            System.out.println("Exeption!!! This is not a number");
            System.out.println("Enter number: ");
            input.nextLine();
        }
        return range;
    }
        public static String mo_Day_Ev_Night(int numb)
        {
            if((numb >= 0 && numb <= 3) || numb == 24)
            {
                return "Night";
            } else if (numb >= 4 && numb <= 11)
            {
                return "Morning";
            }else if (numb >= 12 && numb <= 16)
            {
                return "Day";
            }else
            {
                return "Evening";
            }
        }
}
