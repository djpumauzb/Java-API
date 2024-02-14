package Seminar.sem5.tsk0;

import java.util.HashMap;
import java.util.Map;

public class Passports {
    private Map<String, String> map = new HashMap<>();

    void add(String passNum, String lastName) {
        map.put(passNum, lastName);
    }

    String getByPassnum(int i) {
        return i + " : " + map.get(i);
    }

    String getBylastName(String lastName) {
        StringBuilder stringBuilder = new StringBuilder();
        for (var entry : map.entrySet()) {
            if (entry.getValue().equals(lastName)) {
                stringBuilder.append(entry.getKey())
                                .append(" : ")
                                .append(lastName)
                                .append("\n");
            }
        }
        return stringBuilder.toString();
    }

    String getAll() {
        return map.toString();
    }
}
