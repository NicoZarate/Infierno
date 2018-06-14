package Infierno;

public class EstadoDemonio  {
    private Demonio demonio ;

    public EstadoDemonio(Demonio demonio) {
        this.demonio = demonio;
    }

    public Demonio getDemonio() {
        return demonio;
    }

    public void serFeliz(){
        this.getDemonio().setEstado(new EstadoFeliz(this.getDemonio()));

    }
    public void serDepresivo(){
        this.getDemonio().setEstado(new EstadoDeprimido(this.getDemonio()));
    }
    public void serNormal(){
        this.getDemonio().setEstado(new EstadoNormal(this.getDemonio()));
    }

    public void cambiarEstado(){
    }

    public int dameMiMaldad() {
          return this.getDemonio().getMaldad();
    }

    public boolean esDeprimido() {
        return false;
    }
}
