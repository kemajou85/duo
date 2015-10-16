/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duo;

/**
 *
 * @author macbookproretina
 */
public class Duo {
 public int i;
 public static int fin=0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("resultat: "+factorielle(3));
        
    }
    
    public static int factorielle(int a){
        if((a-1)>=0){
            
        System.out.println("factorielle de "+a);
            fin=fin+(a+(a-1));
            factorielle(a-1);
        }
        return fin;
    }
    
   public int factorielle2(int a){
        return a+a;
    }
}
