
package Practica;


import java.util.Scanner;

public class MainSalarioFinal {
    public static void main(String[] args) {
        double salarioB = 0;
        double renta = 0;
        double salarioL = 0;
        SalarioT salarioF = new SalarioT();
        
         
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Digite las horas trabajadas :");
        salarioF.setHT(leer.nextDouble());
        System.out.println("Introdusca el pago por hora :");
        salarioF.setPH(leer.nextDouble());
        System.out.println("------------------------------------");
        salarioF.CSalario();
        
        salarioB = salarioF.CSalario();
        renta = salarioF.rentaT(salarioF);
        salarioL = salarioF.salarioLiquido(salarioF);
        System.out.println("El salario bruto es : $"+salarioB);
        System.out.println("El monto de la retencion aplicada es : $"+renta);
        System.out.println("El salario liquido es : $"+salarioL);
    }
}

