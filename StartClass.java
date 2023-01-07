import java.util.Scanner;

public class StartClass {
        public static void main(String[] args)
        {
            System.out.println("How many values you want check?: ");
            int numb = check_value();
            if(numb < 0){
                numb *= -1;
            }else if(numb == 0){
                System.out.println("Goodby!");
                System.exit(0);
            }

            int[] values;
            boolean[] result;
            values = new int[numb];
            result = new boolean[numb];
            for(int i = 0; i < values.length; i++)
            {
                values[i] = check_value();
                result[i] = StartClass.isEven(values[i]);
            }
            for(int i = 0; i < result.length; i++)
            {
                System.out.println(values[i] + " = " + result[i]);
            }
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
