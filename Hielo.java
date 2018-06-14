package Infierno;

public class Hielo extends Demonio {

    public Hielo(int maldad) {
        super(maldad);
    }

    protected boolean condicionParaCazar(Alma alma){
            if(alma.isFriolento()){
                return true;
            }
            return false;
    }
    public void joderAMirival(Alma alma){
        if((!alma.isFriolento())&&(!this.getEstado().esDeprimido())){
            alma.cambiarEstado();
        }

    }
}
