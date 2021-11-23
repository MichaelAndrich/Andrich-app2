/*
 *  UCF COP3330 Fall 2021 Application Assignment 2 Solution
 *  Copyright 2021 Michael Andrich
 */


/*
    Things that SHALL be done:
    Add item
    Remove item
    Remove all items
    Sort by value
    Sort by name
    Sort by serial number
    Search for name
    Search for serial number
 */

package baseline;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;

public class SortingItems {

    private final ObservableList<Item> items = FXCollections.observableArrayList(); ////////////

    public void addItem(String name, String value, String serial) {
        Item item = new Item(name, value, serial);
    }

    // creating add functionality to list
    public void addItem(Item item) {
        //
    }

    // creating remove all function for list
    public void removeItems(List<Item> removedItems) {
        //
    }

    // empties the list of Items
    public void empty() {
        //
    }

    // create functionality to sort by name
    public void sortName() {
        //
    }

    // create functionality to sort by value
    public void sortValue() {
        //
    }

    // create functionality to sort by serial number
    public void sortSerial() {
        //
    }
}
