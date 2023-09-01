import java.util.Scanner;
class Palindrome{
public static void main(String args[]){
int n,i,digit,rev=0;
System.out.println("enter a number:");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
while(n!=0){
digit=n%10;
rev=10*rev+digit;
n=n/10;
}
if(rev==n){
System.out.println("number entered is a plaindrome");
}
else{
System.out.println("isnot a palindrome");
}
}
}
