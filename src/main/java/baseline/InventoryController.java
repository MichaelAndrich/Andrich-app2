/*
 *  UCF COP3330 Fall 2021 Application Assignment 2 Solution
 *  Copyright 2021 Michael Andrich
 */


/*
    This is where most functionality is located, on the home page
    Can go to either the inventory page where the items are listed
    Can go to the about page where the about info is located
    Can close the application
    Includes the add item, clear item, search for item,
    export/import buttons, sort by name, value or serial button
    Also includes the about and edit buttons that open new scenes for
    each respective location
 */

package baseline;

import javafx.fxml.FXML;

import java.io.IOException;

public class InventoryController {

    // calls ErrorCheck to verify the input from user
    // if error, prompt user how to properly input name, value or serial or all 3
    // no error, then add to table
    @FXML
    void addItemButtonClicked() {

    }

    // prompts user to make sure they want to delete the selected items
    // if no is selected, then nothing is deleted, opposite for yes
    @FXML
    void deleteItemButtonClicked() {

    }

    // prompts user to be taken to the editing menu for that specific item to change
    // the name, value or field
    @FXML
    void editItemButtonClicked() {

    }

    // prompts user to make sure that they want to delete all items in their list
    // if no, then nothing is deleted, opposite for yes
    @FXML
    void removeAllButtonClicked() {

    }

    // opens the inventory page where the table list of all the items is located
    @FXML
    void inventoryButtonClicked() {

    }

    // once clicked, a new window pops up with the about page and how to use the inventory management app.
    @FXML
    void aboutButtonClicked() {

    }

    // will clear the search bar back to blank
    @FXML
    void clearSearchButtonClicked() {

    }

    // closes application
    @FXML
    void closeButtonClicked() {

    }

    // goes back to the home page where the inventory is longer visible
    // can enter the about page or close the page all together
    @FXML
    void homeButtonClicked() {

    }

    // calls ImportExportFile to export as text
    @FXML
    void exportTextButtonClicked() {

    }

    // calls ImportExportFile to import files
    @FXML
    void importButtonClicked() {

    }

    // will sort the inventory by name, either from A-Z or Z-A
    @FXML
    void sortNameButtonClicked() {

    }

    // will sort the inventory by value, from least to greatest or greatest to least
    @FXML
    void sortValueButtonClicked() {

    }

    // will sort the inventory by serial number, alphabetically
    @FXML
    void sortSerialButtonClicked() {


    }
}
