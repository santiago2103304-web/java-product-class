package com.example;

public class Main {

    public static void main(String[] args) {

        // Objeto con constructor por defecto
        Product product1 = new Product();
        product1.setId("P001");
        product1.setName("Keyboard");
        product1.setPrice(45.99);
        product1.setStock(10);

        // Objeto con constructor parametrizado
        Product product2 = new Product("P002", "Laptop", 1200.0, 5);

        // Uso de getters
        System.out.println("Product 1 Name: " + product1.getName());
        System.out.println("Product 2 Price: " + product2.getPrice());

        // Uso de toString()
        System.out.println("\nFull Object Representation:");
        System.out.println(product1.toString());
        System.out.println(product2.toString());
    }
}
