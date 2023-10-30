package peluqueriacanina.persistencia;

import peluqueriacanina.logica.Duenio;
import peluqueriacanina.logica.Mascota;

public class ControladoraPersistencia {
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascotaJpa = new MascotaJpaController();
    
    public void guardar(Duenio duenio, Mascota mascota){
        
        //Crear en la BD el dueño
        duenioJpa.create(duenio);
        
        //Crear en la BD la mascota
        mascotaJpa.create(mascota);
    }
}
