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
            final boolean[] juegoTerminado = {false}; // Variable para controlar si el juego termino
            final Timer[] timer = {null}; // Declarar la variable timer como final
            timer[0] = new Timer(1000, new ActionListener() {
                int segundosRestantes = tiempoJuego;

                public void actionPerformed(ActionEvent e) {
                    if (segundosRestantes > 0) {
                        // El tiempo todavía no se termino, se ejecuta el código normal
                        segundosRestantes--;
                        // Actualiza la visualización del contador de tiempo
                        System.out.println("Tiempo restante: " + segundosRestantes + " segundos");
                    }
                    else if (!juegoTerminado[0]) {
                        // El tiempo ha terminado y el juego no ha terminado antes
                        juegoTerminado[0] = true;
                        System.out.println("Tiempo agotado. ¡Perdiste, intentalo nuevamente!");
                        // Agrega aquí el código para manejar la acción cuando el jugador pierde
                        // Llama a un método en la clase Principal para mostrar un mensaje de derrota
                        start.mostrarMensajeDerrota();
                        // Detén el temporizador
                        if (timer[0] != null){
                            timer[0].stop();
                        }
                    }

                }
            });

            // Inicio el temporizador si no es nulo
            if (timer[0] != null) {
                timer[0].start();
            }
        }
}