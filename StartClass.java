import java.util.Scanner;

public class StartClass {
    public static void main(String[] args)
    {
        Boolean k = true;
        while(k)
        {
            System.out.println("_________________________________________________");
            System.out.println("1 - numbers ");
            System.out.println("2 - days ");
            System.out.println("Another input - exit ");
            System.out.println("What task you want to check?: ");
            System.out.println("");
            System.out.println("");
            int num = checkValue();
            switch(num)
            {
                case 1: whatNumber();
                    break;
                case 2: whatDay();
                    break;
                default: System.exit(0);
            }
        }
    }
    public static void whatNumber()
    {
        System.out.println("_________________________________________________");
        System.out.println("Start number program..");
        System.out.println("");
        int number = checkValue();
        if(0 <= number && number < 10)
        {
            System.out.println("One digit in number");
        }else if(10 <= number && number < 100)
        {
            System.out.println("Two digits in number");
        }
        else if(100 <= number && number < 1000)
        {
            System.out.println("Three digits in number");
        }
        else if(1000 <= number && number < 10000)
        {
            System.out.println("Four digits in number");
        }
        else if(10000 <= number && number < 100000)
        {
            System.out.println("Five digits in number");
        }
        else
        {
            System.out.println("Not available type");
        }
    }

    public static void whatDay()
    {
        System.out.println("_________________________________________________");
        System.out.println("Start day program..");
        System.out.println("");
        int counter = 1;
        while (counter<3)
        {
            int num = checkValue();
            counter++;
            switch(num)
            {
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                case 7:
                    System.out.println("Saturday");
                    break;
                default: System.out.println("incorrect input");
            }
        }
    }

    public static int checkValue(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int range;
        while(true){
            if(input.hasNextInt()){
                range = input.nextInt();
                if(0>=range || range > 0)
                    break;
                else
                    continue;
            }
            input.nextLine();  //Comsume the garbage value
            System.out.println("Enter an integer: ");
        }
        return range;
    }
}
