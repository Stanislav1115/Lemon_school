import java.util.Scanner;

public class StartClass {
        public static void main(String[] args)
        {
            int numb = check_value();
            boolean result = StartClass.isEven(numb);
            System.out.println("result: " + result);
        }



    public static int check_value(){
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
        public static Boolean isEven(int numb)
        {
            return (numb%2)==0? true: false;
        }
}
