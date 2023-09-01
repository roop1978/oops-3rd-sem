//Write a Java program to read an int number, double number and a char from keyboard and 
//perform the following conversions:- int to byte, char to int, double to byte, double to //int
import java.util.Scanner;
class Calc{
public static void main(String args[]){
int a,b;
char op,d;
do{
System.out.println("Enter first number:");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
System.out.println("Enter operator:");
// Scanner sc=new Scanner(System.in);
op=sc.next().charAt(0);
System.out.println("Enter second number:");
// Scanner sc=new Scanner(System.in);
b=sc.nextInt();
switch(op){
    case '+':
    System.out.println("sum:"+(a+b));
    break;
    case '-':
    System.out.println("difference:"+(a-b));
    break;
    case '*':
    System.out.println("product:"+(a*b));
    break;
    case '/':
    System.out.println("quotient:"+(a/b));
    }
    System.out.println("enter y to calculate again,n to exit");
    d=sc.next().charAt(0);

}while(d=='y');
}
}
