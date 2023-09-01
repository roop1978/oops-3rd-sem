import java.util.*;
class Numbers{
public static void main(String args[]){
int i,zero=0,pos=0,neg=0,n;
System.out.println("enter numbers:");
for(i=0;i<10;i++){
Scanner sc=new Scanner(System.in);
n=sc.nextInt();

if(n==0){
zero++;
}
if(n>0){
pos++;
}
if(n<0){
neg++;
}
}
System.out.println("number of zeroes:" + zero);
System.out.println("number of negative:" + neg);
System.out.println("number of positive:" + pos);
}
}


