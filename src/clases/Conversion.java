package clases;

public class Conversion {

    private double valor;
    private double trm;

    public Conversion(){
        this.trm = 3500;
    }

    protected double getTrm(){
        return this.trm;
    }

    public void setValor(double equivalencia){
        this.valor = equivalencia;
    }

    protected double getValor(){
        return this.valor;
    }

}
