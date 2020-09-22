package clases;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci extends Conversion {

    public List<Double> calcularFibonacci(){

        List<Double> fibonacci = new ArrayList<>();
        double numero = this.getValor();

        double a = 0;
        double b = 1;
        double c = 0;

        for(double i=0; i<numero-1; i++){

            if(i == 0){
                fibonacci.add(i);
            }
            a = b + c;
            b = c;
            c = a;

            fibonacci.add(a);
        }

            return fibonacci;

    }

}
