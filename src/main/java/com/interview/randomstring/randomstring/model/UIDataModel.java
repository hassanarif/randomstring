package com.interview.randomstring.randomstring.model;

public class UIDataModel {

    private int numberOfLines;
    private int stringsLength;
    private boolean numericAllowed;
    private boolean upperCaseAllowed;
    private boolean lowerCaseAllowed;
    private boolean uniqueAllowed = true;

    public int getNumberOfLines() {
        return numberOfLines;
    }

    public void setNumberOfLines(int numberOfLines) {
        this.numberOfLines = numberOfLines;
    }

    public int getStringsLength() {
        return stringsLength;
    }

    public void setStringsLength(int stringsLength) {
        this.stringsLength = stringsLength;
    }

    public boolean isNumericAllowed() {
        return numericAllowed;
    }

    public void setNumericAllowed(boolean numericAllowed) {
        this.numericAllowed = numericAllowed;
    }

    public boolean isUpperCaseAllowed() {
        return upperCaseAllowed;
    }

    public void setUpperCaseAllowed(boolean upperCaseAllowed) {
        this.upperCaseAllowed = upperCaseAllowed;
    }

    public boolean isLowerCaseAllowed() {
        return lowerCaseAllowed;
    }

    public void setLowerCaseAllowed(boolean lowerCaseAllowed) {
        this.lowerCaseAllowed = lowerCaseAllowed;
    }

    public boolean isUniqueAllowed() {
        return uniqueAllowed;
    }

    public void setUniqueAllowed(boolean uniqueAllowed) {
        this.uniqueAllowed = uniqueAllowed;
    }
}
