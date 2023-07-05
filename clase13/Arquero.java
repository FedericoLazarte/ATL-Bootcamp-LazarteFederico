package clase13;

import java.util.Random;

public class Arquero extends Personaje{
    private final int DANIO_BASE = 5;
    private final int PUNTOS_CURACION = 6;
    private boolean camuflaje;

    public Arquero () {

    }

    public Arquero (String nombre, int nivel, int puntosDeVida) {
        super(nombre, nivel, puntosDeVida);
        this.camuflaje = false;
    }
    @Override
    public int atacar() {
        Random danioRandom = new Random();
        int danioCritico = danioRandom.nextInt(2);
        if (danioCritico == 1) {
            return DANIO_BASE * 2;
        } else {
            return DANIO_BASE;
        }
    }

    @Override
    public int recibirDanio(int danioRecibido) {
        if (this.camuflaje) {
            return 0;
        } else {
            this.puntosDeVida -= danioRecibido;
            return danioRecibido;
        }
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

    public int tripleAtaque () {
        return DANIO_BASE * 3;
    }

    public boolean isCamuflaje() {
        return this.camuflaje;
    }

    public void setCamuflaje(boolean camuflaje) {
        this.camuflaje = camuflaje;
    }
}
