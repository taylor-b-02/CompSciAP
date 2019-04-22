public class TowersTester {
	public static void main(String[] args) {
		
		Towers mover = new Towers(1, 3, 3);
		while (mover.hasMoreMoves())
		{
		 System.out.println(mover.nextMove());
		}
		
	}

}
