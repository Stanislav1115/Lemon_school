import java.util.Scanner;

public class StartClass {
        public static void main(String[] args)
        {
            System.out.println("How many hours are there now?");
            int numb = check_value();
            System.out.println(StartClass.mo_Day_Ev_Night(numb));
        }



    public static int check_value(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an your hours: ");
        int range;
        while(true){
            if(input.hasNextInt()){
                range = input.nextInt();
                if(0<=range || range <= 24)
                    break;
                else
                    continue;
            }
            input.nextLine();  //Comsume the garbage value
            System.out.println("Exeption!!! Only 24 hours in a day!");
            System.out.println("Enter an your hours: ");
        }
        return range;
    }
        public static String mo_Day_Ev_Night(int numb)
        {
            if(numb >= 0 && numb <= 3)
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
