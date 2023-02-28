import java.util.*;

public class Task2 {
    public static void task2Start()
    {
        Boolean k = true;
        while(k)
        {
            System.out.println("!!!--------------------Start MENU--------------------!!!");
            System.out.println("1  - Sum of Two Numbers");
            System.out.println("2  - Sum Multiples of Three and Five");
            System.out.println("3  - Factorial ");
            System.out.println("4  - Linear Search");
            System.out.println("5  - Reverse String ");
            System.out.println("6  - Find Maximum");
            System.out.println("7  - Average Value");
            System.out.println("8  - Convert to Upper Case");
            System.out.println("9 - Nth Odd Element ");
            /*System.out.println("10 - Number Of Tree Nodes");
            System.out.println("11 - Count Nodes in List");
            System.out.println("12 - Count Number of Leaf Nodes ");
            System.out.println("13 - Binary Tree Depth");*/
            System.out.println("14 - Find Second Largest Number in Array");
            System.out.println("Another input - exit ");
            System.out.println("_________________________________________________");
            System.out.println("");
            System.out.println("What task you want to check?: ");
            int num = StartClass.checkValue();
            switch (num) {
                case 1 : sumOfTwoNumbers();
                    break;
                case 2 : sumMultiplesOfThreeAndFive();
                    break;
                case 3 : factorial();
                    break;
                case 4 : linearSearch();
                    break;
                case 5 : reverseString();
                    break;
                case 6 : findMaximum();
                    break;
                case 7 : averageValue();
                    break;
                case 8 : convertToUpperCase();
                    break;
                case 9 : nthOddElement();
                    break;
                /*case 10 : numberOfTreeNodes();
                    break;
                case 11 : enames();
                    break;
                case 12 : enames();
                    break;
                case 13 : enames();
                    break;*/
                case 14 : findSecondLargestNumberInArray();
                    break;
                default : System.exit(0);
            }
        }
    }
    public static void sumOfTwoNumbers()
    {
        System.out.println("Enter first number: ");
        int firstNumber = StartClass.checkValue();
        System.out.println("Enter second number: ");
        int secondNumber = StartClass.checkValue();
        System.out.println(firstNumber + secondNumber);
    }
    public static void sumMultiplesOfThreeAndFive()
    {
        System.out.println("Enter max value: ");
        int n = StartClass.checkValue();
        int sum = 0;
        for(int i = 0; i <= n; i++)
        {
            if(i % 3 == 0 && i % 5 == 0 && i >= 5)
            {
                sum += i;
            }
        }
        System.out.println(sum);
    }
    public static void factorial()
    {
        System.out.println("Enter max value: ");
        int n = StartClass.checkValue();
        int sum = 0;
        for(int i = 1; i <= n; i++)
        {
                sum *= i;
        }
        System.out.println(sum);
    }
    public static void linearSearch()
    {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Enter value (1 - 10): ");
        int n = StartClass.checkValue();
        for(int i = 1; i < arr.length; i++)
        {
            if(i == n)
            {
                System.out.println(n);
                break;
            }
        }
    }
    public static void reverseString()
    {
        System.out.println("Enter string: ");
        String n = StartClass.enterString();
        char[] nCH = n.toCharArray();
        String res = "";
        for (int i = nCH.length - 1; i > 0 ; i--) {
            res += nCH[i];
        }
        System.out.println(res);

    }
    public static void findMaximum()
    {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int res = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > res)
            {
                res = arr[i];
            }
        }
        System.out.println(res);
    }
    public static void averageValue()
    {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res += arr[i];
        }
        System.out.println(res/ arr.length);
    }
    public static void convertToUpperCase()
    {
        List<String> list = new ArrayList<String>();
        int count = StartClass.checkValue();
        for (int i = 0; i < count; i++)
        {
            System.out.println("Enter " + i + "-th string: ");
            list.add(StartClass.enterString().toUpperCase());
        }
        for(String str : list){

            System.out.println(str);
        }
    }
    public static void nthOddElement()
    {
        List<Integer> list = new ArrayList<Integer>();
        int count = StartClass.checkValue();
        int n = StartClass.checkValue();
        for (int i = 0; i < count; i++)
        {
            System.out.println("Enter " + i + "-th string: ");
            list.add(StartClass.checkValue());
        }
        int elementIndex = 2 * (n-1);
        System.out.println(elementIndex > list.size() - 1 ? -1 : list.get(elementIndex));
    }
    public static void findSecondLargestNumberInArray()
    {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
    }

}
