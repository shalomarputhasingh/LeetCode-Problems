class Solution {
    static int returnNum(Character roman){
        if (roman == 'I'){
            return 1;
        }
        else if (roman == 'V'){
            return 5;
        }
        else if(roman == 'X'){
            return 10;
        }
        else if (roman  == 'L'){
            return 50;
        }
        else if(roman == 'C'){
            return 100;
        }
        else if(roman == 'D'){
            return 500;
        }
        else if(roman == 'M'){
            return 1000;
        }
        else{
            return 0;
        }
    }
    public static int romanToInt(String s) {
        String romans = s;
        int length = romans.length();
        int num = 0;
        for (int i=0;i<length;i++){
            int j = 0;
            int b = 0;
            if(i+1 == length) j=0; else j=i+1;
            int a = returnNum(romans.charAt(i));
            if(j!=0) b = returnNum(romans.charAt(j));  
            if (j == 0){
                num+=a;
            }
            else if (a<b){
                num = num +(b-a);
                i++;
            }
            else{
                num+=a;
            }
        }
        return num;
    }
}