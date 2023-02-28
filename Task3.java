import java.lang.StringBuilder;
public class Task3 {
    public static int square(int a)
    {
        return a*=a;
    }
    public static String inversString (String str)
    {
        return new StringBuilder(str).reverse().toString();
    }
}
