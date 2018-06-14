package Infierno;

public class EstadoFeliz extends EstadoDemonio {

    public EstadoFeliz(Demonio demonio) {
        super(demonio);
    }

    public void serFeliz(){}
    public void cambiarEstado(){
        this.getDemonio().incrementarMaldad(5);
    }

    public int dameMiMaldad() {
        return this.getDemonio().getMaldad()*2;
    }
}
