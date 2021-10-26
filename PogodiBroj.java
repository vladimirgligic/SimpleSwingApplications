
package pogodibroj;

import java.util.Scanner;

/**
 *
 * @author vladimirg
 */
public class PogodiBroj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int broj =(int) (Math.random()*10);
       Scanner sc = new Scanner(System.in);  
       int br=0;
//       do {
//           System.out.println("Unesite broj: ");
//            br=sc.nextInt();
//            if(br<broj){
//                System.out.println("Broj je veći");}
//            else if(br>broj){
//                System.out.println("Broj je manji");        }
//            else{System.out.println("Tačan broj");}
//            
//       }while(br!=broj);

        for(int i=0;br!=broj;i++){
           
        System.out.println("Unesite broj: ");
            br=sc.nextInt();
            if(br<broj){
                System.out.println("Broj je veći");}
            else if(br>broj){
                System.out.println("Broj je manji");        }
            else{System.out.println("Tačan broj, pogodili ste iz "+(i+1)+ " puta");}
        }
    }
    
}
