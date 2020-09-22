package main;

import clases.DolaresAPesos;
import clases.Fibonacci;
import clases.PesosADolares;

import javax.swing.*;

public class Main {

    public static void main(String [] args){

        PesosADolares pesosADolares = new PesosADolares();
        DolaresAPesos dolaresAPesos = new DolaresAPesos();
        Fibonacci fibonacci = new Fibonacci();

        String opcion = JOptionPane.showInputDialog(null,
                "1. Convertir de Pesos Colombianos a Doláres Americanos" +
                        "\n2. Convertir de Doláres Americanos a Pesos Colombianos" +
                        "\n3.Serie Fibonacci");
        switch (opcion){

            case "1":
                double valorPesos = Double.parseDouble(JOptionPane.showInputDialog(null,
                        "Ingrese el valor de Pesos Colombianos a convertir"));
                pesosADolares.setValor(valorPesos);
                JOptionPane.showMessageDialog(null,
                        "El valor equivalente en dólares es " + pesosADolares.convertirEquivalencia());
                break;

            case "2":
                double valorDolares = Double.parseDouble(JOptionPane.showInputDialog(null,
                        "Ingrese el valor de Dólares a convertir"));
                dolaresAPesos.setValor(valorDolares);
                JOptionPane.showMessageDialog(null,
                        "El valor equivalente en Pesos Colombianos es " + dolaresAPesos.convertirEquivalencia());

                break;

            case "3":
                double numero = Double.parseDouble(JOptionPane.showInputDialog(null,
                        "Ingrese el valor para ver la serie fibonacci"));

                fibonacci.setValor(numero);
                JOptionPane.showMessageDialog(null,
                        "" + fibonacci.calcularFibonacci());

                break;

            default:
                JOptionPane.showMessageDialog(null,
                        "Opción incorrecta.");

        }

    }

}
