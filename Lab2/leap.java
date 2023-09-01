import java.util.Scanner;
class Leap{
public static void main(String args[]){
int n;
System.out.println("Enter a number:");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
if(n%4!=0){
System.out.println("not a leap year");
}
else if(n%100!=0){
System.out.println("is a leap year");
}
else{
System.out.println("not a leap year");
}
}
}