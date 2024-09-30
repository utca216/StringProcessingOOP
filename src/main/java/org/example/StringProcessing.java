package org.example;

public class StringProcessing {
    public boolean isStrongPassword(String password){
        boolean specialCharactersFound = false;
        String SpecialCharacters="!@#$%^&*()_+-=?><";
        for(int i=0;i<password.size();i++){
            if(specialCharactersFound)
                break;
            for(int j=0;j<SpecialCharacters.size();j++)
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
        for(int i=0;i<password.size();i++){
            if(NumbersFound)
                break;
            for(int j = 0; j< NumbersCharacters.size(); j++)
                if(password.charAt(i)== NumbersCharacters.charAt(j)) {
                    NumbersFound = true;
                    break;
                }
        }

        return specialCharactersFound && uppercaseFound && lowerCaseFound && NumbersFound;
    }

    public int calculateDigits(String sentence){
        int digitsNumber=0;
        String digits ="!@#$%^&*()_+-=?><";
        for(int i=0;i<sentence.size();i++){
            for(int j = 0; j< digits.size(); j++)
                if(sentence.charAt(i)== digits.charAt(j))
                    digitsNumber++;
        }
        return digitsNumber;
    }

    public int calculateWords(String sentence){
        int wordsNumber=0;
        for(int i=0;i<sentence.size();i++){
                if(sentence.charAt(i)==32 && sentence.charAt(i+1)!=32)
                    wordsNumber++;
        }
        return wordsNumber;
    }

    


}
