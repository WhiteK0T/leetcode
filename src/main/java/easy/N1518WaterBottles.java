package easy;

public class N1518WaterBottles {
    /*
    1518. Water Bottles
    There are numBottles water bottles that are initially full of water. You can exchange numExchange empty water
    bottles from the market with one full water bottle.
    The operation of drinking a full water bottle turns it into an empty bottle.
    Given the two integers numBottles and numExchange, return the maximum number of water bottles you can drink.

    Constraints:
        1 <= numBottles <= 100
        2 <= numExchange <= 100
     */

    public int numWaterBottles(int numBottles, int numExchange) {
        if (numBottles < 2) {
            return numBottles;
        }
        int currentBottlesExchange = numBottles;
        int result = numBottles;
        do {
            numBottles = currentBottlesExchange / numExchange;
            currentBottlesExchange = numBottles + (currentBottlesExchange % numExchange);
            result += numBottles;
        } while (numBottles > 0);
        return result;
    }
}
