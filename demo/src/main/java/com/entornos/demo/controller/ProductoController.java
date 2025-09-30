package main.java.com.entornos.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @PostMapping
    public ResponseEntity<Producto> crear(@RequestBody @Valid Producto producto) {
        return ResponseEntity.ok(productoService.guardar(producto));
    }

    @GetMapping
    public List<Producto> listar() {
        return productoService.listarTodos();
    }
}
