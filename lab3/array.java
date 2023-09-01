import java.util.Scanner;
class Array{
public static void main(String args[]){
 int arr[]={1,2,3,1,2,1,5,6,7};  
   int key=1;  
   for(int i:arr){  
     if(arr[i]==key){
System.out.println("found at:"+arr[i]);
break;
}
else{
System.out.println("not found");  
   } 
}
}
}
 
 
