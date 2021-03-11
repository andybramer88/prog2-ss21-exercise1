public class Password_check
{
    public static boolean passwordLength(String password)
    {
        if (password.length() >= 8 && password.length() <= 25){
            return true;
        }
        return false;
    }

    public static boolean passwordUppercase(String password)
    {
        int help1=0;
        char[] a = password.toCharArray();

        for(int i=0; i<password.length(); i++){
            if(Character.isUpperCase(a[i])){
                help1++;
            }
        }

        if (help1 >= 1){
            return true;
        } else {
            return false;
        }
    }

    public static boolean passwordLowercase(String password)
    {
        int help2=0;
        char[] a = password.toCharArray();

        for(int i=0; i<password.length(); i++){
            if(Character.isLowerCase(a[i])){
                help2++;
            }
        }

        if (help2 >= 1){
            return true;
        } else {
            return false;
        }
    }

    public static boolean passwordContainsNumbers(String password)
    {
        char[] a = password.toCharArray();
        int test=0;
        for(int i=0; i<password.length(); i++){
            if(Character.isDigit(a[i])){
                test++;
            }
        }
        if(test>=0){
            return true;
        } else {
            return false;
        }
    }

    public static boolean passwordContainsSymbols(String password)
    {
        char[] pw = password.toCharArray();
        char[] symbols = {'(', ')', '#', '$', '?', '!', '%', '/', '@'};
        int test=0;

        for(int i=0; i<password.length(); i++){
            for(int j=0; j<9; j++){
                if(pw[i] == symbols[j]){
                    test++;
                }
            }
        }

        if(test>=0){
            return true;
        } else {
            return false;
        }
    }

    // Extensions

    public static boolean pwContainsOngoingNumbers(String password)
    {
        /* in Progress
        int numbers=0;
        char[] pw = password.toCharArray();
        for(int i=0; i<password.length(); i++){
            if(Character.isDigit(pw[i]){

                if(Character.isDigit(pw[i+1])){

                }
            }
        }*/
        return true;
    }


    public static void main(String[] args)
    {
    }
}