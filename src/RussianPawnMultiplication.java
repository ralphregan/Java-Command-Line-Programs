public class RussianPawnMultiplication {

    public static int farmerMultIter(int x, int y){
        int z =0;
        // we have the multiplication of 2 num
        // if x is odd we multiply y by 2 and move the addition fof previous y to the new one in a
        // new var
        for (;x > 0;) {


            if(x%2 ==1){
                z = z + y;
            }
            x = x / 2;
            y = y + y;

        }
        return z;

    }

    public static void main(String[] args) {
        System.out.println(farmerMultIter(27, 82));
    }

}
