package org.example;

public class StringProcessing {
    public boolean isStrongPassword(String password){
        boolean digit=(password.contains("0") || password.contains("1")|| password.contains("2")|| password.contains("3")|| password.contains("4")|| password.contains("5")|| password.contains("6")|| password.contains("7")|| password.contains("8")|| password.contains("9") )
        boolean specialCaracter=(password.contains("!"))|| password.contains("@")|| password.contains("#")|| password.contains("$")|| password.contains("%")|| password.contains("^")|| password.contains("&")|| password.contains("*")|| password.contains("(")|| password.contains(")")|| password.contains("+")|| password.contains("_")|| password.contains("-"))
        
    }
}
