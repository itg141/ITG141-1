//Armstrong number
package neww;
public class P50 {
    public static void main(String[] args) {
        int n=153,o,rem,res=0;
         o=n;
        while(o!= 0)
        {
            rem=o % 10;
            res += Math.pow(rem, 3);
            o /= 10;
        }
        if(res==n)
            System.out.println(n + "is an Armstrong number");
        else
            System.out.println(n + "is not an Armstrong number");
    }
}