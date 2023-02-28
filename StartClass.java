import java.util.Scanner;

public class StartClass {
    public static void main(String[] args)
    {
        Boolean k = true;
        while(k)
        {
            System.out.println("!!!--------------------Start MENU--------------------!!!");
            System.out.println("1 - Task number 1 (enums)");
            System.out.println("2 - Task number 2 (easy lvl)");
            System.out.println("3 - Task number 3 ");
            System.out.println("4 - Task number 4");
            System.out.println("Another input - exit ");
            System.out.println("_________________________________________________");
            System.out.println("What task you want to check?: ");
            System.out.println("");
            System.out.println("");
            int num = checkValue();
            switch (num) {
                case 1 : enames();
                    break;
                case 2 : Task2.task2Start();
                    break;
                case 3 : int a = checkValue();
                        Task3.square(a);
                    break;
                case 4 : String str = enterString();
                        Task3.inversString(str);
                    break;
                case 5 : task5();
                    break;
                default : System.exit(0);
            }
        }
    }
    //===============================================================================

    public static void enames() {
        System.out.println("!!!---Lottery---!!!");
        System.out.println("Enter the values of the element and find out which car you will drive:");
        int index = checkValue() - 1;
        Automobiles[] autos = Automobiles.values();
        /*for(Automobiles automobiles: autos)
        {
            System.out.println(automobiles);
        }*/
        System.out.println(autos[index]);
        //Automobiles automobiles = Automobiles.DEWOO;
        //System.out.println(automobiles.getAutoNumber());
    }

    public static void codeExercises() {

    }
    public static void task5()
    {
        Box box = new Box();
        box.displayInfo();
        Box box1 = new Box(enterString());
        box1.displayInfo();
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
