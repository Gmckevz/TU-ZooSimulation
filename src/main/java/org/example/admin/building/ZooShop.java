package org.example.admin.building;

import java.util.ArrayList;

public class ZooShop extends Shop{
    private ArrayList<String> products;
    private ArrayList<Double> productsPrice;

    private ArrayList<String> productsCart;
    private ArrayList<Double> productsCartPrice;

    public void Shop(){
        // initialize products and products price ArrayLists
        products = new ArrayList<>();
        productsPrice = new ArrayList<>();

        // add static values for products and products price
        products.add("Soft Drink");
        productsPrice.add(30.00);
        products.add("Popcorn");
        productsPrice.add(50.00);
        products.add("Plush Toy");
        productsPrice.add(120.00);
        products.add("Keychain");
        productsPrice.add(45.00);

        // initialize the cart
        productsCart = new ArrayList<>();
        productsCartPrice = new ArrayList<>();
    }

    public void displayProducts() {
        System.out.println("Available Products:");
        for (int i = 0; i < products.size(); i++) {
            System.out.println(i + 1 + ". " + products.get(i) + " - P" + productsPrice.get(i));
        }
    }

    public void showSelectedItem(int index) {
        System.out.println("Selected:");
        System.out.println(products.get(index-1) + "(P" + productsPrice.get(index-1) + ")");
        productsCart.add(products.get(index-1));
        productsCartPrice.add(productsPrice.get(index-1));
    }

    public void resetCart() {
        productsCart = null;
        productsCartPrice = null;

        productsCart = new ArrayList<>();
        productsCartPrice = new ArrayList<>();
    }

    public ArrayList<String> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<String> products) {
        this.products = products;
    }

    public ArrayList<Double> getProductsPrice() {
        return productsPrice;
    }

    public void setProductsPrice(ArrayList<Double> productsPrice) {
        this.productsPrice = productsPrice;
    }

    public ArrayList<String> getProductsCart() {
        return productsCart;
    }

    public void setProductsCart(ArrayList<String> productsCart) {
        this.productsCart = productsCart;
    }

    public ArrayList<Double> getProductsCartPrice() {
        return productsCartPrice;
    }

    public void setProductsCartPrice(ArrayList<Double> productsCartPrice) {
        this.productsCartPrice = productsCartPrice;
    }
}
