package main.java.com.entornos.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import demo.java.com.entornos.repository.ProductoRepository;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public Producto guardar(Producto producto) {
        if (producto.getPrecioVenta() <= producto.getPrecioCompra()) {
            throw new IllegalArgumentException("El precio de venta debe ser mayor al de compra");
        }
        return productoRepository.save(producto);
    }
}
