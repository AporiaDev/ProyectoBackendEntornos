package com.entornos.demo.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private double ivaCompra;
    @column(nullable = false)
    private String nombre;

    private double precioCompra;

    private double precioVenta;
    
    @ManytoOne
    @JoinColumn(name = "idProveedor", nullable = false)
    private Proveedor proveedor;

    public Producto(){}

    public Producto(String nombre, Double precioCompra, Double precioVenta, Double ivaCompra, Proveedor proveedor) {
        this.nombre = nombre;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.ivaCompra = ivaCompra;
        this.proveedor = proveedor;
    }

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public Double getPrecioCompra() {return precioCompra;}

    public void setPrecioCompra(Double precioCompra) {this.precioCompra = precioCompra;}

    public Double getPrecioVenta() {return precioVenta;}

    public void setPrecioVenta(Double precioVenta) {this.precioVenta = precioVenta;}

    public Double getIvaCompra() {return ivaCompra;}

    public void setIvaCompra(Double ivaCompra) {this.ivaCompra = ivaCompra;}

    public Proveedor getProveedor() {return proveedor;}

    public void setProveedor(Proveedor proveedor) {this.proveedor = proveedor;}


}

