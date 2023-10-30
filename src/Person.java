import java.util.Scanner;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        // sout
        System.out.println("Hello, my name is " + name);
    }

    public void displayAge() {
        // sout
        System.out.println("I am " + age + " years old");
    }


    // psvm
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        int input = scanner.nextInt();


        Person person = new Person("John", 30);

        // sout
        person.sayHello();
        person.displayAge();

        // fori
        for (int i = 0; i < input; i++) {
            System.out.println("Index: " + i);
        }

        // iter
        String[] fruits = {"Apple", "Orange", "Banana"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // ifn
        String exampleString = null;
        if (exampleString == null) {
            System.out.println("Example string is null");
        }

        // psf
        final double PI = 3.14159;
        System.out.println("Value of PI: " + PI);
    }
}
