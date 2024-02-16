public class PrimeOrNot {

    public static boolean IsprimeOrNot(int num) {
        if (num<1) {
            return false;
        }
        for(int i=2; i<=Math.sqrt(num); i++){
            if (num%i==0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int num = 4;
        System.out.println(IsprimeOrNot(num));
    }
}
