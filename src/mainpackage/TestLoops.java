public class TestLoops {

    public static void main(String args[]) {
        int [] numbers = {10, 20, 30, 40, 50};

        for(int x : numbers ) {
            System.out.print( x );
            System.out.print(",");
        }
        System.out.print("\n");
        String [] names = {"James", "Larry", "Tom", "Lacy"};

        for( String name : names ) {
            System.out.print( name );
            System.out.print(",");
        }

        for(int x = 10; x < 20; x = x + 1) {
            System.out.print("value of x : " + x );
            System.out.print("\n");
        }

        int [] numberss = {10, 20, 30, 40, 50};

        for(int x : numberss ) {
            if( x == 30 ) {
                break;
            }
            System.out.print( x );
            System.out.print("\n");
        }

        int [] numbersss = {10, 20, 30, 40, 50};

        for(int x : numbersss ) {
            if( x == 30 ) {
                continue;
            }
            System.out.print( x );
            System.out.print("\n");
        }

        int xx = 10;

        while( xx < 20 ) {
            System.out.print("value of x : " + xx );
            xx++;
            System.out.print("\n");
        }

        int yx = 10;

        do {
            System.out.print("value of x : " + yx );
            yx++;
            System.out.print("\n");
        }while( yx < 20 );
    }
}