import java.util.Scanner;
import supermercado.domain.*;

public class Supermercado {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Abisiai", "1054CD");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una descripcion de la factura");
        Factura factura = new Factura(entrada.nextLine(), cliente);
        Producto producto;
        for(int i =0; i < 3; i++){
            producto = new Producto();
            System.out.println("Ingrese producto NO: " + producto.getCodigo());
            System.out.print("Nombre: ");
            producto.setNombre(entrada.next());
            System.out.print("Precio: ");
            producto.setPrecio(entrada.nextDouble());
            System.out.print("Cantidad: ");
            ItemFactura item = new ItemFactura(producto,entrada.nextInt());
            factura.agregarProd(item);            
        }
        System.out.println(factura);
        System.out.println("***   Vuelva Pronto   ***********************************************************"
                + "***********************");
    }
    
}
