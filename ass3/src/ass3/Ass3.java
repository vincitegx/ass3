

        /* NAME: BINUYO OLAJIDE SIMEON
MATRIC NO :CSC/15/3045
DEPT: COMPUTER SCIENCE*/
package Ass3;
import java.util.Scanner;
public class Ass3 {   
    public static void main(String[] args) {
        Scanner vinci = new Scanner(System.in);
        int i;
        System.out.print("please enter the number of students: ");
        i = vinci.nextInt();
        int[] score = new int[i]; //declare array score
        String[] names = new String[i]; //declare array names     
        for (int f = 0; f<i; f++) 
        {
            System.out.println("please enter your name: ");
            names[f]= vinci.next();
            System.out.print("please enter your score: ");
            score[f] = vinci.nextInt();
        }
        int high,low;
         high = score[0];
         low = score[0];
         for (int f = 0; f < i; f++){
             if (score [f]> high && high >= low){
                 low = high;
                 high = score[f];}
             else if(score[f]>high && high < low){
                     high = score[f];}}
               String hname = "",lname="";
        for(int f = 0; f < i; f++){
            if(score[f]== high){
                hname=names[f];}
            if(score[f]==low){
                lname=names[f];} }  
     System.out.print(high);
     System.out.println(hname);
     System.out.print(low);
    System.out.println(lname);
    }
}
  

    
    


            
        
    
    

