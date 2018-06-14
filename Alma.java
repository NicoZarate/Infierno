package Infierno;

public class Alma {
    private int valor;
    private int bondad;
    private boolean friolento;

    public Alma(int valor, int bondad) {
        this.valor = valor;
        this.bondad = bondad;
        this.friolento = false;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getBondad() {
        return bondad;
    }

    public void setBondad(int bondad) {
        this.bondad = bondad;
    }

    public boolean isFriolento() {
        return friolento;
    }

    public void setFriolento(boolean friolento) {
        this.friolento = friolento;
    }
    public void cambiarEstado(){
        if(this.isFriolento()){
            this.setFriolento(false);
        }else{
            this.setFriolento(true);
        }
    }
    public void reducirBondad(int cant){
           this.bondad = this.getBondad() - cant;
    }

    public void reducirValor(){
           this.valor = this.getBondad() / 2;
    }
}
