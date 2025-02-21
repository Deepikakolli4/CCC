public class WaterBottle {
    public static void main(String[] args) {
        int numBottles = 9;
        int numExchange = 4;
        int result = numWaterBottles(numBottles, numExchange);
        System.out.println(result);
    }

    public static int numWaterBottles(int numBottles, int numExchange) {
//        int totalBottlesDrunk = numBottles;
//        int emptyBottles = numBottles;
//        while (emptyBottles >= numExchange) {
//            totalBottlesDrunk += emptyBottles / numExchange;
//            emptyBottles = (emptyBottles % numExchange) + (emptyBottles / numExchange);
//        }
//        return totalBottlesDrunk;
        int count = numBottles;
        while (numBottles >= numExchange) {
            numBottles = numBottles - numExchange + 1;
            count++;
        }
        return count;
    }
}
