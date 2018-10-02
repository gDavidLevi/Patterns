package ru.davidlevi.GoF.structural.i10_bridge.bridge;

/**
 * Класс SmallCircleDrawer имплементирует поведение интерфейса и рисует маленький круг
 */
public class SmallCircleDrawer implements Drawer {
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Small circle center = " + x + "," + y + " radius = " + radius * RADIUS_MULTIPLIER);
    }

    private static final double RADIUS_MULTIPLIER = 0.25;
}
