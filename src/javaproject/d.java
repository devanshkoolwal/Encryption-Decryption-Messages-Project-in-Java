/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.util.Scanner;

/**
 *
 * @author dkool
 */
public class d extends thrash {
    
    public static void main(String ar[]){
        Scanner scan=new Scanner(System.in);
        String cod=scan.nextLine();
        char[] code=cod.toCharArray();
        int stringcase=-1;
        thrash th=new thrash();
        int set=-1;
        for(int i=0;i<code.length;){
            
            
            for(int j=i;j<(i+9);j++){
                        
                for(int k=0;k<4;k++){
                    for(int h=0;h<5;h++){
                       if(code[j]==th.stringcase[k][h]) {
                        stringcase=k;   
                       }
                        }
                    
                }
                j++;
                
                for(int k=0;k<7;k++){
                if(code[j]==th.sett[k]){
                set=k;
                }
                }
                j++;
                //lower case
                if(stringcase==0){
                int ch=-1;
                int sum=0;
                    for(int num_sum=j;num_sum<(j+5);num_sum++){
                    sum=sum+Character.getNumericValue(code[num_sum]);
                    
                    }
                j=j+5;
                
                
                if(code[(j+1)]=='m'){
                    if(code[j]=='y'){
                      ++i;
                    int a=Character.getNumericValue(code[j+2]);
                    int b=Character.getNumericValue(code[j+3]);
                    
                    int c=(a*10)+b;
                    sum=sum-c;
                    }
                    
                    else{
                    int a=Character.getNumericValue(code[j+2]);
                    sum=sum-a;
                    }
                       
                }
                
                else if(code[(j+1)]=='n'){
                if(code[j]=='y'){
                      ++i;
                    int a=Character.getNumericValue(code[j+2]);
                    int b=Character.getNumericValue(code[j+3]);
                    
                    int c=(a*10)+b;
                    sum=sum+c;
                    }
                    
                    else{
                    int a=Character.getNumericValue(code[j+2]);
                    sum=sum+a;
                    }
                }
                for(int k=0;k<26;k++){
                if(sum==th.alphai[set][k]){
                ch=k;
                }
                }
                
                System.out.print(Character.toLowerCase(th.alpha[ch]) );
                break;
                
                }
                //Upper case
                else if(stringcase==1){
                //System.out.print("Upper case");
                int ch=-1;
                int sum=0;
                    for(int num_sum=j;num_sum<(j+5);num_sum++){
                    sum=sum+Character.getNumericValue(code[num_sum]);
                    
                    }
                j=j+5;
                
                
                if(code[(j+1)]=='m'){
                    if(code[j]=='y'){
                      ++i;
                    int a=Character.getNumericValue(code[j+2]);
                    int b=Character.getNumericValue(code[j+3]);
                    
                    int c=(a*10)+b;
                    sum=sum-c;
                    }
                    
                    else{
                    int a=Character.getNumericValue(code[j+2]);
                    sum=sum-a;
                    }
                       
                }
                
                else if(code[(j+1)]=='n'){
                if(code[j]=='y'){
                      ++i;
                    int a=Character.getNumericValue(code[j+2]);
                    int b=Character.getNumericValue(code[j+3]);
                    
                    int c=(a*10)+b;
                    sum=sum+c;
                    }
                    
                    else{
                    int a=Character.getNumericValue(code[j+2]);
                    sum=sum+a;
                    }
                }
                for(int k=0;k<26;k++){
                if(sum==th.alphai[set][k]){
                ch=k;
                }
                }
                
                System.out.print(Character.toUpperCase(th.alpha[ch]) );
                break;

                }
                 //space
                else if(stringcase==2){
                System.out.print(" ");
                break;
                }
                 
                 
                 //number
                else if(stringcase==3){
                int ch=-1;
                int sum=0;
                    for(int num_sum=j;num_sum<(j+5);num_sum++){
                    sum=sum+Character.getNumericValue(code[num_sum]);
                    
                    }
                j=j+5;
                
                
                if(code[(j+1)]=='m'){
                    if(code[j]=='y'){
                      ++i;
                    int a=Character.getNumericValue(code[j+2]);
                    int b=Character.getNumericValue(code[j+3]);
                    
                    int c=(a*10)+b;
                    sum=sum-c;
                    }
                    
                    else{
                    int a=Character.getNumericValue(code[j+2]);
                    sum=sum-a;
                    }
                       
                }
                
                else if(code[(j+1)]=='n'){
                if(code[j]=='y'){
                      ++i;
                    int a=Character.getNumericValue(code[j+2]);
                    int b=Character.getNumericValue(code[j+3]);
                    
                    int c=(a*10)+b;
                    sum=sum+c;
                    }
                    
                    else{
                    int a=Character.getNumericValue(code[j+2]);
                    sum=sum+a;
                    }
                }
                for(int k=0;k<10;k++){
                if(sum==th.numri[set][k]){
                ch=k;
                }
                }
                
                System.out.print(ch);
                break;
                }
                
                
            }
            i+=10;
        }
        
        
    }
    
}
