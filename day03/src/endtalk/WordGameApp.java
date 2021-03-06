package endtalk;

import static java.lang.System.out;
import java.util.Scanner;

public class WordGameApp {
	public static void main(String [] args) {
		System.out.println("끝말잇기 게임을 시작합니다...");
		run();
	}
	
	
	static void run() {
		int playerNum;
		String lastWord = "아버지";
		Scanner in = new Scanner(System.in);
		out.print("게임에 참가하는 인원은 몇명입니까? >>");
		playerNum = in.nextInt();
		out.print(playerNum + "명" + '\n');
		Player[] players = new Player[playerNum];
		
		for(int i=0;i<playerNum;i++) {
			out.print("참가자의 이름을 입력하세요 >>");
			String name = in.next();
			players[i] = new Player(name);
		}
		
		out.print("입력이 완료되었습니다." + '\n');
		out.print("시작하는 단어는 아버지입니다." + '\n');
		
		while(true) {
            for(int i=0;i<playerNum;i++) {
                String name = players[i].name;
                System.out.print(name + ">>");
                players[i].sayWord(in.next());
                if(players[i].succeed(lastWord) == true) {
                    lastWord = players[i].word;
                }
                else {
                    System.out.println(name + "이 졌습니다.");
                    System.exit(0);
                }
            }
		}
	}
}
