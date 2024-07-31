package mathfordsa;

public class PrimeOrNot {
    public static void main(String[] args) {
        int n=37,cnt=0;
        for(int i=1;i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
               cnt++;
                if(n/i!=i){
                    cnt++;
                }
            }
            if(cnt>2) break;
        }
        if(cnt==2) System.out.println("Prime");
        else System.out.println("Not a Prime");
    }
}
