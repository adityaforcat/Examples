import java.util.*;
class FactorialExample{  
 public static void main(String args[]){  
  int i,fact=1;  
  Scanner kb = new Scanner(System.in);
  int n = kb.nextInt();
  for(i=1;i<=n;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+n+" is: "+fact);    
 }  
}  
