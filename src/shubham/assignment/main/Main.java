package shubham.assignment.main;
import shubham.assignment.data.FirstPackage;
import shubham.assignment.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        FirstPackage firstPackage=new FirstPackage();
        Singleton singleton=new Singleton();
        firstPackage.printInstanceVariable();
       // firstPackage.printLocalVariable();
        singleton.printString();
        Singleton singleton1=singleton.initializeVariable("Hiii");
    }
}
