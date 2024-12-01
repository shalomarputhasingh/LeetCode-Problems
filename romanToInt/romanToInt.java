import java.lang.classfile.components.ClassPrinter.LeafNode;
import java.util.Scanner;
class romanToInt{

    static int returnNum(Character roman){
        int I = 1;
        int V = 5;
        int X = 10;
        int L = 50;
        int C = 100;
        int D = 500;
        int M = 1000;
        if (roman == 'I'){
            return I;
        }
        else if (roman == 'V'){
            return V;
        }
        else if(roman == 'X'){
            return X;
        }
        else if (roman  == 'L'){
            return L;
        }
        else if(roman == 'C'){
            return C;
        }
        else if(roman == 'D'){
            return D;
        }
        else if(roman == 'M'){
            return M;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the Roman: ");
        Scanner scan = new Scanner(System.in);
        String romans = scan.nextLine();
        scan.close();
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
        System.out.println(num);
    }
    
}