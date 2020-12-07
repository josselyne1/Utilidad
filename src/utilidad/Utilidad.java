/*
 * 9.	Calcular la utilidad que un trabajador recibe en el reparto anual de 
utilidades si a este se le asigna un porcentaje de su salario mensual que 
depende de su antigüedad en la empresa de acuerdo con la siguiente tabla:
Tiempo					        Utilidad
	Menos de 1 año					5 % del salario
	1 año o más y menos de 2 años			7% del salario
	2 años o más y menos de 5 años			10% del salario
	5 años o más y menos de 10 años			15% del salario
	10 años o más					20% del salario

 */
package utilidad;

import java.util.Scanner;

/**
 *josselyne ester chilito galindez 
 * cod: 20201187434
 * @author USUARIO
 */
public class Utilidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada =new Scanner (System.in);
        double salariom, antiguedad,utilidad=0;
        
        System.out.println("ingrese tu salario mensual");
        salariom=entrada.nextDouble();
        System.out.println("ingressa tu antiguedad en años");
        antiguedad=entrada.nextDouble();
        
        
        if(antiguedad<1){
            utilidad=salariom*0.05;
            System.out.println("");}
        else{
            if ((antiguedad>=1)&&(antiguedad<2)){
                utilidad=salariom*0.07; }
        else { 
            if ((antiguedad>=2)&&(antiguedad<5)){
            utilidad=salariom*0.1;}
        else{
            if ((antiguedad>=5)&&(antiguedad<10)){
                utilidad=salariom*0.15; }
            else {if (antiguedad>=10){utilidad=salariom*0.2;}}
            }       
            }
            }
        System.out.println("Su Salario total mas la utilidad es: "+(salariom+utilidad));
    }

}
