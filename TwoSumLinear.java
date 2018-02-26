import java.util.Arrays;
import java.util.HashMap;

public class TwoSumLinear {
    public static int count(int[] a){
        int cnt = 0;
        int n = a.length;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i =0; i<n;i++){
            if(map.get(a[i]) == null) map.put(a[i], i);
            Integer negIndex = map.get(-a[i]);
            if(negIndex != null && negIndex != i){
                System.out.println("a["+negIndex+"]="+(-a[i])+"和a["+i+"]="+a[i]);
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args){
        int[] a = { 30, -40, -20, -10, 40, 0, 10, 5 };
        System.out.println(Arrays.toString(a));
        System.out.println(count(a));
    }
}