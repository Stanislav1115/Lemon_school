import java.util.Scanner;

public class StartClass {
        public static void main(String[] args)
        {
            System.out.print("First integer: ");
            int firstNumb = check_value();
            System.out.print("Second integer: ");
            int secondNumb = check_value();
            int result = StartClass.sum(firstNumb, secondNumb);
            System.out.println("result: " + result);
        }
        public static Integer sum(int firstNumb, int secondNumb)
         {
            return firstNumb + secondNumb;
         }

        public static int check_value(){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter an integer: ");
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
