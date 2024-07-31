package mathfordsa;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int n=27;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0 ) list.add(i);
            while(n%i==0) n/=i;
        }
        if(n!=1) list.add(n);
        System.out.println(list);
    }
}
