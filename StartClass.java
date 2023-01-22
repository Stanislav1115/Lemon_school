import java.util.Scanner;
import java.util.*;

public class StartClass {
    public static void main(String[] args)
    {
        System.out.println("How many words you want to check? ");
        int numb = checkValue();
        if(numb < 0){
            numb *= -1;
        }else if(numb == 0){
            System.out.println("Goodbye!");
            System.exit(0);
        }
        String[] words = new String[numb];
        for(int i = 0; i < words.length; i++)
        {
            System.out.printf("Enter %dth number: ", i+1);
            Scanner input = new Scanner(System.in);
            words[i] = input.nextLine();
        }
        numberOfIdenticalWords(createMap(words));
        getFirst(words);
        getLast(words);
    }

    public static Map<String, Integer> createMap(String[] words)
    {
        Map<String, Integer> data = new HashMap<String, Integer>();
        for(int i = 0; i < words.length; i++)
        {
            if(!(data.containsKey(words[i]))){
                data.put(words[i], 0);
                for(int j = i+1; j < words.length; j++)
                {
                    if(words[j].equals(words[i]))
                    {
                        data.put(words[i], data.get(words[i]) + 1);
                    }
                }
            }
        }
        return data;
    }
    public static void numberOfIdenticalWords(Map<String, Integer> data)
    {
        int result = 0;
        for(Map.Entry<String, Integer> item : data.entrySet()){
            result += item.getValue();
        }
        System.out.println("Number of identical words: " + result);
        theLargestNumberOfIdenticalWords(data);
    }

    public static void theLargestNumberOfIdenticalWords(Map<String, Integer> data)
    {
        int result = 0;
        for(Map.Entry<String, Integer> item : data.entrySet()){
            if(item.getValue() > result)
            {
                result = item.getValue();
            }
        }
        for(Map.Entry<String, Integer> item : data.entrySet()){
            if(item.getValue() == result)
            {
                System.out.println("The Largest: " + item.getKey());
            }
        }
    }
    public static void getFirst(String[] words)
    {
        System.out.println("First word: " + words[0]);
    }
    public static void getLast(String[] words)
    {
        System.out.println("Last word: " + words[words.length - 1]);
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
