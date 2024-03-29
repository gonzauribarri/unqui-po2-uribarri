package ar.edu.unq.po2.tp3;

public class Multiplies {

	private int x;
	private int y;

	public Multiplies(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getMaxMultiplie() {
		for (int i = 1000; i >= 0; i--) {
			if (i % this.getX() == 0 && i % this.getY() == 0) {
				return i;
			}
		}
		return -1;
	}
}
