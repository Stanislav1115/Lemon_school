import java.util.Scanner;

public class StartClass {
        public static void main(String[] args)
        {
            System.out.println("Please, enter numbers");
            Scanner in = new Scanner(System.in);
            int numb = in.nextInt();
            int result = StartClass.faktorial(numb);
            System.out.println("result: " + result);
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
