package com.Tunes_Developers.Core;

/**
 * Created by Geoffrey-Kimani on 10/1/2017.
 */
public class Barcode {
    Base b;

    public Barcode() {
        b = new Base();
    }

    public String getEan13() {
        return b.replaceWildcardNumerify("#############");
    }

    public String getEan8() {
        return b.replaceWildcardNumerify("########");
    }

    public String getIsbn10() {
        return b.replaceWildcardNumerify("##########");
    }

    public String getIsbn13() {
        return b.replaceWildcardNumerify("#############");
    }
}
