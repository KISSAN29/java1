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


6



import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int largest = (a >= b && a >= c) ? a :
                      (b >= a && b >= c) ? b : c;

        System.out.println(largest);

    }
}                  



7


import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int e = sc.nextInt();
    int f = sc.nextInt();
    int g = sc.nextInt();

    String result = (a >= 35 && b >= 35 && c >= 35 && e >= 35 && f >=35 && g <=35) ? "Pass" : "Fail";

  System.out.println(result);

}


}

8


import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
  
    String result1 = (a >= 18 ) ? "Elligible" : "Not Elligible";
    String result2 = (b >= 18 ) ? "Elligible" : "Not Elligible";
    String result3 = (c >= 18 ) ? "Elligible" : "Not Elligible";
    String result4 = (d >= 18 ) ? "Elligible" : "Not Elligible";

    System.out.println(result1);
     System.out.println(result2);
     System.out.println(result3);
     System.out.println(result4);

}


}




9


import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

    int amount = sc.nextInt();
    boolean premium = sc.nextBoolean();

    String result = (amount >= 1000 || premium) ? "Free Delivery" : "Delivery Charges Apply";

    System.out.println(result);

}

}    

10

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);


    int a = sc.nextInt();
    int b = sc.nextInt();

    String result1 = (a >= 1) ? "yes" : "no";
    String result2 = (b >= 2) ? "yes" : "no";

    System.out.println(result1);
    System.out.println(result2);

   
}


}
