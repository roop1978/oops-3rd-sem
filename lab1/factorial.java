import java.util.Scanner;
class Factorial{
public static int fact(int x){
int f=1;
for(int i=1;i<=x;i++){
f*=i;
}
return f;
}
public static void main(String args[]){
System.out.println("enter a number:");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println(fact(n));
}
}