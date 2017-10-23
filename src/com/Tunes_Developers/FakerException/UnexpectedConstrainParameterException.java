package com.Tunes_Developers.FakerException;

/**
 * Created by Geoffrey-Kimani on 10/1/2017.
 */
public class UnexpectedConstrainParameterException extends Exception {
    public UnexpectedConstrainParameterException(char letter) {
        super("The character '"+letter+"' in the Constrain Format is not a number");
    }
}
