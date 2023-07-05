package clase13;

public abstract class Personaje {
    protected String nombre;
    protected int nivel;
    protected int puntosDeVida;

    public Personaje () {

    }

    public Personaje (String nombre, int nivel, int puntosDeVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosDeVida = puntosDeVida;
    }

    public abstract int atacar ();
    public abstract int recibirDanio (int danioRecibido);
    public abstract int curarse ();

    public abstract void subirNivel();
}
