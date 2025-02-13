public class DistributeCandies {
    public static void main(String[] args) {
        int candies = 10;
        int noOfPeople = 3;
        int result[] = new int[noOfPeople];
        int give = 1, i = 0;
        while (candies > 0) {
            result[i % noOfPeople] += Math.min(give, candies);
            candies = candies - give;
            give++;
            i++;
        }
        for (int count : result) {
            System.out.print(count + " ");
        }
    }
}
