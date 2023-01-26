import java.util.Scanner;
import java.util.Arrays;

public class StartClass {
    public static void main(String[] args)
    {
        System.out.println("How many elements will be in the array: ");
        int numb = checkValue();
        int[] array = new int[numb];
        for (int i = 0; i < array.length; i++) {
            array[i] = checkValue();
        }
        String arrayString = Arrays.toString(array);
        System.out.println(arrayString);
        Boolean k = true;
        while(k)
        {
            System.out.println("!!!--------------------Start MENU--------------------!!!");
            System.out.println("1  - Multiplicity Cycles ");
            System.out.println("__________");
            System.out.println("2  - Non-pairing Cycles ");
            System.out.println("__________");
            System.out.println("3 - indices Standart ");
            System.out.println("__________");
            System.out.println("4  - sort Cycles ");
            System.out.println("44 - sort Standart ");
            System.out.println("__________");
            System.out.println("5  - numberOfParied Cycles ");
            System.out.println("__________");
            System.out.println("6  - numberOfNonParied Cycles ");
            System.out.println("__________");
            System.out.println("7  - numberOfMultiplicity Cycles ");
            System.out.println("__________");
            System.out.println("8  - sumEverySecond Cycles ");
            System.out.println("Another input - exit ");
            System.out.println("_________________________________________________");
            System.out.println("What task you want to check?: ");
            System.out.println("");
            System.out.println("");
            int num = checkValue();
            switch(num)
            {
                case 1: multiplicityCycles(array);
                    break;
                case 2: nonPairingCycles(array);
                    break;
                case 3: indicesStandart(array);
                    break;
                case 4: sortCycles(array);
                    break;
                case 44: sortStandart(array);
                    break;
                case 5: numberOfPariedCycles(array);
                    break;
                case 6: numberOfNonPariedCycles(array);
                    break;
                case 7: numberOfMultiplicityCycles(array);
                    break;
                case 8: sumEverySecondCycles(array);
                    break;
                default: System.exit(0);
            }
        }
    }
    public static void multiplicityCycles(int[] array)
    {
        System.out.println("Enter the number by which you want the elements of the array to be reduced: ");
        int num = checkValue();
        for(int i = 0; i < array.length; i++)
        {
            if((array[i] >= num) && (array[i] % num == 0))
            {
                System.out.println(array[i]);
            }
        }
    }

    public static void nonPairingCycles(int[] array)
    {
        int sum = 0;
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] % 2 != 0 )
            {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }
    public static void indicesStandart(int[] array)
    {
        int number = checkValue();
        System.out.println(Arrays.binarySearch(array, number));
    }
    public static void sortCycles(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            for(int j = i+1; j < array.length; j++)
            {
                if(array[j] > array[i])
                {
                    int count = array[i];
                    array[i] = array[j];
                    array[j] = count;
                }
            }
        }
        System.out.println("Sort descending");
        System.out.println(Arrays.toString(array));
        System.out.println("--------");
        for(int i = 0; i < array.length; i++)
        {
            for(int j = i+1; j < array.length; j++)
            {
                if(array[j] < array[i])
                {
                    int count = array[i];
                    array[i] = array[j];
                    array[j] = count;
                }
            }
        }
        System.out.println("Sort ascending");
        System.out.println(Arrays.toString(array));
    }
    public static void sortStandart(int[] array)
    {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void numberOfPariedCycles(int[] array)
    {
        int sum = 0;
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] % 2 == 0 )
            {
                sum += 1;
            }
        }
        System.out.println(sum);
    }
    public static void numberOfNonPariedCycles(int[] array)
    {
        int sum = 0;
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] % 2 != 0 )
            {
                sum += 1;
            }
        }
        System.out.println(sum);
    }
    public static void numberOfMultiplicityCycles(int[] array)
    {
        int sum = 0;
        int number = checkValue();
        for(int i = 0; i < array.length; i++)
        {
            if((array[i] % number == 0) && (array[i] > number))
            {
                sum += 1;
            }
        }
        System.out.println(sum);
    }
    public static void sumEverySecondCycles(int[] array)
    {
        {
            int sum = 0;
            for(int i = 0; i < array.length; i++)
            {
                if((i % 2 != 0) && (i != 0))
                {
                    sum += array[i];
                }
            }
            System.out.println(sum);
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
