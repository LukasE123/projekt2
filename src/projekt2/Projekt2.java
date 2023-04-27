/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projekt2;
import java.util.Scanner;


/**
 *
 * @author lukas.ekstrom
 */
public class Projekt2 {
        static    int[] bokningar = new int[21];
      static  Scanner tangentbord= new Scanner(System.in);
      static int index;
      static double pengar;
      
   static void AntalPlatser(){
            index = 0;
       
         for (int i = 0; i < 21; i++) {
            if (bokningar[i] == 0) {
                 index +=1 ;
            }
         }
         System.out.println("Det finns "+index+" lediga platser");
   }

   static void LäggTillAnvändare(){
        System.out.println("Vad är ditt födelsedatum?: ");
        int datum = tangentbord.nextInt();
        tangentbord.nextLine();
        
        for(int i =0; i<21; i++){
            if(bokningar[i] == 0){
                bokningar[i]=datum;
                break;
            }
            
        }
        
        
    }
   
   
   static void Vinst(){
           index = 0;
           pengar = 0;
       
         for (int i = 0; i < 21; i++) {
            if (bokningar[i] != 0) {
                 index +=1 ;
            }
          
         }
                 
          pengar = index*299.99;
             System.out.println("Din vinst är "+pengar+" kr");
       
       
   }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
       int ja = 1;
       
        

       
       while(ja==1){
                   System.out.println("Välj 1-4: ");
                   System.out.println("1. Lägga till en passagerare – boka en obokad plats");
                   System.out.println("2. Skriv ut hur många lediga platser det finns");
                   System.out.println("3. Beräkna vinsten av antalet sålda biljetter");
                   System.out.println("4. Stäng av");
       int val = tangentbord.nextInt();
       tangentbord.nextLine();
           switch(val){
               case 1 -> { LäggTillAnvändare();
                }
               case 2 -> { AntalPlatser();
                }
               case 3 -> { Vinst();
                   
               }
               case 4 -> {
                   ja = 0;
               }
               
           }
           }
           
       }
        
    }
    

