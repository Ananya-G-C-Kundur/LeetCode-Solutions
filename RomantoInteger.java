class RomantoInteger {
    public int romanToInt(String s) {
        int prev = 0;
        int res = 0;

        for(int i=s.length()-1;i>=0;i--){
            char c = s.charAt(i);
            int curr = getValue(c);

            if(curr<prev){
                res-=curr;
            }
            else{
                res+=curr;
            }
            prev = curr;
        }
        return res;
    }
    
    public int getValue(char c){
        switch(c){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return 0;
        }
    }
    public static void main(String[] args){
        RomantoInteger obj = new RomantoInteger();
        System.out.println(obj.romanToInt("XML"));
    }
}