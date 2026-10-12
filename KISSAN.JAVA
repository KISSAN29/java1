1

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integer number:");
        int a = sc.nextInt();

        System.out.println("Enter string:");
        sc.nextLine(); // Consume the leftover newline
        String s = sc.nextLine();

        System.out.println("Enter float number:");
        float f = sc.nextFloat();

        System.out.println("Hello Java");
        System.out.println(a);
        System.out.println(s);
        System.out.println(f);

        sc.close();
    }
}




2

public class Main {
    public static void main(String[] args) {
        System.out.println("College: DSEC");
        System.out.println("Department: AI&DS");
        System.out.println("Course: Java Programming");
    }
}

3

public class Main {
    public static void main(String[] args) {
 System.out.println("JAVA IS SIMPLE JAVA IS POWERFULL");

            }
}

4


public class Main {
    public static void main(String[] args) {
        System.out.println("Name\t:KESAVAN\nCourse\t: Java\nLevel\t: Beginner");
    }
}


5

public class Main {
    public static void main(String[] args) {
        String name = "Arun";
        int age = 21;
        char grade = 'A';
        boolean placementStatus = true;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Placement Status: " + placementStatus);
    }
}