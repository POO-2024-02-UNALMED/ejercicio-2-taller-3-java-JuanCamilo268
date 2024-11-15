package compras;

public class Producto {
    
    private int codigo;//quité el final porque este no permite el correcto funcionamiento de la función setCodigo
    private String nombre;
    String tipo;
    static int totalProductosPedidos;

    public Producto(int codigo, String nombre, String tipo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    void imprimirNombre() {
        System.out.print(nombre);
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public static int getTotalProductosPedidos() {
        return totalProductosPedidos;
    }
}
