package ru.davidlevi.SOLID.S;

import java.util.List;

/**
 * Интерефейс Order (заказ) определет поведение заказа
 */
public interface Order {
    List<Products> getItems();

    double getTotal();
}
