package Infierno;

import java.util.ArrayList;

public class Demonio {


    private int maldad;
    private int almasAtormentadas;
    private ArrayList<Alma> almasCazadadas;
    private int cantidadDePoderDadaAlDiablo;
    private EstadoDemonio estado;

    public Demonio(int maldad) {
        this.maldad = maldad;
        this.almasAtormentadas = 0;
        this.almasCazadadas = new ArrayList<Alma>();
        this.cantidadDePoderDadaAlDiablo=0;
        this.estado= new EstadoNormal(this);
    }


    public EstadoDemonio getEstado() {
        return estado;
    }

    public void setEstado(EstadoDemonio estado) {
        this.estado = estado;
    }


    public int getCantidadDePoderDadaAlDiablo() {
        return cantidadDePoderDadaAlDiablo;
    }

    public void setCantidadDePoderDadaAlDiablo(int cantidadDePoderDadaAlDiablo) {
        this.cantidadDePoderDadaAlDiablo = cantidadDePoderDadaAlDiablo;
    }

    public ArrayList<Alma> getAlmasCazadadas() {
        return almasCazadadas;
    }

    public void setAlmasCazadadas(ArrayList<Alma> almasCazadadas) {
        this.almasCazadadas = almasCazadadas;
    }

    public int getMaldad() {
        return maldad;
    }

    public void setMaldad(int maldad) {
        this.maldad = maldad;
    }

    public int getAlmasAtormentadas() {
        return almasAtormentadas;
    }

    public void setAlmasAtormentadas(int almasAtormentadas) {
        this.almasAtormentadas = almasAtormentadas;
    }

    public void incrementarAlmasAtormentadas(){
        this.almasAtormentadas++;
    }


    //metodo que determina si puedo cazarla o no, si es jodida no es cazable//
    public boolean esJodida(Alma alma){

        if((alma.getBondad()<this.getEstado().dameMiMaldad())&&(this.condicionParaCazar(alma))){
            return false;
        }
        return true;

    }


    protected  boolean condicionParaCazar(Alma alma){
        return false;
    }

    public void joderAMirival(Alma alma){

    }

    public void atormentarAlma(Alma alma){
        if(this.esJodida(alma)){
                this.joderAMirival(alma);
                this.incrementarAlmasAtormentadas();

        }
    }

    public ArrayList<Alma> cazablesPorMi(Lugar lugar){
        ArrayList<Alma> listaCazable = new ArrayList<Alma>();
        for(Alma alma : lugar.getAlmas()){
              if(!this.esJodida(alma)){
                   listaCazable.add(alma);
              }
        }
        return listaCazable;
    }


    public int cazar(Lugar lugar){
         ArrayList<Alma> listaAuxiliar=new ArrayList<Alma>();
         for(Alma alma : lugar.getAlmas()){
             if(!this.esJodida(alma)){
                    this.getAlmasCazadadas().add(alma);
                    listaAuxiliar.add(alma);
             }else{
                 this.atormentarAlma(alma);
             }
         }
         lugar.getAlmas().removeAll(this.getAlmasCazadadas());
         if(listaAuxiliar.size()>20){
             this.getEstado().serFeliz();
         }
         return listaAuxiliar.size();

    }

    public boolean puedoAtormentar(Lugar lugar){
        for (Alma alma: lugar.getAlmas() ) {
            if(alma.getBondad() < 15 ){
                 return true;
            }

        }
        return false;
    }

    public void soyCastigado(){
        this.maldad = (int)( this.getMaldad() * 0.1);
        this.getEstado().serDepresivo();
    }

    public void incrementarCantidadDePoderDadaAlDiablo(){
        for(Alma alma : this.getAlmasCazadadas()){
            this.cantidadDePoderDadaAlDiablo = alma.getBondad() + alma.getValor();
        }

    }


    public void incrementarMaldad(int i) {
        this.maldad= this.getMaldad() + i;
    }
}
