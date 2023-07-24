import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int i = 4;
        double d = 0.0;

        i += 5;

        if(i == 8) System.out.println("hi");

        else if(i == 7) {
            System.out.println("i is 8");
        }

        else if(i == 6) {
            System.out.println("i is 6");
        }

        else {

        }


        int[] ints = new int[10];
        ints[0] = 5;
        ints[ints.length - 1] = 4;

        for(int j = 0; j < ints.length; j++) {
            ints[j] = j;
        }

        ArrayList<String> list = new ArrayList<>();
        list.add("hiii");
        list.add("byeee");
        list.get(0);
        list.size();

        System.out.println("hello");

        sum(1, 2, 3, 4, 5, 6, 7, 8, 9);
        sum(1, 2, 3);
        sum(ints);

        Vehicle c  = new Car("honad", false, 1);
        ((Car) c).honk();

    }

    public static int sum(int ... ints) {
        int accumulator = 0;
        for(int i = 0; i < ints.length; i++) {
            accumulator += ints[i];
        }

        return accumulator;
    }

    public static double add(int int1, double int2) {
        return int1 + int2;
//        int sum = int1 + int2;
//        return sum;
    }

    public static double add(double d1, int d2) {
        return d1 + d2;
    }

}
