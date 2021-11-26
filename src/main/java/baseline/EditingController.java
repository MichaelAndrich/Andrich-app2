/*
 *  UCF COP3330 Fall 2021 Application Assignment 2 Solution
 *  Copyright 2021 Michael Andrich
 */

/*
    create controller for the edit window that pops up when changing value, name or serial number
    SHALL include the functionalities of the add/remove/edit buttons
    SHALL return errors for incorrect or missing input from user
 */


/*
    Create functionality for edit and delete buttons along with error messages to
    meet the specific requirements for each field
 */

package baseline;

import baseline.Item;
import baseline.SortingItems;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class EditingController {

    @FXML private TextField nameField;
    @FXML private TextField serialField;
    @FXML private Label nameCharCounter;
    @FXML private TextField valueField;
    @FXML private Label titleLabel;

    private InventoryController inventoryController = null;
    private SortingItems inventory;
    private Item item;
    private final ErrorCheck errorCheck = new ErrorCheck();

    // calls ErrorCheck to check the edited name, serial and value fields
    // and if passes, added to the inventory
    @FXML
    void editItemButtonClicked() {

    }

    // prompts user to make sure they want to delete the selected item
    // If selected yes, the item is removed
    @FXML
    void deleteItemButtonClicked() {

    }

    // calls ErrorCheck to check the name entered
    // and if passes, added to the inventory
    // if fails, then prompts user how to properly enter the name field
    // must be between 2 and 256 characters
    @FXML
    void errorNameField() {

    }

    // calls ErrorCheck to check the serial number entered
    // and if passes, added to the inventory
    // if fails, then prompts user how to properly enter the serial number field
    // must be in format of A-XXX-XXX-XXX where A is a letter and X can be a letter or number
    @FXML
    void errorSerialField() {

    }

    // calls ErrorCheck to check the value entered
    // and if passes, added to the inventory
    // if fails, then prompts user how to properly enter the value field
    // value must be > 0.00
    @FXML
    void errorValueField() {

    }
}
