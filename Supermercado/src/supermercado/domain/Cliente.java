package supermercado.domain;

public class Cliente {
    
    private String nombre;
    private String nit;
    
    public Cliente() {
    }
    
    public Cliente(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", nit=" + nit + '}';
    }   
    
}