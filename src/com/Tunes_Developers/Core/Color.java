package com.Tunes_Developers.Core;

import java.util.Random;

/**
 * Created by Geoffrey-Kimani on 10/1/2017.
 */
public class Color {
    private String[] SafeColorNames = {
            "black", "maroon", "green", "navy", "olive",
            "purple", "teal", "lime", "blue", "silver",
            "gray", "yellow", "fuchsia", "aqua", "white"
    };

    private String[] AllColorNames = {
            "AliceBlue", "AntiqueWhite", "Aqua", "Aquamarine",
            "Azure", "Beige", "Bisque", "Black", "BlanchedAlmond",
            "Blue", "BlueViolet", "Brown", "BurlyWood", "CadetBlue",
            "Chartreuse", "Chocolate", "Coral", "CornflowerBlue",
            "Cornsilk", "Crimson", "Cyan", "DarkBlue", "DarkCyan",
            "DarkGoldenRod", "DarkGray", "DarkGreen", "DarkKhaki",
            "DarkMagenta", "DarkOliveGreen", "Darkorange", "DarkOrchid",
            "DarkRed", "DarkSalmon", "DarkSeaGreen", "DarkSlateBlue",
            "DarkSlateGray", "DarkTurquoise", "DarkViolet", "DeepPink",
            "DeepSkyBlue", "DimGray", "DimGrey", "DodgerBlue", "FireBrick",
            "FloralWhite", "ForestGreen", "Fuchsia", "Gainsboro", "GhostWhite",
            "Gold", "GoldenRod", "Gray", "Green", "GreenYellow", "HoneyDew",
            "HotPink", "IndianRed", "Indigo", "Ivory", "Khaki", "Lavender",
            "LavenderBlush", "LawnGreen", "LemonChiffon", "LightBlue", "LightCoral",
            "LightCyan", "LightGoldenRodYellow", "LightGray", "LightGreen", "LightPink",
            "LightSalmon", "LightSeaGreen", "LightSkyBlue", "LightSlateGray", "LightSteelBlue",
            "LightYellow", "Lime", "LimeGreen", "Linen", "Magenta", "Maroon", "MediumAquaMarine",
            "MediumBlue", "MediumOrchid", "MediumPurple", "MediumSeaGreen", "MediumSlateBlue",
            "MediumSpringGreen", "MediumTurquoise", "MediumVioletRed", "MidnightBlue",
            "MintCream", "MistyRose", "Moccasin", "NavajoWhite", "Navy", "OldLace", "Olive",
            "OliveDrab", "Orange", "OrangeRed", "Orchid", "PaleGoldenRod", "PaleGreen",
            "PaleTurquoise", "PaleVioletRed", "PapayaWhip", "PeachPuff", "Peru", "Pink", "Plum",
            "PowderBlue", "Purple", "Red", "RosyBrown", "RoyalBlue", "SaddleBrown", "Salmon",
            "SandyBrown", "SeaGreen", "SeaShell", "Sienna", "Silver", "SkyBlue", "SlateBlue",
            "SlateGray", "Snow", "SpringGreen", "SteelBlue", "Tan", "Teal", "Thistle", "Tomato",
            "Turquoise", "Violet", "Wheat", "White", "WhiteSmoke", "Yellow", "YellowGreen"
    };

    int SafeColorNo = SafeColorNames.length-1, AllColorNo = AllColorNames.length-1;

    Random ran = new Random();

    public Color() {

    }

    public String getSafeColorName() {
        return SafeColorNames[ran.nextInt(SafeColorNo)];
    }

    public String getColorName() {
        return AllColorNames[ran.nextInt(AllColorNo)];
    }

    public String getRgbColor() {
        String color = "";

        for (int i = 0; i < 3; i++) {
            if (i != 2) {
                color += ran.nextInt(256) + ",";
            } else {
                color += ran.nextInt(256) + "";

            }
        }

        return color;
    }

    public String getRgbCssColor() {
        String color = "rgb(";

        for (int i = 0; i < 3; i++) {
            if (i != 2) {
                color += ran.nextInt(256) + ",";
            } else {
                color += +ran.nextInt(256) + ")";
            }
        }
        return color;
    }

    public String getHexColor() {
        int color = ran.nextInt(16777215);

        if (color == 0) {
            color=+1;
        }

        return "#"+Integer.toHexString(color);
    }
}
