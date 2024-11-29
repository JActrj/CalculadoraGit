
package calculadora;

import java.util.Scanner;
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        String Continuar;
        do{
            int elegir;
            float pnumero = 0, snumero = 0 ;
            Operaciones procedimiento1 =new Operaciones();

            System.out.println("Ingrese 1 para suma: ");
            System.out.println("Ingrese 2 para resta: ");
            System.out.println("Ingrese 3 para multiplicacion: ");
            System.out.println("Ingrese 4 para division: ");
            System.out.println("escoga la opcion: ");
            elegir = entrada.nextInt();
            entrada.nextLine();
            switch(elegir){
                case 1:
                    procedimiento1.sumar(pnumero,snumero);
                    break;
                case 2:
                    procedimiento1.restar(pnumero,snumero);
                    break;
                case 3: 
                    procedimiento1.multiplicar(pnumero,snumero);
                    break;
                case 4:
                    procedimiento1.dividir(pnumero,snumero);
                    break;
                default:
                    System.out.println("opcion invalida");  
            }
            System.out.println("Quiere continuar si o no");
            Continuar = entrada.nextLine();
       } while (!Continuar.equalsIgnoreCase("no"));
        System.out.println("Saliste de calculadora");
    }
    
}
