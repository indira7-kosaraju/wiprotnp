public class Q12{
    public static void main(String[] args){
        int n=Integer.parseInt(args[0]);
        boolean prime=true;
        if (n<=1){
            prime=false;
        }else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    prime=false;
                    break;
                }
            }
        }
        if(prime){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
}