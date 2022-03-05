public class Solution {
    // Type your main code here
    private int numerator;
    private int denominator;

    // phuong thuc getter
    public int getNumerator () {
        return numerator;
    }
    public int getDenominator () {
        return denominator;
    }

    // phuong thuc setter
    public void setNumerator (int a) {
        a = numerator;
    }
    public void setDenominator (int b) {
        b = denominator;
    }

    // phuong thuc khoi tao
    public Solution (int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    // dam bao phan so co nghia
    public static boolean check (int a, int b) {
        if(b==0) return false;
        return true;
    } 

    // phuong thuc tim ucln
    public static int ucln (int a, int b) {
        if (a < 0) a = a* -1;
        if (b < 0) b = b* -1;
        if(a==0) return b;
        if(b==0) return a;
        while (a!=b) {
            if(a>b) a=a-b;
            else b=b-a;
        }
        return a;
    }

    // rut gon phan so
    public static Solution reduce(int a, int b) {
        int u = ucln(a,b);
        return Solution(a/u,b/u);
    }