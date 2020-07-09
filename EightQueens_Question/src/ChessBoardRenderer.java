public class ChessBoardRenderer {
	public boolean isBlackSquare(int square) {

		// WRITE YOUR LOGIC HERE...
		if(square<8||(square>15&&square<24)||(square>31&&square<40)||(square>47&&square<56))
		{
			if(square%2!=0)
				return true;
			else
				return false;
		}
		else if((square>7&&square<16)||(square>23&&square<32)||(square>39&&square<48)||(square>55&&square<64))
		{
			if(square%2==0)
				return true;
			else
				return false;				
		}
		else
		 return false;
	}
}
