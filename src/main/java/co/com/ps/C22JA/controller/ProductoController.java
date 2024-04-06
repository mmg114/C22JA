package co.com.ps.C22JA.controller;

import co.com.ps.C22JA.entity.Producto;
import co.com.ps.C22JA.service.IProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/producto")
@RequiredArgsConstructor
public class ProductoController {

    private final IProductoService productoService;

    @GetMapping
    public List<Producto> listarProductos() {
        return productoService.getAllProductos();
    }

    @GetMapping("/{id}")
    public Producto obtenerProducto(@PathVariable Long id) {
        return productoService.getProducto(id);
             //   .orElseThrow(() -> new RuntimeException("Producto no encontrado con id: " + id))
    }

    @PostMapping
    public Producto crearProducto(@RequestBody Producto producto) {
        return productoService.saveProducto(producto);
    }

    @PutMapping("/{id}")
    public Producto actualizarProducto(@RequestBody Producto productoActualizado) {
        return productoService.updateProducto(productoActualizado);
    }

    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable Long id) {
        productoService.deleteProducto(id);
    }

}
