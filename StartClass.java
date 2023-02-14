import java.util.Scanner;
import java.util.Arrays;

public class StartClass {
    public static void main(String[] args)
    {
        Boolean k = true;
        while(k)
        {
            System.out.println("!!!--------------------Start MENU--------------------!!!");
            System.out.println("1 - Task number 1 ");
            System.out.println("2 - Task number 2 ");
            System.out.println("3 - Task number 3 ");
            System.out.println("4 - Task number 4");
            System.out.println("Another input - exit ");
            System.out.println("_________________________________________________");
            System.out.println("What task you want to check?: ");
            System.out.println("");
            System.out.println("");
            int num = checkValue();
            switch (num) {
                case 1 : System.out.println(TaskNumber1());
                    break;
                case 2 : System.out.println(TaskNumber2());;
                    break;
                case 3 : System.out.println(TaskNumber3());
                    break;
                case 4 : System.out.println(TaskNumber4());
                    break;
                default : System.exit(0);
            }
        }
    }
    //===============================================================================
    public static Boolean TaskNumber1()
    {
        System.out.println("Input a substring");
        String subStr = enterString();
        char[] subStrCh = subStr.toCharArray();
        System.out.println("Input a string: ");
        String str = enterString();
        str = str.substring((str.length() - 1) - (subStr.length() - 1));
        char[] strCh = str.toCharArray();
        Boolean k = true;
        while (k)
        {
            System.out.println("1  - Cycles");
            System.out.println("2  - Standart");
            System.out.print("Which method do you want to use?: ");
            int value = checkValue();
            switch (value)
            {
                case 1: return strCycle(str, subStr);
                case 2: return strStandart(str, subStr);
                default: System.exit(0);
            }
        }
        return null;
    }
    public static Boolean strCycle(String str, String subStr)
    {
        char[] subStrCh = subStr.toCharArray();
        char[] strCh = str.toCharArray();

        for(int i = 0; i < strCh.length; i++)
        {
            if(strCh[i] != subStrCh[i])
            {
                return false;
            }
            if(i == (strCh.length - 1))
            {
                if(strCh[i] == subStrCh[i])
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
        return null;
    }
    public static Boolean strStandart(String str, String subStr)
    {
        return str.equals(subStr);
    }

    // =================================================================================
    public static Boolean TaskNumber2()
    {
        System.out.println("Input a substring");
        String subStr = enterString();
        char[] subStrCh = subStr.toCharArray();
        System.out.println("Input a string: ");
        String str = enterString();
        //str = str.substring((str.length() - 1) - (subStr.length() - 1));
        char[] strCh = str.toCharArray();
        Boolean k = true;
        while (k)
        {
            System.out.println("1  - Cycles");
            System.out.println("2  - Standart");
            System.out.print("Which method do you want to use?: ");
            int value = checkValue();
            switch (value)
            {
                case 1: return strCycle2(str, subStr);
                case 2: return strStandart2(str, subStr);
                default: System.exit(0);
            }
        }
        return null;
    }
    public static Boolean strCycle2(String str, String subStr)
    {
        char[] subStrCh = subStr.toCharArray();
        char[] strCh = str.toCharArray();

        for(int i = 0; i < strCh.length; i++)
        {
            if(i == (strCh.length - subStrCh.length - 1) && strCh[i] != subStrCh[0])
            {
                return false;
            }
            else if (strCh[i] == subStrCh[0]) {
                for(int j = 0; j < subStrCh.length; j++)
                {
                    if(strCh[i+j] != subStrCh[j])
                    {
                        break;
                    }
                    if(j == (subStrCh.length-1) && strCh[i+j] == subStrCh[j])
                    {
                        return true;
                    }
                }

            }
        }
        return null;
    }
    public static Boolean strStandart2(String str, String subStr)
    {
        if (str.contains(subStr))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    // =================================================================================
    public static Boolean TaskNumber3()
    {
        System.out.println("Input a substring");
        String subStr = enterString();
        subStr = subStr.toLowerCase();
        System.out.println("Input a string: ");
        String str = enterString();
        str = str.toLowerCase();
        Boolean k = true;
        while (k)
        {
            System.out.println("1  - Cycles");
            System.out.println("2  - Standart");
            System.out.print("Which method do you want to use?: ");
            int value = checkValue();
            switch (value)
            {
                case 1: return strCycle3(str, subStr);
                case 2: return strStandart3(str, subStr);
                default: System.exit(0);
            }
        }
        return null;
    }
    public static Boolean strCycle3(String str, String subStr)
    {
        char[] subStrCh = subStr.toCharArray();
        char[] strCh = str.toCharArray();

        for(int i = 0; i < strCh.length; i++)
        {
            if(i == strCh.length-1 && strCh[i] == subStrCh[i])
            {
                return true;
            }
            if(strCh[i] != subStrCh[i])
            {
                return false;
            }
        }
        return null;
    }
    public static Boolean strStandart3(String str, String subStr)
    {
        if (str.contains(subStr))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    // =================================================================================
    public static Boolean TaskNumber4()
    {
        System.out.println("Input a string: ");
        String str = enterString();
        System.out.println("Input a substring");
        String subStr = enterString();
        str = str.substring(0, (subStr.length() - 1));
        char[] subStrCh = subStr.toCharArray();
        char[] strCh = str.toCharArray();
        Boolean k = true;
        while (k)
        {
            System.out.println("1  - Cycles");
            System.out.println("2  - Standart");
            System.out.print("Which method do you want to use?: ");
            int value = checkValue();
            switch (value)
            {
                case 1: return strCycle4(str, subStr);
                case 2: return strStandart4(str, subStr);
                default: System.exit(0);
            }
        }
        return null;
    }
    public static Boolean strCycle4(String str, String subStr)
    {
        char[] subStrCh = subStr.toCharArray();
        char[] strCh = str.toCharArray();

        for(int i = 0; i < strCh.length ; i++)
        {
            if(strCh[i] != subStrCh[i])
            {
                return false;
            }
            if(i == (strCh.length - 1))
            {
                if(strCh[i] == subStrCh[i])
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
        return null;
    }
    public static Boolean strStandart4(String str, String subStr)
    {
        return str.equals(subStr);
    }

    public static int checkValue(){
        Scanner input = new Scanner(System.in);
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

    public static String enterString(){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        return str;
    }
}
