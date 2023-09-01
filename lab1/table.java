import java.util.Scanner;
class Table{
public static void main(String args[]){
int n;
System.out.println("Enter a number:");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(int i=0;i<=10;i++){
System.out.println(n +"x" + i +"=" + n*i);
}
}
}