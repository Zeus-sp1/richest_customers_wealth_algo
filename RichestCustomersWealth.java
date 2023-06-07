
/**
 * you are given an m x n integer grid accounts where account[i] [j]
 * is the amount of money the ith customer has in the jth bank. return the wealth that the richest 
 * customer has.
 * A customer wealth is the amount of the money they have in
 * all thier accounts. The richest customer is the customer
 * that has the maximum wealth
 * 
 * constraints;
 * m == accounts.length
 * n == accounts[i].length
 * 1 <=m, n<=50
 * 1 <= accounts[i][j] <= 100
 */

class RichestCustomerWealth{

    public int maxWealth(int[][] accounts){
    int maxWealthSoFar = 0 ;

    for (int[] customer : accounts){
        int currentCustomerWealth = 0 ;

        for (int bankbalance : customer){
            currentCustomerWealth += bankbalance;
        }

        maxWealthSoFar = Math.max(maxWealthSoFar, currentCustomerWealth);
    }
    return maxWealthSoFar;

    }

}