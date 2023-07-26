package moe.rylie.jlox;

import java.util.Map;
import java.util.HashMap;

public class Environment {
    private final Map<String, Object> values = new HashMap<>();

    public Object get(Token name) {
        if (values.containsKey(name.lexeme)) {
            return values.get(name.lexeme);
        }

        throw new RuntimeError(name, "undefined variable '" + name.lexeme + "'.");
    }

    public void define(String name, Object value) {
        values.put(name, value);
    }
}
