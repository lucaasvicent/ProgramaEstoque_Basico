package aplication;

import entities.Product;

import javax.xml.namespace.QName;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // aqui é onde se faz a entrada do produto:
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.println();
        Product product = new Product(name, price);

        System.out.println("Product data: " + product);
        System.out.println("");

        //Aqui será onde irá fazer a modificação adicional do produto:
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println( "Updated data: " + product);

        //E nesta parte será a modificação de remoção de produto:
        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println( "Updated data: " + product);

        sc.close();
    }
}