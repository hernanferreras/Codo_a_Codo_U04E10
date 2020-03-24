
package u04e10;

import java.util.Scanner;
public class U04E10 {

    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.print("Ingrese el primer numero: ");
            num1 = entrada.nextInt();
            System.out.print("Ingrese el segundo numero: ");
            num2 = entrada.nextInt();
        }   while (((num1<0)||(num2<0))||((num1>100)||(num2>100)));
            if (num1==0||num2==0){
                    System.out.print("La division es igual a 0 o no se puede realizar");
            }
            else{   
                if((num1>num2)&&(num1%num2==0)){
                    System.out.print("El "+num1+" es divisible por el "+num2);
                }
                else{
                    if((num2>num1)&&(num2%num1==0)){
                            System.out.print("El "+num2+" es divisible por el "+num1);
                    }
                            else{
                                System.out.print("Los numeros no son divisibles");
                            }
                }
                
            }
    }
}