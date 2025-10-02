public class CharGrid{
    private char [][] grid;
    public CharGrid(char grid [][]){
        this.grid = grid;
    }
    public int charArea(char ch){
        int mirow=Integer.MAX_VALUE;
        int marow=Integer.MIN_VALUE;
        int micol=Integer.MAX_VALUE;
        int macol=Integer.MIN_VALUE;
        int c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==ch){
                    mirow=Math.min(mirow,i);
                    marow=Math.max(marow,i);
                    micol=Math.min(micol,j);
                    macol=Math.max(macol,j);
                    c++;
                }
            }
        }
        if(mirow==Integer.MAX_VALUE) return 0;
        if(c==1) return c;
        return (marow-mirow+1)*(macol-micol+1);
    }
    public int countPlus() {
        int c=0;
        int hang=grid.length;
        int cot=grid[0].length;
        for(int i=0;i<hang;i++){
            for(int j=0;j<cot;j++){
                int tren=dodai(i,j,-1,0,grid[i][j]);
                int duoi=dodai(i,j,1,0,grid[i][j]);
                int trai=dodai(i,j,0,-1,grid[i][j]);
                int phai=dodai(i,j,0,1,grid[i][j]);
                if(tren == duoi && trai == phai && tren == trai && tren >= 1) {
                    c++;
                }
            }
        }
        return c;
    }

    // Hàm private tính chiều dài nhánh theo hướng
    private int dodai(int i, int j, int dx, int dy, char ch) {
        int len = 0;
        int numRows = grid.length;
        int numCols = grid[0].length;

        int x = i + dx;
        int y = j + dy;

        while (x >= 0 && x < numRows && y >= 0 && y < numCols
                && grid[x][y] == ch) {
            len++;
            x += dx;
            y += dy;
        }
        return len;
    }

}


