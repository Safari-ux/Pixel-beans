/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pixelandbean.model;

import java.util.ArrayList;
import java.util.List;

public class ProductoController {

    private final List<Producto> productos = new ArrayList<>();
    private int nextId = 6; // si ya tienes 1..5 precargados

    public ProductoController() {
        productos.add(new Producto(1, "Coca Cola 1.5L", 1500, true));
        productos.add(new Producto(2, "Arroz 1kg", 1200, true));
        productos.add(new Producto(3, "Detergente 1L", 2500, true));
        productos.add(new Producto(4, "Leche Entera", 1100, true));
        productos.add(new Producto(5, "Pan Marraqueta (kg)", 1800, true));
    }

    public Producto crearProducto(String nombre, double precio, boolean activo) {
        Producto p = new Producto(nextId++, nombre, precio, activo);
        productos.add(p);
        return p;
    }

    public void agregarProducto(Producto p) {
        // si se desea respetar id del objeto ya creado
        productos.add(p);
        // opcional: ajustar nextId si p.getId() >= nextId
        if (p.getId() >= nextId) nextId = p.getId() + 1;
    }

    public List<Producto> getProductos() {
        return new ArrayList<>(productos); // copia para seguridad
    }

    // Buscar por id
    public Producto buscarPorId(int id) {
        for (Producto p : productos) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    // Editar un producto existente (busca por id y actualiza campos)
    public boolean editarProducto(int id, String nombre, double precio, boolean activo) {
        Producto p = buscarPorId(id);
        if (p == null) return false;
        p.setNombre(nombre);
        p.setPrecio(precio);
        p.setActivo(activo);
        return true;
    }
public boolean actualizarProducto(Producto productoActualizado) {
        for (Producto p : productos) {
            if (p.getId() == productoActualizado.getId()) {

                p.setNombre(productoActualizado.getNombre());
                p.setPrecio(productoActualizado.getPrecio());
                p.setActivo(productoActualizado.isActivo());

                return true;
            }
        }
        return false;
    }
    // Eliminar producto por id (si más adelante lo quieres)
    public boolean eliminarProducto(int id) {
        Producto p = buscarPorId(id);
        if (p == null) return false;
        return productos.remove(p);
    }
    
}