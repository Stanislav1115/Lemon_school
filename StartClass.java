import java.util.Scanner;
import java.util.Arrays;

public class StartClass {
    public static void main(String[] args)
    {
        Boolean k = true;
        while(k)
        {
            System.out.println("!!!--------------------Start MENU--------------------!!!");
            System.out.println("1 - The natural number n is given. Derive all numbers from 1 to n (Cycles) ");
            System.out.println("2 - A given numerical array. Calculate the sum of all its elements. ");
            System.out.println("3 - Recursive multiplication. ");
            System.out.println("4 - Christmas tree made of stars ,, Recursive method of exponentiation");
            System.out.println("5 - Recursive method of exponentiation");
            System.out.println("6 - Akkerman function");
            System.out.println("Another input - exit ");
            System.out.println("_________________________________________________");
            System.out.println("What task you want to check?: ");
            System.out.println("");
            System.out.println("");
            int num = checkValue();
            switch (num) {
                case 1 : allNumbers1ToN();
                break;
                case 2 : arraySum();
                    break;
                case 3 : recursiveMultiplication();
                    break;
                case 4 : treeOfStars();
                    break;
                case 5 : rmoeStart();
                    break;
                case 6 : System.out.println("Enter \"m\" (Akkerman function)");
                    int m = checkValue();
                    System.out.println("Enter \"n\" (Akkerman function)");
                    int n = checkValue();
                    long res = ackermann(m, n);
                    System.out.println(res);
                    break;
                default : System.exit(0);
            }
        }
    }
    //===============================================================================
    public static void allNumbers1ToN()
    {
        boolean k = true;
        while (k)
        {
            System.out.print("Enter the value \"n\": ");
            int n = checkValue();
            System.out.println("1  - Cycles");
            System.out.println("2  - Recursion");
            System.out.print("Which method do you want to use?: ");
            int value = checkValue();

            switch (value)
            {
                case 1: allNumbers1ToNCycle(n);
                    k = false;
                    break;
                case 2: allNumbers1ToNRecursion(n);
                    k = false;
                    break;
            }
        }
    }
    public static void allNumbers1ToNCycle(int n)
    {
        System.out.println("Enter the last number: ");
        int num = checkValue();
        if(num > 1)
        {
            for (int i = 1; i <= num; i++) {
                System.out.println(i);
            }
        }
        else System.out.println("Last number can't be less that one");
    }

    public static int allNumbers1ToNRecursion(int n)
    {
        if(n <= 1)
        {
            System.out.println(n);
            return 0;
        }
        else{
            System.out.println(allNumbers1ToNRecursion(n - 1));
        }
        return 0;
    }
    // =================================================================================
    public static void arraySum()
    {
        System.out.println("How many elements will be in the array: ");
        int numb = checkValue();
        int[] array = new int[numb];
        for (int i = 0; i < array.length; i++) {
            array[i] = checkValue();
        }
        String arrayString = Arrays.toString(array);
        System.out.println(arrayString);
        boolean k = true;
        while (k)
        {
            System.out.println("1  - Cycles");
            System.out.println("2  - Recursion");
            System.out.print("Which method do you want to use?: ");
            int value = checkValue();
            int len = array.length-1;
            int sum = 0;

            switch (value)
            {
                case 1: arraySumCycle(array);
                    k = false;
                    break;
                case 2: arraySumRecursion(array, len, sum);
                    k = false;
                    break;
            }
        }
    }
    public static void arraySumCycle(int[] array)
    {
        int result = 0;
        for(int i = 0; i < array.length; i++)
        {
            result += array[i];
        }
        System.out.println("Result = " + result);
    }
    public static void arraySumRecursion(int[] array, int len, int sum)
    {
        if (len < 0)
        {
            System.out.println(sum);;
        }
        else
        {
            sum += array.length;
            arraySumRecursion(array, len-1, sum);
        }
    }
    // =================================================================================
    public static void recursiveMultiplication()
    {
        boolean k = true;
        while (k)
        {
            System.out.println("Enter the value \"n\": ");
            int n = checkValue();
            System.out.println("Enter the value \"m\": ");
            int m = checkValue();
            System.out.println("1  - Cycles");
            System.out.println("2  - Recursion");
            System.out.print("Which method do you want to use?: ");
            int value = checkValue();
            int sum = 0;

            switch (value)
            {
                case 1: recursiveMultiplicationCycle(n, m);
                    k = false;
                    break;
                case 2: recursiveMultiplicationRecursion(n, m, sum);
                    k = false;
                    break;
            }
        }
    }
    public static void recursiveMultiplicationCycle(int n, int m)
    {
        int sum = 0;
        for(int i = 0; i < m; i++)
        {
            sum += n;
        }
        System.out.println(sum);
    }
    public static void recursiveMultiplicationRecursion(int n, int m, int sum)
    {
        if(m < 1)
        {
            System.out.println(sum);
        }
        else{
            sum += n;
            recursiveMultiplicationRecursion(n, m-1, sum);
        }
    }
    // =================================================================================
    public static void treeOfStars()
    {
        boolean k = true;
        while (k)
        {
            System.out.println("Enter the value \"*\": ");
            int n = checkValue();
            System.out.println("1  - Cycles");
            System.out.println("2  - Recursion");
            System.out.print("Which method do you want to use?: ");
            int value = checkValue();
            int sum = 0;

            switch (value)
            {
                case 1: treeOfStarsCycle(n);
                    k = false;
                    break;
                case 2: int i = 1;
                    String star = "*";
                    treeOfStarsRecursion(i, n, star);
                    k = false;
                    break;
            }
        }
    }
    public static void treeOfStarsCycle(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void treeOfStarsRecursion(int i, int n, String star)
    {
        if(n == i)
        {
            System.out.print(star);
            System.out.println("");
        }
        else {
                System.out.print(star);
            System.out.println("");
            treeOfStarsRecursion(i+1, n, star + "*");
        }
    }
    // =================================================================================
    public static void rmoeStart()
    {
        System.out.println("Enter start value: ");
        int n = checkValue();
        System.out.println("Enter degree: ");
        int m = checkValue();
        int result = n;
        rmoe(n,m, result);
    }
    public static void rmoe(int n, int m, int result)
    {
        if(m == 0)
        {
            System.out.println(1);
        }else if(m == 1)
        {
            System.out.println(result);
        }
        else
        {
            result *= n;
            rmoe(n, m-1, result);
        }
    }
    // =================================================================================
    public static int ackermann(int m, int n)
    {
        if(m == 0)
        {
            return n + 1;
        }
        else if (n == 0)
        {
            return ackermann(m - 1, 1);
        }
        else
        {
            return ackermann(m - 1, ackermann(m,n-1));
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
            input.nextLine();
            System.out.println("Enter an integer: ");
        }
        return range;
    }
}
