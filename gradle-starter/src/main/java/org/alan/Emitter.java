package org.alan;

import java.util.List;
import java.util.function.Function;

public class Emitter {

    public void emit(List<String> lines, Function<String, String> consumer) {
        lines.forEach(line -> System.out.println(consumer.apply(line)));
    }
}
