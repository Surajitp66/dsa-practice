package linearSearch;

public class maximumWealth {
    public static void main(String[] args) {
        int[][] accounts ={{2,8,7},{7,1,3},{1,9,5}};
        System.out.println("Maximum wealth: " + maximumWealth(accounts));  // Output: 17
    }

    public static int maximumWealth(int[][] accounts) {
        int maxWealth =0;
        for(int row =0; row < accounts.length; row++){
            int totalWealth =0;
            for(int col =0; col< accounts[row].length; col++){
                totalWealth = totalWealth + accounts[row][col];
            }
            if(totalWealth > maxWealth)
                maxWealth = totalWealth;
        }
        return maxWealth;
    }
}
