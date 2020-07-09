public class GameStrategy {
	private boolean placedQueens[][] = new boolean[8][8];
	private int numQueens = 0;
	static int[][] blocked = new int[8][8];

	private int getColumn(int cellId) {
		// WRITE YOUR LOGIC HERE...................................		

		int col= 0;
		if(cellId%8==0)
			col=0;
		else if((cellId-1)%8==0)
			col=1;
		else if((cellId-2)%8==0)
			col=2;
		else if((cellId-3)%8==0)
			col=3;
		else if((cellId-4)%8==0)
			col=4;
		else if((cellId-5)%8==0)
			col=5;
		else if((cellId-6)%8==0)
			col=6;
		else
			col=7;
		return col;	// just for the heck of it
	}
	
	private int getRow(int cellId) {
		// WRITE YOUR LOGIC HERE....................................
		int row = 0;
		if(cellId<8)
			row=0;
		else if(cellId>7&&cellId<16)
			row=1;
		else if(cellId>15&&cellId<24)
			row=2;
		else if(cellId>23&&cellId<32)
			row=3;
		else if(cellId>31&&cellId<40)
			row=4;
		else if(cellId>39&&cellId<48)
			row=5;
		else if(cellId>47&&cellId<56)
			row=6;
		else if(cellId>55&&cellId<64)
			row=7;
		return row;	// just for the heck of it
	}

	public boolean isValidPosition(int cellId) {
        boolean isValid = true;

        if(numQueens == 8) throw new GameOverException();    // just return out of the method

        // the game is still on, so let us continue...

        int col = getColumn(cellId);
        int row = getRow(cellId);

        if(blocked[row][col] == 0) {
            blocked[row][col] = 1;
            for(int i=0; i<8; i++) {
                blocked[row][i] = 1;
                blocked[i][col] = 1;
            }
            int i = row;
            int j = col;
            while(i<8 && j<8) {
                blocked[i++][j++] = 1;
            }
            i = row;
            j = col;
            while(i>=0 && j>=0) {
                blocked[i--][j--] = 1;
            }
            i = row;
            j = col;
            while(i>=0 && j<8) {
                blocked[i--][j++] = 1;
            }
            i = row;
            j = col;
            while(i<8 && j>=0) {
                blocked[i++][j--] = 1;
            }

            return isValid;
        }
        else {
            return !isValid;
        }
    }
}














