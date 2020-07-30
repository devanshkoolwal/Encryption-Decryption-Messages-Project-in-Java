package javaproject;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author dkool
 */


public class JavaProject extends thrash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        thrash th=new thrash();
   
  Scanner scan=new Scanner(System.in);
  Random random=new Random();
  String in=scan.nextLine();
  char [] input=in.toCharArray();
 
  for(int i=0;i<input.length;i++){
      char temp=input[i];
      
      
      
      
      //for string
      if( (temp>='a' && temp<='z') || (temp>='A' && temp<='Z')){
          if(temp>='a' && temp<='z'){
              System.out.print(th.stringcase[0][(random.nextInt(4))]);
              temp=Character.toUpperCase(temp);
          }
          else if(temp>='A' && temp<='Z'){
              System.out.print(th.stringcase[1][(random.nextInt(4))]);
              
          }
         
           int sum=0;
           int set=random.nextInt(6);
           
    for(int j=0;j<26;j++){
    if(temp==th.alpha[j]){
        sum=th.alphai[(set)][j];
       
    }
    }
    System.out.print(th.sett[(set)]);
     for(int j=0;j<5;j++){
        int c=random.nextInt(9);
        sum=sum-c;
        System.out.print(c);
        }
     
         if((sum>9 && sum<99) || (sum<-9 && sum>-99)){
        System.out.print("y");
        
    }
    else
        System.out.print("z");
   
    
    if(sum<0){
    System.out.print("m"+(-(sum)));
    }
    else   
    System.out.print("n"+sum);
    
      
      
      }
      
      
      
      
      
      //for space
      else if(temp==' '){
      int sum=random.nextInt(99);
      System.out.print((th.stringcase[2][random.nextInt(5)]));
       for(int j=0;j<5;j++){
        int c=random.nextInt(9);
        sum=sum-c;
        System.out.print(c);
        }
     
         if((sum>9 && sum<99) || (sum<-9 && sum>-99)){
        System.out.print("y");
        
    }
    else
        System.out.print("z");
   
    
    if(sum<0){
    System.out.print("m"+(-(sum)));
    }
    else   
    System.out.print("n"+sum);
    
      
      }
      
      
      
      //for numbers
      else if(temp>='0' && temp<='9'){
          System.out.print((th.stringcase[3][random.nextInt(5)]));
          int sum=0;
           int set=random.nextInt(6);
           System.out.print(th.sett[(set)]);
    for(int j=0;j<=9;j++){
    
        sum=th.numri[(set)][(Character.getNumericValue(temp))];
       
    
    }
  for(int j=0;j<5;j++){
        int c=random.nextInt(9);
        sum=sum-c;
        System.out.print(c);
        }
     
         if((sum>9 && sum<99) || (sum<-9 && sum>-99)){
        System.out.print("y");
        
    }
    else
        System.out.print("z");
   
    
    if(sum<0){
    System.out.print("m"+(-(sum)));
    }
    else   
    System.out.print("n"+sum);
    
     }
          
      
  }
  
  
//  System.out.print(input[3]);
   
   
//    Scanner scan=new Scanner(System.in);
//    char ch = scan.next().charAt(0); 
//    int sum=0;
//    for(int i=0;i<25;i++){
//    if(ch==alpha[i]){
//        sum=alphai[i];
//       
//    }
//    }
//    for(int j=0;j<5;j++){
//        int c=rand.nextInt(9);
//        sum=sum-c;
//        System.out.print(c);
//        }
//    if((sum>9 && sum<99) || (sum<-9 && sum>-99)){
//        System.out.print("y");
//        
//    }
//    else
//        System.out.print("z");
//   
//    
//    if(sum<0){
//    System.out.print("m"+(-(sum)));
//    }
//    else   
//    System.out.print("n"+sum);
    
    }
    
}
