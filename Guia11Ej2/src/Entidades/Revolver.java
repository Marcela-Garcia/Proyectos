
package Entidades;

public class Revolver {

    private int posicionActual;
    private int posicionAgua;

    public Revolver() {
    }

    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual){
this.posicionActual = posicionActual;
}
public int getPosicionAgua() {
    return posicionAgua;
}

public void setPosicionAgua(int posicionAgua) {
    this.posicionAgua = posicionAgua;
}

@Override
public String toString() {
    return "Revolver{" +
            "posicionActual=" + posicionActual +
            ", posicionAgua=" + posicionAgua +
            '}';
}

public void llenarRevolver() {
    this.posicionActual = (int) (Math.random() * 6 + 1);
    this.posicionAgua = (int) (Math.random() * 6 + 1);
}

public boolean mojar() {
    return (posicionActual == posicionAgua);
}

public void siguienteChorro() {
    if (posicionActual == 6) {
        posicionActual = 1;
    } else {
        posicionActual++;
    }
}
}