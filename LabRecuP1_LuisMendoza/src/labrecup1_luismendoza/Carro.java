/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labrecup1_luismendoza;



public class Carro {
    
    // Atributos
    
    String VIN;
    String marca;
    String modelo;
    String color;
    int year;
    

    public Carro(String VIN, String marca, String modelo, String color, int year) {
        this.VIN = VIN;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.year = year;
    }
    
    
    
    // Mutadores

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // toString
    
    @Override
    public String toString() {
        return "Carro {" + "VIN=" + VIN + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", year=" + year + '}';
    }
    
    
    
}
