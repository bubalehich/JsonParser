package ru.clevertec.objectmother;

import ru.clevertec.model.ExampleClass;

import java.util.List;
import java.util.Map;

public class ObjectMother {

    public static int[] getPrimitiveArray() {
        return new int[]{1, 2, 3, 4};
    }

    public static String[] getObjectArray() {
        return new String[]{"Kek", "Mek", "Cheburek"};
    }

    public static String[][] getTwoDimensionArray() {
        return new String[][]{
                {"Athila", "Celldweller", "Annisokay"},
                {"Wildways", "WBTBWB"}
        };
    }

    public static String getString() {
        return "SimpleString";
    }

    public static ExampleClass getObject() {
        return new ExampleClass();
    }

    public static Object getNull() {
        return null;
    }

    public static List<String> getCollection() {
        return List.of("I", "want", "sleep", "!");
    }

    public static Map<String, Integer> getMap() {
        return Map.of(
                "Qwe", 1,
                "Qwew", 3,
                "Dsa", 3);
    }
}
