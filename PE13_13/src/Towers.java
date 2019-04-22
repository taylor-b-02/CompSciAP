public class Towers {
	public Towers(int src, int dest, int dsk) {
		
		source = src;
		target = dest;
		disks = dsk;
		
		int other = 6 - source - target;

		if (disks > 1)
			mover = new Towers(source, other, disks - 1);

		state = BEFORE_LARGEST;
	}

	public boolean hasMoreMoves() {
		return state != DONE;
	}

	public String nextMove() {
		if (disks == 1) {
			state = DONE;
			return "Move disk from peg " + source + " to peg " + target;
		}

		if (state == LARGEST) {
			state = AFTER_LARGEST;
			int other = 6 - source - target;
			mover = new Towers(other, target, disks - 1);
			return "Move disk from peg " + source + " to peg " + target;
		}

		String r = mover.nextMove();

		if (!mover.hasMoreMoves()) {
			if (state == BEFORE_LARGEST)
				state = LARGEST;
			else
				state = DONE;
		}
		return r;
	}

	private int source;
	private int target;
	private int disks;
	private Towers mover;
	private int state;

	private static final int BEFORE_LARGEST = 1;
	private static final int LARGEST = 2;
	private static final int AFTER_LARGEST = 3;
	private static final int DONE = 4;
}