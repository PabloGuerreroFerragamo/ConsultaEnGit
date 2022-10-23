/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package articulos;

/**
 *
 * @author Ssaid
 */
public class articulos {
    private int id;
    private String nombre;
    private int max;
    private int min;
    private int stock;

    public articulos() {
        
    }

    public articulos(int id, String nombre, int max, int min, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.max = max;
        this.min = min;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
     
}
