class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<String> set = new HashSet<>();

        for(int i=0;i<9;i++){

            for(int j=0;j<9;j++){

                if(board[i][j]!='.'){

                    String row = new String(board[i][j]+"foundAtRow"+i);

                    String col = new String(board[i][j]+"foundAtCol"+j);

                    String grid = new String(board[i][j]+"foundAtRow"+(i-i%3)+"foundAtCol"+(j-j%3));

                    if(set.add(row)==false || set.add(col)==false || set.add(grid)==false)

                    return false;
                }
            }
        }

        return true;
        
    }
}
