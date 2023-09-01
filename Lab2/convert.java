import java.util.Scanner;
class Convert{
public static void main(String args[]){
int a;
double b;
char c;
Scanner sc=new Scanner(System.in);
System.out.println("enter an integer:");
a=sc.nextInt();
System.out.println("enter a double:");
b=sc.nextDouble();
System.out.println("enter a character:");
c=sc.next().charAt(0);

byte x=(byte)a;
int y=(int)c;
byte z=(byte)b;
int w=(int)b;

System.out.println(x+" "+y+" "+z+" "+w);
}
}