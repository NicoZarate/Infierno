package Infierno;

public class Safari implements Mision{

    private Lugar lugar;
    private Double porcentajeDeAlmasACazar;

    public Safari(Lugar lugar, Double porcentajeDeAlmasACazar) {
        this.lugar = lugar;
        this.porcentajeDeAlmasACazar = porcentajeDeAlmasACazar;
    }

    public Double getPorcentajeDeAlmasACazar() {
        return porcentajeDeAlmasACazar;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public boolean realizarMision(Demonio demonio){
         /*  if((demonio.cazar(this.lugar))&&()){

           }
         */
         return false;
    }

    public boolean puedeHacerMision(Demonio demonio){
        int cantDeAlmas= demonio.cazablesPorMi(this.getLugar()).size();
        int resultadoPorcentajeAlmas=(int)(this.getLugar().getAlmas().size()* this.getPorcentajeDeAlmasACazar())/100;
        if((cantDeAlmas>0)&&(cantDeAlmas>=resultadoPorcentajeAlmas)){
            demonio.getEstado().cambiarEstado();
            return true;
        }
        return false;
    }
}
