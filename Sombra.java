package Infierno;

public class Sombra extends Demonio {
    private int limite;


    public Sombra(int maldad, int limite) {
        super(maldad);
        this.limite = limite;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    protected boolean condicionParaCazar(Alma alma){
           if(alma.getValor()< this.getLimite()){
               return true;
           }
           return false;
    }

    public void joderAMirival(Alma alma){
           alma.reducirValor();
    }
}
