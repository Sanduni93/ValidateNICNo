
package hackelite5;

import java.util.Scanner;

public class HackElite5 {

    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scn = new Scanner(System.in);
        
            System.out.println("Enter NIC:");
            String s = scn.nextLine();
     
       
          int i = 0;
        char ch = s.charAt(i);
        if((ch=='2') && (s.length()==12)){
            System.out.println("Valid - New");
        }
        else if((ch!='2') && (s.length()==10)) {
        int k = 9;
         char ch1 = s.charAt(k);
            if((ch1=='v')){
                System.out.println("Valid - Old");
            
            }
            else{
                System.out.println("Invalid");
            }
        }
        
        }
     
        
     
      
       
      
           }
     
    
           
           
           
           
       
       
       
     
        
    
         
         
         
       
       
    
    
