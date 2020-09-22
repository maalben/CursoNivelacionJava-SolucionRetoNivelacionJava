package clases;

public class DolaresAPesos extends Conversion {

    public double convertirEquivalencia(){
        return (this.getValor() * this.getTrm());
    }

}
