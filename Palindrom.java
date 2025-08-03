import java.util.Scanner;
class Palindrom {
    public boolean isPalindrome(int x) {

        if(x<0) return false;

        int original = x;
        int rev = 0;

        while (x>0){
            int a = x % 10;
            rev = rev * 10 + a;
            x = x / 10;
        }

        return original==rev;
    }

}