import java.util.Scanner;

public class lab3 {
    /* WAP to test whether the number is palindrome or not */
    public boolean check_palindrome(int num) 
    {

        int temp = num;
        int rem = 0;
        int reverse = 0;
        while (temp != 0) {
            rem = temp % 10;
            reverse = rem + 10 * reverse;
            temp = temp / 10;
        }

        if (temp == num) {
            return true;
        } else {
            return false;
        }
    }

    public void calculator() {

        Scanner obj = new Scanner(System.in);
        System.out.println("please Enter first number");

        int n1 = obj.nextInt();
        System.out.println("please Enter operator ");

        char c = obj.next().charAt(0);

        System.out.println("please Enter second number");
        int n2 = obj.nextInt();

        switch (c) {
            case '+':
                System.out.println(n1 + n2);

                break;
            case '-':
                System.out.println(n1 - n2);

                break;
            case '*':
                System.out.println(n1 * n2);
                break;
            case '/':
                System.out.println(n1 / n2);
                break;
            case '%':
                System.out.println(n1 % n2);
                break;
            default:
                System.out.println("Invalid opperator");
                break;
        }

    }

}


class Student {

    public String name;
    public int roll_no;
    public String course;

    Student(String Name, int Roll_no, String Course) {
        name = Name;
        roll_no = Roll_no;
        course = Course;
    }

    public void setter(String Name, int Ro_no, String Course) {

        name = Name;
        roll_no = Ro_no;
        course = Course;

    }

    public void getter(){
        System.out.println("Name of the student" + name);
        System.out.println("Name of the student" + roll_no);
        System.out.println("Name of the student" + course);       
    }

}

public static void main(String[] args) {

    Scanner obj1 = new Scanner(System.in);
    int choice;
    lab3 obj = new lab3();
    


    while (true) {

        System.out.println(
                "\n\n\nlab 2 MENU \n 1   :  Check palindrome number \n 2   :  Calculator");
        System.out.println(
                " 3   :  Get charactor at agiven index \n 4   :  Compare two strings  \n 5   :   compare two strings lexicographically, ignoring case  \n  6   :  Create student object \n 7 : Exit");

        System.out.println("Plese enter your choice : ");

        choice = obj1.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Please Enter the number");
                int num = obj1.nextInt();

                if (obj.check_palindrome(num)){
                    System.out.println(num + "Is palindrom number");
                }
                else{
                    System.out.println(num + "Is not palindrom number");
                }
                
                break;
            case 2:
                
                obj.calculator();
                
                break;
            case 3:
                System.out.println("please Enter the string");
                String name = obj1.nextLine();
                System.out.println("plese enter index of char");
                int index = obj1.nextInt(num);

                if(num < name.length()){
                    System.out.println(name.charAt(index));
                }
                else{
                    System.out.println("index is out of range ");
                }
                
                break;
            case 4:
                
                System.out.println("please Enter first string");
                String string1 = obj1.nextLine();
                System.out.println("please Enter second string");
                String string2 = obj1.nextLine();
                System.out.println(string1.compareTo(string2));
                
                break;
            case 5:
                
            System.out.println("please Enter first string");
            String string3 = obj1.nextLine();
            System.out.println("please Enter second string");
            String string4 = obj1.nextLine();
            System.out.println(string3.compareToIgnoreCase(string4));
                
                break;
            case 6:
                
            Student S1 = new Student("Fitsum" , 1047 , "CE - AI");
            
            S1.getter();               
                
                break;
            case 7:
                
                break;
            default:
                break;
        }



    
}