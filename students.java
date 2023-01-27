
/*
Design a class for a student at a school. The class should have the following features:
         - Instance variables for the student's name, grade level, and GPA.
         - A constructor that allows the user to create a student with a given name, grade level, and GPA.
         - A method that allows the user to update the student's GPA.
         - A method that returns the student's name and GPA as a string (e.g. ""John Doe has a 3.5 GPA"")."*/
import java.util.*;

class cal {
    String name;
    double gpa = 0, newGpa;

    cal(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    void update(double newGpa) {
        gpa = newGpa;
    }

    void putData() {
        System.out.println(name + " has " + gpa + " GPA ");

    }
}

class students {
    public static void main(String args[]) {
        String name;

        double gpa;
        int ch = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Student's name : ");
        name = sc.nextLine();
        System.out.print("Enter the Grade \nA press 5 \nB press 4 \nC press 3 \nD press 2 \nE press 1 \n");
        gpa = sc.nextInt();
        cal ob = new cal(name, gpa);
        ob.putData();
        while (ch != 2) {
            System.out.println("IF YOU NEED TO UPDATE ENTER '1' \nIF YOU NEED TO EXIT ENTER '2' \n");
            ch = sc.nextInt();
            switch (ch) {
                case 1: {
                    System.out.print("Enter the correct Grade : ");
                    double newGpa = sc.nextDouble();
                    ob.update(newGpa);
                    ob.putData();
                }
                    break;

                case 2:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}