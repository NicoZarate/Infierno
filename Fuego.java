package Infierno;

public class Fuego extends Demonio {

    public Fuego(int maldad) {
        super(maldad);
    }

    public void superAtormentador(){}


    protected boolean condicionParaCazar(Alma alma){
          if(alma.isFriolento()){
              return false;

          }
          return true;
    }

    public void joderAMirival(Alma alma){
        if((alma.isFriolento())&&(!this.getEstado().esDeprimido())){
            alma.cambiarEstado();
        }

    }
}
