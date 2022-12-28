import java.util.Scanner;

public class StartClass {
        public static void main(String[] args)
        {
            int numb = check_value();
            int result = StartClass.faktorial(numb);
            System.out.println("result: " + result);
        }

    public static int check_value(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int range;
        while(true){
            if(input.hasNextInt()){
                range = input.nextInt();
                if(0>=range || range >= 0)
                    break;
                else
                    continue;
            }
            input.nextLine();  //Comsume the garbage value
            System.out.println("Enter an integer: ");
        }
        return range;
    }
        public static Integer faktorial(int numb)
        {
              int result = 1;
              for(int i = numb; i > 0; i--)
              {
                      result *= i;
              }
              return result;
        }
}
