package ru.davidlevi.GoF.behavioral.i9_strategy.simple1.strategy;

/**
 * Класс DatabaseAuth имплементирует стратегию поведения интерфейса StrategyAuthentication
 */
public class DatabaseAuth implements StrategyAuthentication {
    @Override
    public boolean checkLogin(String name, String password) {
        System.out.println("Checking with DB...");
        String userHash = getHash(name);
        String passHash = getHash(password);
        return checkUser(userHash, passHash);
    }

    private Object dbRef; // ссылка на базу данных
    private String dbUrl; // строка подключения

    /**
     * Конструктор
     *
     * @param dbUrl String
     */
    public DatabaseAuth(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    private void createConnection(String dbUrl) {
        // dbRef = ..
    }

    private boolean checkUser(String name, String password) {
        // Проверка в базе данных через dbRef
        return true;
    }

    private String getHash(String value) {
        // Хеширование
        return "2SDA23SD";
    }
}
