package shubham.assignment.singleton;

public class Singleton {
     String string;
    public static Singleton initializeVariable(String string)
    {
        //this.string=string;
        return new Singleton();
    }

    public void printString()
    {
        System.out.println(string);
    }
}
//Here we cannot access non-static member from static function.
//