package commandline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class TestDemo {
	public static void main(String[] args) {
		Card c1 = new Card("350r",1,9,2,3,0);
		Card c2 = new Card("Test2",1,2,3,4,5);
		Card c3 = new Card("Test3",1,3,5,1,2);
		Card c4 = new Card("Test4",4,5,7,2,1);
		Card c5 = new Card("Test5",1,7,3,8,3);
		//System.out.println(c1.getName());
		//c1.getProperty(0);
		Player p1 = new Player("Test");
		//p1.addCard(c1);
		//p1.addCard(c2);
		//System.out.println(p1.getDeck().peekAtTopCard().getName());
		//System.out.println(p1.getDeck().getSizeofDeck());
		Game game = new Game();
		//game.play();

		/*game.addCards();
		for (int i = 0; i < game.cardList.size(); i++) {
			System.out.print(game.cardList.get(i).getName());
			System.out.print(" ");
		}
		System.out.println(" ");
		System.out.println(game.cardList.size());*/

		ArrayList<Integer> test = new ArrayList<>();
		test.add(1);
		test.add(4);
		test.add(5);
		test.add(7);
		test.add(7);
		test.add(2);
		System.out.println(Collections.max(test));
		test.remove(0);
		System.out.println(test.get(0));

		Stack<Integer> test1 = new Stack<Integer>();
		test1.push(1);
		test1.push(2);
		test1.push(3);
		test1.add(4);
		test1.push(5);
		test1.add(0,6);
		for (int i = 0; i < test1.size(); i++) {
			System.out.print(test1.get(i));
		}
		System.out.println(test1.peek());


	}
}
