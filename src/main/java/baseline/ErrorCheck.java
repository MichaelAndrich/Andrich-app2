/*
 *  UCF COP3330 Fall 2021 Application Assignment 2 Solution
 *  Copyright 2021 Michael Andrich
 */

/*
    This will check the input from the user to match the correct length of each respective field
    Also create a method to check the serial code is unique
 */


package baseline;

import baseline.Item;

public class ErrorCheck {

    public String checkName(String name) {
        // check for length is between 2 and 256 for the name
        return name;
    }

    public String checkSerial(String serial) {
        // check for inputted data matches A-XXX-XXX-XXX
        return serial;
    }

    public String checkValue(String value) {
        // check that a number is inputted and has to be greater than 0 (nothing is free in this world)
        return value;
    }

    public String checkUnique() {
        // checks that the serial number is not the same as any other already inputted
        return null;
    }
}
