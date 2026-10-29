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


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0){
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
           System.out.println("Sum of digits = " + sum);
        
    }
}




import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
         int b = sc.nextInt();
              int gcd = 1;
            int limit  = Math.min(a,b);
        for (int i = 1; i <= limit; i++){
            if (a % i == 0 && b % i == 0){
                gcd = i;
            }
        }
    System.out.println("GCD =" + gcd);
    }
}





import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        System.out.println("Reverse = " + reverse);

        sc.close();
    }
}


import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        boolean identity = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j && a[i][j] != 1) {
                    identity = false;
                } else if (i != j && a[i][j] != 0) {
                    identity = false;
                }
            }
        }
        if (identity) {
            System.out.println("identity matrix");
        } else {
            System.out.println("not an identity matrix");
        }
    }
}



import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String[] words = S.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int j = word.length() - 1; j >= 0; j--) {
                result += word.charAt(j);
            }
            if (i < words.length - 1) {
                result += " ";
            }
        }
        System.out.println(result);
    }
}




import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0){
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
           System.out.println("Sum of digits = " + sum);
        
    }
}




import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
         int b = sc.nextInt();
              int gcd = 1;
            int limit  = Math.min(a,b);
        for (int i = 1; i <= limit; i++){
            if (a % i == 0 && b % i == 0){
                gcd = i;
            }
        }
    System.out.println("GCD =" + gcd);
    }
}





import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        System.out.println("Reverse = " + reverse);

        sc.close();
    }
}


import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        boolean identity = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j && a[i][j] != 1) {
                    identity = false;
                } else if (i != j && a[i][j] != 0) {
                    identity = false;
                }
            }
        }
        if (identity) {
            System.out.println("identity matrix");
        } else {
            System.out.println("not an identity matrix");
        }
    }
}



import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String[] words = S.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int j = word.length() - 1; j >= 0; j--) {
                result += word.charAt(j);
            }
            if (i < words.length - 1) {
                result += " ";
            }
        }
        System.out.println(result);
    }
}


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first word:");
        String s1 = sc.nextLine();

        System.out.println("Enter the second word:");
        String s2 = sc.nextLine();

        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
        } else {
            char[] a = s1.toCharArray();
            char[] b = s2.toCharArray();

            java.util.Arrays.sort(a);
            java.util.Arrays.sort(b);

            if (java.util.Arrays.equals(a, b)) {
                System.out.println("Anagram");
            } else {
                System.out.println("not Anagram");
            }
        }
    }
}
