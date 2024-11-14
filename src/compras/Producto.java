package compras;

public class Producto {
    
    ** final int codigo;
    ** String nombre;
    ** String tipo;
    ** static int totalProductosPedidos;

    public Producto(int codigo, String nombre, String tipo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    void imprimirNombre() {
        System.out.print(nombre);
    }

    public void setCodigo(int codigo) {
        **
    }

    public int getCodigo() {
        return codigo;
    }

    public static int getTotalProductosPedidos() {
        return totalProductosPedidos;
    }
}
