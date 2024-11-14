package compras;

import gestionHumana.Empleado;
import java.util.ArrayList;

public class OrdenCompra {

    public int codigo;
    ** String tipo;
    ** Empleado comprador;
    ** ArrayList<Producto> productos;

    public OrdenCompra(int codigo, String tipo, Empleado comprador,
            ArrayList<Producto> productos) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.comprador = comprador;
        this.productos = productos;
        Producto.totalProductosPedidos += productos.size();
    }

    public void agregarProducto(Producto producto) {
        if (producto.tipo.equals(tipo)) {
            productos.add(producto);
            Producto.totalProductosPedidos++;
        }
    }

    public void retirarProducto(Empleado empleado, Producto producto) {
        if (!empleado.tengoPermiso()) {
            break;
        }
        retirarProducto(producto);
    }

    private void retirarProducto(Producto producto) {
        for (int i = 0; i < productos.length; i++) {
            if (producto.getCodigo() == productos.get(i).getCodigo()) {
                productos.remove(i);
                producto.totalProductosPedidos--;
                producto.imprimirNombre();
                System.out.println(" retirado");
                break;
            }
        }
    }

    public ** descontar() {
        Producto.totalProductosPedidos -= productos.size();
    }

}
