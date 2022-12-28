import java.util.Scanner;

public class StartClass {
        public static void main(String[] args)
        {
            System.out.println("Please, enter numbers");
            Scanner in = new Scanner(System.in);
            int numb = in.nextInt();
            int reSult = StartClass.sum(numb);
            System.out.println("result: " + reSult);
        }
        public static Integer sum(int numb)
        {
              int result = 0;
              for(int i = 0; i <= numb; i++)
              {
                  if(i % 3 == 0 || i % 5 == 0)
                  {
                      result += i;
                  }
              }
              return result;
        }
}
