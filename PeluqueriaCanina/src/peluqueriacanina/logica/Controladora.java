package peluqueriacanina.logica;

import peluqueriacanina.persistencia.ControladoraPersistencia;

public class Controladora {
    ControladoraPersistencia controlpersis = new ControladoraPersistencia();

    public void guardar(String nombreMasco, String raza, String color,
            String observacion, String alergico, String atenEsp, String
            nombreDuenio, String celDuenio) {
        
        //Creamos al dueño y asignamos sus valores
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(celDuenio);
        
        //Creamos la mascota y asignamos sus valores
        Mascota mascota = new Mascota();
        mascota.setNombre(nombreMasco);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setAlergico(alergico);
        mascota.setAtencion_especial(atenEsp);
        mascota.setObservacion(observacion);
        mascota.setUnDuenio(duenio);
        
        controlpersis.guardar(duenio,mascota);
    }
}
