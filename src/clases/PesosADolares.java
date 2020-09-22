package clases;

public class PesosADolares extends Conversion {

    public double convertirEquivalencia(){
        return (this.getValor() / this.getTrm());
    }

}
