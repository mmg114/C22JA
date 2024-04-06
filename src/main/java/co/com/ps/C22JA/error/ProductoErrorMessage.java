package co.com.ps.C22JA.error;

public class ProductoErrorMessage extends RuntimeException{

    ProductoErrorMessage(String mensaje){
        super("Error en Producto"+mensaje);
    }
}
