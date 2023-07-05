package clase13;

public class Mago extends Personaje{
    private final int DANIO_BASE = 3;
    private final int PUNTOS_CURACION = 10;
    private int mana;

    public Mago () {
        this.mana = 100;
    }

    public Mago(String nombre, int nivel, int puntosDeVida) {
        super(nombre, nivel, puntosDeVida);
        this.mana = 100;
    }

    @Override
    public int atacar() {
        return DANIO_BASE;
    }

    @Override
    public int recibirDanio(int danioRecibido) {
        this.puntosDeVida -= danioRecibido;
        return danioRecibido;
    }

    @Override
    public int curarse() {
        this.puntosDeVida += PUNTOS_CURACION;
        return PUNTOS_CURACION;
    }

    @Override
    public void subirNivel() {
        this.nivel += 1;
    }

    public int bolaDeFuego() {
        return DANIO_BASE * 3;
    }

    public int getMana() {
        return this.mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}
