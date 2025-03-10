import java.util.HashMap;

public class Baskets {
    public static void main(String[] args) {
        int fruits[] = {4,2,5};
        int baskets[] = {5,5,4};
        int result = numOfUnplacedFruits(fruits,baskets);
        System.out.println(result);
    }
    public static int numOfUnplacedFruits(int[] fruits , int[] baskets){
        if (fruits.length == 0 ||  baskets.length == 0) return 0;
        if (fruits.length > baskets.length) return 0;
        HashMap<Integer,Integer> mapp = new HashMap<>();
        int[] result = new int[baskets.length];
        for ( int i : fruits ) {
            if ( baskets[i] > fruits[i] ) {
                if ( result[i] != 1) {
                    mapp.put(fruits[i], mapp.getOrDefault(baskets[i], 0) + 1);
                    result[i] = 0;
                }
            }
        }
        for ( int i : result ){
            if ( result[i] == 0 ){
                return 0;
            }
        }
        return 1;
    }
}
