/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author CARLOS CASTAÑEDA
 */
public class Carro {
    
    //Atributos
    private String marca;
    private int modelo;
    private String color;
    
    //Constructores
    public Carro() {
        System.out.println("Creando un carro nuevo...");
        this.marca = "Sin Marca";
        this.modelo = 2022;
        this.color = "Sin definir";
    }

    public Carro(String marca, int modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        System.out.println("Creando un carro con el constructor con parámetros");
    }
    
    //Métodos (Operaciones)
    public void encender( ){
        //this
        enclochar();
        System.out.println("Encendiendo el vehiculo " + this.marca);
    }
    
    private void enclochar(){
        System.out.println("Enclochando.....");
    }
    
    public void apagar( ){
        System.out.println("Apagando el vehiculo....");
    }
    
    public void acelerar( ){
        System.out.println("Acelerando el vehiculo....");
    }
    
    public void frenar( ){
        System.out.println("Frenando el vehiculo....");
    }
    
    public void mostrarInformacionCarro(){
        System.out.println("Mi carrito tiene la marca: " + this.marca + " y es modelo: "+ this.modelo +
                            " y tiene color: " + this.color);
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public int getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
}
