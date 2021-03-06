/*
 *  UCF COP3330 Fall 2021 Application Assignment 2 Solution
 *  Copyright 2021 Michael Andrich
 */

package baseline;

public class Item {

    // creating attributes of Item
    private String name;
    private Double value;
    private String serialNumber;

    public Item(String name, String value, String serialNumber) {
        this.name = name;
        this.value = new Double (value);
        this.serialNumber = serialNumber;

    }

    // create get and set methods for each attribute

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;

    }

    public String getSerialNumber() {
        return serialNumber;

    }

    public void setSerialNumber() {
        this.serialNumber = serialNumber;

    }

    public Double getValue() {
        return value;

    }

    public void setValue() {
        this.value = Double.parseDouble(String.valueOf(value));
    }


}
