package day28_ArrayList;

public class StrongPassword2 {
    public static void main(String[] args) {
        String password="WoodenSpoon123";
        int countUpperCase=0;
        int countLowerCase=0;
        int countDigit=0;
        int countSpecialChars=0;

        for (int i = 0; i < password.length(); i++) {
            char each=password.charAt(i);
            if (Character.isUpperCase(each)){
                countUpperCase++;
            } else if (Character.isLowerCase(each)) {
                countLowerCase++;
            } else if (Character.isDigit(each)) {
                countDigit++;
            }else {
                countSpecialChars++;
            }
        }
        /*
        System.out.println("countLowerCase = " + countLowerCase);
        System.out.println("countUpperCase = " + countUpperCase);
        System.out.println("countSpecialChars = " + countSpecialChars);
        System.out.println("countDigit = " + countDigit);

         */



        boolean hasUpperCase=countUpperCase>0;
        boolean hasLowerCase=countLowerCase>0;
        boolean hasDigit=countDigit>0;
        boolean hasSpecialChar=countSpecialChars>0;
        boolean strongPassword=false;
        if (password.length()>=8){
            if (!password.contains(" ")){
                if (hasUpperCase){
                    if (hasLowerCase){
                        if (hasDigit){
                            if (hasSpecialChar){
                                strongPassword=true;
                            }
                        }
                    }
                }
            }
        }


        System.out.println("strongPassword = " + strongPassword);
    }
}
