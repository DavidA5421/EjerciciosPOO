package poo;

import java.util.Scanner;


public class POO {

    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        System.out.println("+---------------------+");
        System.out.println("|  PROMOCIÓN ALMACEN  |");
        System.out.println("+---------------------+");
        
        System.out.println("Ingrese el valor total de su compra: ");
        double total = sc.nextDouble();
        System.out.println("Ingrese el color de la bola obtenida: ");
        String color = sc.next().toUpperCase();
        double discount = 0;
        
        if(color.equals("VERDE")){
            discount = 0.1;
        }else if(color.equals("AMARILLA")){
            discount = 0.25;
        }else if(color.equals("AZUL")){
            discount = 0.5;
        }else if(color.equals("ROJA")){
            total = 0;
        }total = total - total*discount;
        System.out.println("Por el descuento aplicado su compra tiene un valor de :");
        System.out.println(total+"$ pesos...");
    

    }
    
    
    
    
}   
    


