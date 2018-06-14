package Infierno;

import java.util.ArrayList;

public class Tormento implements Mision {

    private ArrayList<Lugar> lugares ;

    public Tormento(ArrayList<Lugar> lugares) {
        this.lugares = lugares;
    }

    public ArrayList<Lugar> getLugares() {
        return lugares;
    }

    public boolean realizarMision(Demonio demonio){
             return false;
    }

    public boolean puedeHacerMision(Demonio demonio){
        for (Lugar lugar: this.lugares) {
              if(!demonio.puedoAtormentar(lugar)){
                  return false;
              }
        }
        return true;
    }

}
