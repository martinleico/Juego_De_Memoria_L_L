package Main;
import  Frame.Principal;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main {
    public static void main(String[] args) {
        Principal start = new Principal();
        start.setVisible(true);

        // Agrego el temporizador para el contador de tiempo
        int tiempoJuego = 60; // Duración del juego en segundos
        Timer timer = new Timer(1000, new ActionListener() {
            int segundosRestantes = tiempoJuego;

            public void actionPerformed(ActionEvent e) {
                if (segundosRestantes > 0) {
                    segundosRestantes--;
                    // Actualiza la visualización del contador de tiempo
                    System.out.println("Tiempo restante: " + segundosRestantes + " segundos");
                } else {
                    // El tiempo ha terminado, el jugador pierde
                    System.out.println("Tiempo agotado. ¡Perdiste, intentalo nuevamente!");
                    // Agrego aca el código para manejar la acción cuando el jugador pierde
                    // LLamo a un método en la clase Principal para mostrar un mensaje de derrota
                    start.mostrarMensajeDerrota();
                }
            }
        });

        // Inicio el temporizador
        timer.start();
    }
}