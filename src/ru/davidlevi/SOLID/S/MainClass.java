package ru.davidlevi.SOLID.S;

import java.util.List;

/**
 * S Принцип единственной ответственности
 * <p>
 * Каждый класс выполняет лишь одну задачу.
 */
public class MainClass {
    public static void main(String[] args) {
        /*
         * Отвечает за хранение итемов, расчет цен,...
         */
        Order order = new Order() {
            @Override
            public List<Products> getItems() {
                return null;
            }

            @Override
            public double getTotal() {
                double result = 0;
                for (Products products : getItems()) {
                    result += products.getPrice();
                }
                return result;
            }
        };

        /*
         * ... а репозиторий отвечает только за хранение.
         */
        OrderRepository orderRepository = new OrderRepository();
        orderRepository.save();
    }
}
