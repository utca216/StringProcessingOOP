package org.example;

public class StringProcessing {
    public boolean isStrongPassword(String password){
        boolean specialCharactersFound = false;
        String SpecialCharacters="!@#$%^&*()_+-=?><";
        for(int i=0;i<password.length();i++){
            if(specialCharactersFound)
                break;
            for(int j=0; j<SpecialCharacters.length(); j++)
                if(password.charAt(i)==SpecialCharacters.charAt(j)) {
                    specialCharactersFound = true;
                    break;
                }
        }

        boolean uppercaseFound = false;
        if(password.toLowerCase()!=password)
            uppercaseFound=true;

        boolean lowerCaseFound = false;
        if(password.toUpperCase()!=password)
            lowerCaseFound=true;

        boolean NumbersFound = false;
        String NumbersCharacters ="0123456789";
        for(int i=0;i<password.length();i++){
            if(NumbersFound)
                break;
            for(int j = 0; j< NumbersCharacters.length(); j++)
                if(password.charAt(i)== NumbersCharacters.charAt(j)) {
                    NumbersFound = true;
                    break;
                }
        }

        return specialCharactersFound && uppercaseFound && lowerCaseFound && NumbersFound;
    }

    public int calculateDigits(String sentence){
        int digitsNumber=0;
        String digits ="0123456789";
        for(int i=0;i<sentence.length();i++){
            for(int j = 0; j< digits.length(); j++)
                if(sentence.charAt(i)== digits.charAt(j))
                    digitsNumber++;
        }
        return digitsNumber;
    }

    public int calculateWords(String sentence){
        int wordsNumber=0;
        if(sentence.charAt(0)!=32)
            wordsNumber++;
        for(int i=0;i<sentence.length();i++){
                if(sentence.charAt(i)==32 && sentence.charAt(i+1)!=32)
                    wordsNumber++;
        }
        return wordsNumber;
    }




}
