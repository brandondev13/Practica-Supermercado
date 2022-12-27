package supermercado.domain;

public class ItemFactura {
    private Producto producto;
    private int cantidad;

    public ItemFactura(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }
    
    public double calcularImporte() {
        return producto.getPrecio() * this.cantidad;
    }
    
    @Override
    public String toString() {
        return producto + "\t\t\t" + cantidad + "\t\t\t" + this.calcularImporte();
    }
        
}
