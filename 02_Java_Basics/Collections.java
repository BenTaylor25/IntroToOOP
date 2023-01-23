import java.util.ArrayList;

public class Collections {
    public static void main(String[] args) {

        int[] staticArr = new int[5];
        staticArr[0] = 5;

        int[] staticArr2 = {1, 3, 2};

        ArrayList<Integer> dynArr = new ArrayList<>();
        dynArr.add(25);

        System.out.println(staticArr[0]);
        System.out.println(staticArr2[1]);
        System.out.println(dynArr.get(0));

    }
}
