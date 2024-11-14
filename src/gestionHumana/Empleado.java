package gestionHumana;

public class Empleado {

    ** final long cedula;
    ** String nombre;
    ** String cargo;
    
    public Empleado(long cedula, String nombre, String cargo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.cargo = cargo;
    }

    ** boolean tengoPermiso() {
        return cargo.contains("Administrador");
    }
}
