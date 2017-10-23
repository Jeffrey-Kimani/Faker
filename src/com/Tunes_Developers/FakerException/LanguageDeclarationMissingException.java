package com.Tunes_Developers.FakerException;

/**
 * Created by Geoffrey-Kimani on 10/1/2017.
 */
public class LanguageDeclarationMissingException  extends Exception {
    public LanguageDeclarationMissingException() {
        super("A Language has not been initialized");
    }
}
