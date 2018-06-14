package Infierno;

public class EstadoDeprimido extends EstadoDemonio {


    public EstadoDeprimido(Demonio demonio) {
        super(demonio);
    }


    public void serDepresivo(){
        this.serNormal();
    }
    public int dameMiMaldad() {
        return this.getDemonio().getMaldad()/2;
    }
    public boolean esDeprimido(){
        return true;
    }

}
