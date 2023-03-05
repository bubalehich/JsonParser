package ru.clevertec.model;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ExampleClass {
    private String aString;

    private int[] oneDimensionArray;

    private String[][] twoDimensionArray;

    private List<String> alist;

    private boolean aBoolean;

    private double aDouble;

    private char aChar;

    private Enum anEnum;

    private Objects aNull;

    private ExampleClass innerObject;

    private Map<String, Integer> aMap;

    public ExampleClass(){
        this.aString = "qwe";
        this.oneDimensionArray = new int[]{1, 2, 3};
        this.twoDimensionArray = new String[][]{{"a", "b", "c"}, {"d", "e", "f"}};
        this.alist = List.of("hello", "world", "!");
        this.aBoolean = true;
        this.aDouble = 100.0;
        this.aChar = 'c';
        this.anEnum = Enum.FIRST;
        this.aNull = null;
        this.innerObject = new ExampleClass("inner", true, 6.8, 'j', null);
        this.aMap = Map.of("abc", 4, "defj", 5, "higk", 7);
    }

    public ExampleClass(String aString,boolean aBoolean, double aDouble, char aChar, Enum anEnum) {
        this.aString = aString;
        this.aBoolean = aBoolean;
        this.aDouble = aDouble;
        this.aChar = aChar;
        this.anEnum = anEnum;
    }

    public Map<String, Integer> getAMap() {
        return aMap;
    }

    public void setAMap(Map<String, Integer> aMap) {
        this.aMap = aMap;
    }

    public ExampleClass getInnerObject() {
        return innerObject;
    }

    public Objects getANull() {
        return aNull;
    }

    public void setANull(Objects aNull) {
        this.aNull = aNull;
    }

    public String getAString() {
        return aString;
    }

    public void setAString(String aString) {
        this.aString = aString;
    }

    public int[] getOneDimensionArray() {
        return oneDimensionArray;
    }

    public void setOneDimensionArray(int[] oneDimensionArray) {
        this.oneDimensionArray = oneDimensionArray;
    }

    public String[][] getTwoDimensionArray() {
        return twoDimensionArray;
    }

    public void setTwoDimensionArray(String[][] twoDimensionArray) {
        this.twoDimensionArray = twoDimensionArray;
    }

    public List<String> getAList() {
        return alist;
    }

    public void setAList(List<String> alist) {
        this.alist = alist;
    }

    public boolean isABoolean() {
        return aBoolean;
    }

    public void setABoolean(boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    public double getADouble() {
        return aDouble;
    }

    public void setADouble(double aDouble) {
        this.aDouble = aDouble;
    }

    public char getAChar() {
        return aChar;
    }

    public void setAChar(char aChar) {
        this.aChar = aChar;
    }

    public Enum getAnEnum() {
        return anEnum;
    }

    public void setAnEnum(Enum anEnum) {
        this.anEnum = anEnum;
    }

    enum Enum {
        FIRST,
        SECOND,
        THIRD
    }
}
