public class Box {
    String value;
    Box()
    {
        value = "Undefined";
    }
    Box(String n)
    {
        value = n;
    }
    void displayInfo(){
        System.out.printf("Value: %s ", value);
    }
}
