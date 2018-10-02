package ru.davidlevi.GoF.structural.i10_bridge.bridge;

/**
 * Класс LargeCircleDrawer имплементирует поведение интерфейса и рисует большой круг
 */
public class LargeCircleDrawer implements Drawer {
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Large circle center = " + x + "," + y + " radius = " + radius * RADIUS_MULTIPLIER);
    }

    private static final int RADIUS_MULTIPLIER = 10;
}
