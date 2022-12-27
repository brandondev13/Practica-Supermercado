package supermercado.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
    private Cliente cliente;
    private ItemFactura[] items;
    private int contarItems;
    private static final int MAX_ITEMS = 5;
    private int folio;
    private static int contadorFolio;
    private Date fecha;
    private String descripcion;
    
    public Factura(String descripcion, Cliente cliente) {
        this.cliente = cliente;
        this.items = new ItemFactura[Factura.MAX_ITEMS];
        this.folio = ++Factura.contadorFolio;
        this.fecha = new Date();
        this.descripcion = descripcion;       
    }
    
    public int getFolio() {
        return folio;
    }
    
    
    public void agregarProd(ItemFactura itemFactura) {
        if(contarItems<MAX_ITEMS) {
            this.items[contarItems++] = itemFactura;
        }
    }
    
    public String verDetalle() {
        SimpleDateFormat fd = new SimpleDateFormat("dd 'de' MMM yyyy");
        StringBuilder sb = new StringBuilder("\n\n***   FACTURA   ****************************************************************" +
            "************************\n");
        sb.append("\nCliente: ")
                .append(this.cliente.getNombre())
                .append("\nNit: ")
                .append(this.cliente.getNit())
                .append("\nFecha de emision: ")
                .append(fd.format(this.fecha))
                .append("\n#\tNombre\t\t\t\t$\t\t\tCantidad\t\tSubtotal\n");
        
        for(ItemFactura item : items) {
            if(item == null) {
                continue;
            }
            sb.append(item).append("\n");
        }
        return sb.toString();
    }
    
    public double calcularTotal() {
        double total = 0.0;
        for (ItemFactura item : items) {
            if(item == null) {
                continue;
            }
            total += item.calcularImporte();
        }
        return total;       
    }

    @Override
    public String toString() {
        return verDetalle();
    }
    
}
