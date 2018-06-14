package Infierno;

import java.util.ArrayList;

public class Lugar {
    private String lugar;
    private ArrayList<Alma> almas;


    public Lugar(String lugar) {
        this.lugar = lugar;
        this.almas = new ArrayList<Alma>();
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public ArrayList<Alma> getAlmas() {
        return almas;
    }

    public void setAlmas(ArrayList<Alma> almas) {
        this.almas = almas;
    }
}
