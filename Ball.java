package state;

import java.util.Random;

public class Ball {
	private Random rm = new Random();
	private Already al = new Already();

	public int createBall() {
		int ball = rm.nextInt(75) + 1;
		// 既出は再帰呼び出し
		while (al.already(ball)) {
			ball = rm.nextInt(75) + 1;
		}
		return ball;
	}
}
