/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldg74;

import java.util.Scanner;
import poo.Carro;

/**
 *
 * @author CARLOS CASTAÑEDA
 */
public class HelloWorldG74 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Python
        //print("Hola mundo")
        
//        System.out.println("Hola Mundo");
//        
//        //Python => Identación
//        //Java => Llaves que abren, llaves que cierran
//        if (true){
//            System.out.println("Cumplió la condición");
//            System.out.println("Cumplió la condición segunda instrucción");
//        }
//        
//        //Variables
//        //Python => a = 10 
//        //Fuertemente tipado: 
//        
//        String nombre = "Carlos"; //Cadenas
//        int edad = 56; //Número entero
//        boolean es_docente = true; // Boolean
//        char sexo = 'M'; // Caracteres
//        double calificacion = 3.2; //Números con decimales
//        
//        edad = 57;
//        
//        //Constantes
//        final String documento = "123456";
//        //documento = "656565656";//ERROR, no se puede reasignar un valor a una CONSTANTE
//        System.out.println("Documento: " + documento + ", Nombre: " + nombre + ", Edad: " + edad + ", ¿Es docente?: " + es_docente
//                + ", Sexo: " + sexo + ", Calificación: " + calificacion);
//        
//        int contador = 0;
//        System.out.println(contador);//0
//        contador++; //Aumentar el valor de la variable en 1
//        System.out.println(contador); //1
//        contador++; //Aumentar el valor de la variable en 1
//        System.out.println(contador); //2
//        
//        System.out.println(contador++);//2
//        System.out.println(contador); //3
//        --contador;
//        System.out.println(contador); //2
//        
//        if ( contador>10 && contador<15 ){
//            System.out.println("Está en el rango entre 10 y 15");
//        }

        //Constante
//        final double DE_LBS_A_KG = 2.205;
//        
//        //Python => peso_lbs = input("Ingrese el peso en libras: ")
//        Scanner in = new Scanner(System.in);
//        System.out.print("Ingrese su nombre: ");
//        String nombre = in.nextLine();
//        System.out.println("Ingrese su peso en libras: ");
//        double peso_lbs = in.nextDouble();
//        
//        System.out.println("Su nombre es: " + nombre + " y pesa " + peso_lbs + " libras");
//        double peso_kg = peso_lbs / DE_LBS_A_KG;
//        
//        System.out.println("Su nombre es: " + nombre + " y pesa " + peso_kg + " kg");
        
        
//        Scanner in = new Scanner(System.in);
//        System.out.println("Ingrese el código del estudiante: ");
//        String codigo_estudiante = in.next();
//        
//        System.out.println("Ingrese la nota del parcial 1 (20%): ");
//        double parcial_1 = in.nextDouble();
//        System.out.println("Ingrese la nota del parcial 2 (30%): ");
//        double parcial_2 = in.nextDouble();
//        
//        System.out.println("Ingrese la nota del taller (15%): ");
//        double taller_1 = in.nextDouble();
//        
//        System.out.println("Ingrese la nota del quiz 1: ");
//        double quiz_1 = in.nextDouble();
//        System.out.println("Ingrese la nota del quiz 2: ");
//        double quiz_2 = in.nextDouble();
//        
//        System.out.println("Ingrese la nota del proyecto final (30%): ");
//        double proyecto_final = in.nextDouble();
//        
//        double nota_final = (parcial_1*0.2) 
//                            + (parcial_2*0.3) 
//                            + (taller_1*0.15)
//                            + (((quiz_1+quiz_2)/2)*0.05)
//                            + (proyecto_final*0.3);
//        
//        System.out.println("El estudiante con código " + codigo_estudiante + " tiene una nota final de: " + nota_final);
//        
//        if (nota_final >=3){
//            System.out.println("El estudiante ganó la materia :D");
//        //elif
//        } else if( nota_final >=2.8 && nota_final<3  ) {
//            System.out.println("El estudiante puede habilitar :)");
//        } else {
//            System.out.println("El estudiante PERDIÓ la materia :(");
//        }
        
//        int contador = 0; //1. INICIO
//        
//        while ( contador<=10 ){ //2. Condición
//            System.out.println("Contador: " + contador);
//            //3. Incremento/Decremento
//            contador++; //Aumentar el valor de una variable en 1
//        }
//        System.out.println("-----------------");
//        //Continúa el flujo
//        
//        //Inicio: 0
//        //Condición: i<10
//        //Incremento/Decremento: +1
//        for (int i = 0; i <= 10; i++) {
//            System.out.println("i: " + i);
//        }
//        System.out.println("-----------------");
//        
//        //Inicio: 10
//        //Condición: i>=0
//        //Incremento/Decremento: -1
//        for (int i = 10; i >= 0; i-=2) {
//            System.out.println("(Decremento) i: " + i);
//        }
//        
//        int x = 10;
//        x++;
//        System.out.println("X: " + x);
//        
//        int y = 10;
//        y = y + y;
//        System.out.println("Y: " + y);
//        
//        Scanner in = new Scanner(System.in);
//        
//        
//        System.out.println("Ingrese el número 1: ");
//        int num1 = in.nextInt();
//        System.out.println("Ingrese el número 2: ");
//        int num2 = in.nextInt();
//        //Ejecutar la función
//        int suma_total = sumar( num1, num2 );
//        System.out.println("El resultado de sumar " +num1+ " + "+ num2+"= " + suma_total);
//        
//        System.out.print("Ingrese su nombre: ");
//        String nombre_persona = in.next();
//        System.out.println("Ingrese su edad: ");
//        int edad_persona = in.nextInt();
//        
//        saludar(nombre_persona, edad_persona);
//        saludar("Ana", 15);
//        saludar("Lupita", 26);
        //saludar(10); //Error, el tipo de dato del valor enviado debe ser igual al tipo de dato del parámetro al que corresponde
        
        //Crear un objeto de la clase Carro
        Carro mi_carrito_1 = new Carro(); //Objeto: Instancia de una clase //AQUI SE EJECUTA EL CONSTRUCTOR
        
        mi_carrito_1.mostrarInformacionCarro();
        
        mi_carrito_1.setMarca("Chevrolet"); //Modificar el valor de un atributo
        mi_carrito_1.setModelo(2002);
        mi_carrito_1.setColor("Azul");
//        
        mi_carrito_1.mostrarInformacionCarro();
//        
//        mi_carrito_1.encender();
//        mi_carrito_1.acelerar();
//        mi_carrito_1.frenar();
//        mi_carrito_1.apagar();
//        
//        mi_carrito_1.setModelo(2003);
//        
//        mi_carrito_1.mostrarInformacionCarro();
//        
//        //Crear un objeto de la clase Carro
        Carro mi_carrito_2 = new Carro( "BMW", 2021, "Morado" ); //Objeto: Instancia de una clase
//        mi_carrito_2.setMarca("BMW");
//        mi_carrito_2.setModelo(2021);
//        mi_carrito_2.setColor("Morado");
//        
        mi_carrito_2.setModelo(2022);
        mi_carrito_2.mostrarInformacionCarro();
//        mi_carrito_2.encender();
        
    }
    
    //Declaración de la función
    public static int sumar(int a ,int b ){
        int resultado = a + b;
        return resultado;
    }
    
    //Declarar una función que NO retorna nada
    public static void saludar(String nombre, int edad){
        System.out.println("¡Hola " + nombre + "! Espero que estés disfrutando Java");
        if(edad>18){
            System.out.println("Es momento de poner el acelerador en la programación");
        } else {
            System.out.println("Puedes explorar mucho el mundo de la programación");
        }
    }
    
}
