import java.util.Scanner;
class Bitwise{
public static void main(String args[]){
int a;


System.out.println("Enter number:");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
int x=a>>1;
int y=a<<1;
System.out.println(x+" " +y);
}
}