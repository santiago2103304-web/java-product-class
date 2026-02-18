public class Main {

    public static void main(String[] args) {

        Product product1 = new Product();

        product1.setId("P001");
        product1.setName("Mouse");
        product1.setPrice(25.5);
        product1.setStock(10);

        Product product2 = new Product("P002", "Laptop", 1200.0, 5);

        System.out.println("Producto 1 - Nombre: " + product1.getName());
        System.out.println("Producto 1 - Precio: " + product1.getPrice());

        System.out.println("Producto 2 - Nombre: " + product2.getName());
        System.out.println("Producto 2 - Stock: " + product2.getStock());

        System.out.println("\nRepresentación completa:");
        System.out.println(product1.toString());
        System.out.println(product2.toString());
    }
}
