class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int player1Result = playerTotalSum(player1);
        int player2Result = playerTotalSum(player2);

        if(player1Result > player2Result) return 1;
        else if(player1Result < player2Result) return 2;
        return 0;
    }

    public int playerTotalSum(int[] player) {
        int result = 0;
        int maxValue = 10;
        for(int i = player.length - 1; i >= 1; i--) {
            if(player[i - 1] == 10 || ( i >= 2 && player[i - 2] == 10) ) {
                player[i] = 2 * player[i];
            }
        }

        for(int i = 0; i < player.length; i++) {
            result = result + player[i];
        }

        return result;
    }
}