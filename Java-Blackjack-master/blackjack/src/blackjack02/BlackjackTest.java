package blackjack02;

import java.util.Scanner;
import blackjack.Game;
import static blackjack02.Print.*;


public class BlackjackTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			options("1) Game start\n0) Exit");
			System.out.printf("버튼클릭 ====>");
			int input = scan.nextInt();

			if (input == 0) {
				System.out.println("게임 종료 ");
				break;
			} else if (input != 1) {
				wrongInput();
				continue;
			}

			new Game(scan);
			break;
		}

	}

}
