package clase13;

public class Guerrero extends Personaje{
    private boolean buffDanio;
    private final int DANIO_BASE = 10;
    private final int PUNTOS_CURACION = 6;
    public Guerrero () {
    }

    public Guerrero (String nombre, int nivel, int puntosDeVida) {
        super(nombre, nivel, puntosDeVida);
        this.buffDanio = false;
    }
    @Override
    public int atacar() {
        if (buffDanio) {
            return DANIO_BASE * 2;
        }
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

    public int espadazo () {
        return DANIO_BASE * 3;
    }


    public boolean isBuffDanio() {
        return this.buffDanio;
    }

    public void setBuffDanio(boolean buffDanio) {
        this.buffDanio = buffDanio;
    }
}
