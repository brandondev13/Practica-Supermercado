
package supermercado.domain;

public class Producto {
    private String nombre;
    private int codigo;
    private static int contadorCodigo;
    private double precio;

    public Producto() {
        this.codigo = ++Producto.contadorCodigo;
    }

    public Producto(String nombre, int codigo, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
    }    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return codigo + "\t" + nombre + "\t\t\t\t" + precio;
    }
    
    
}
