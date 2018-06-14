package Infierno;

public class EstadoNormal extends EstadoDemonio {

    public EstadoNormal(Demonio demonio) {
        super(demonio);
    }

    public void cambiarEstado(){
       this.serFeliz();
    }


}
