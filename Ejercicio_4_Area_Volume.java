
import java.util.Scanner;

// Kilómetros por galón(US) = mpg*1.609344
public class Ejercicio_4_Area_Volume
    {
        public static void main(String[] args)
        {
        double r,Area,Volumen;
        Scanner Tecl = new Scanner(System.in);
        System.out.println("Calculo de Area y volumen ingresando el radio");
        System.out.print("medida del radio = ");
        r = Tecl.nextDouble();
        Area = Math.PI * Math.pow(r,2);
        Volumen=(4/3)*Math.PI*(r*r*r);
        System.out.println("El area del circulo de radio "+r+" es = "+ Area);
        System.out.println("El Volumen de una esfera de radio "+r+" es = "+ Volumen);
    }
    }