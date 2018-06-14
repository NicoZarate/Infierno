package Infierno;

import java.util.ArrayList;

public class Diablo {
    private ArrayList<Demonio> demonios;
    private ArrayList<Alma> almas;

    public Diablo() {
        this.demonios = new ArrayList<Demonio>();
        this.almas = new ArrayList<Alma>();
    }

    public ArrayList<Demonio> getDemonios() {
        return demonios;
    }

    public ArrayList<Alma> getAlmas() {
        return almas;
    }

    public void rendicionDeCuenta(Demonio demonio){
        if(demonio.getAlmasCazadadas().isEmpty()){
            demonio.soyCastigado();
        }else{
            this.getAlmas().addAll(demonio.getAlmasCazadadas());
            demonio.incrementarCantidadDePoderDadaAlDiablo();
            demonio.setAlmasCazadadas(new ArrayList<Alma>());
        }
    }

    public Demonio elPequenioDiablito(){
        Demonio auxiliarDemonio= this.getDemonios().get(0);
        for(Demonio demonio : this.getDemonios()){
            if(auxiliarDemonio.getCantidadDePoderDadaAlDiablo()>
                    demonio.getCantidadDePoderDadaAlDiablo()){
                auxiliarDemonio=demonio;
            }
        }
        return auxiliarDemonio;
    }
}
