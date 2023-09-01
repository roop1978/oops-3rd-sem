import java.util.Scanner;
class Ternary{
public static void main(String args[]){
int a,b,c;
System.out.println("Enter three numbers:");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();

int x=((a>b && a>c)?a:(b>c)?b:c);
System.out.println("the greatest of three is:" +" "+x);
int y=((a<b && a<c)?a:(b<c)?b:c);
System.out.println("the smallest of three is:" +" "+y);
}
}