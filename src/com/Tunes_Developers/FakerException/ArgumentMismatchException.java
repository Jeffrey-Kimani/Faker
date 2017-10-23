package com.Tunes_Developers.FakerException;

/**
 * Created by Geoffrey-Kimani on 6/14/2017.
 */
public class ArgumentMismatchException extends Exception {
    public ArgumentMismatchException() {
        super("The Data format provided does not match the Constrain format");
    }
}
