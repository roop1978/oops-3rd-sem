import java.util.*;
class Odd{
public static void main(String args[]){
int n=0,i,flag=1;
while(n<100){
if(n%2==0){
flag=0;
}
n++;
}
while(n<100){
if(flag==1){
System.out.println("odd numbers are:" + n);
}
n++;
}
}
}
