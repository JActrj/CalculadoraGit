
package calculadora;
import java.util.Scanner;
public class Operaciones {
    Scanner entrada= new Scanner(System.in);
    private float numero1;
    private float numero2;
    
    public void sumar(float numero1, float numero2){
        float resultado;
        System.out.println("Ingrese el un numero: "); 
        numero1 = entrada.nextFloat();
        System.out.println("ingrese el segundo numero: ");
        numero2 = entrada.nextFloat();
        resultado = numero1 + numero2;
        System.out.println("El resultado es: " + resultado);
    }
    public void restar(float numero1, float numero2){
        float resultado;
        System.out.println("Ingrese el un numero: "); 
        numero1 = entrada.nextFloat();
        System.out.println("ingrese el segundo numero: ");
        numero2 = entrada.nextFloat();
        resultado= numero1 - numero2;
        System.out.println("El resultado es: " + resultado);
    }
    public void multiplicar(float numero1, float numero2){
        float resultado;
        System.out.println("Ingrese el un numero: "); 
        numero1 = entrada.nextFloat();
        System.out.println("ingrese el segundo numero: ");
        numero2 = entrada.nextFloat();
        resultado= numero1 * numero2;
        System.out.println("El resultado es: " + resultado);
    }
    public void dividir(float numero1, float numero2){
        float resultado;
        System.out.println("Ingrese el un numero: "); 
        numero1 = entrada.nextFloat();
        System.out.println("ingrese el segundo numero: ");
        numero2 = entrada.nextFloat();
        resultado= numero1 - numero2;
        if(numero2 == 0){
            System.out.println("No se puede dividir para cero");
        }else{
            resultado= numero1/numero2;
            System.out.println("El resultado es: " +resultado);
        }
    }
    
}
