package co.com.ps.C22JA.service;

import co.com.ps.C22JA.entity.Producto;

import java.util.List;

public interface IProductoService {

    public Producto getProducto(Long id);
    public List<Producto> getAllProductos();
    public Producto saveProducto(Producto producto);
    public Producto updateProducto(Producto producto);
    public void deleteProducto(Long id);





}
