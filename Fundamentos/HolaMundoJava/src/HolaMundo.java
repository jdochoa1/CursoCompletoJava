
import java.util.Scanner;

// Mi clase con Java
public class HolaMundo {

    public static void main(String args[]) {

        /*     for(var contador = 0;contador < 3;contador++){
         if(contador % 2 == 0){
         System.out.println("contador = " + contador);
         //break;
         }
         
     }   */
        inicio: 
        for (var contador = 0; contador < 3; contador++) {
            if (contador % 2 != 0) {

                continue inicio;
            }
            System.out.println("contador = " + contador);

        }

    }

}
