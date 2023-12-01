package ar.com.codoacodo.interfaces;

public class FSLogger extends ILogger {

    //implementar el metodo log
    //polimorfismo: sobreescritura
    public void log() {
        System.out.println("Grabando en c:/bla");
    }
}