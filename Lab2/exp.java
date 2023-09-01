import java.util.Scanner;
class Exp{
public static void main(String args[]){
int a,b;
System.out.println("Enter a and b:");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
int x=a & b;
System.out.println(x);
}
}