import java.util.Scanner;

public class StartClass {
        public static void main(String[] args)
        {
            System.out.println("Please, enter numbers");
            Scanner in = new Scanner(System.in);
            int firstNumb = in.nextInt();
            int secondNumb = in.nextInt();
            int reSult = StartClass.sum(firstNumb, secondNumb);
            System.out.println("result: " + reSult);
        }
        public static Integer sum(int firstNumb, int secondNumb)
        {
              return firstNumb + secondNumb;
        }
}
