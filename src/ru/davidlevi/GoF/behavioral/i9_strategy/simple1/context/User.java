package ru.davidlevi.GoF.behavioral.i9_strategy.simple1.context;

import ru.davidlevi.GoF.behavioral.i9_strategy.simple1.strategy.StrategyAuthentication;

/**
 * Пользователь
 */
public class User {
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Метод проверяет валидность пользователя
     *
     * @param strategy StrategyAuthentication
     * @return boolean
     */
    public boolean check(StrategyAuthentication strategy) {
        return strategy.checkLogin(name, password);
    }
}
