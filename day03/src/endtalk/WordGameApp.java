package endtalk;

import static java.lang.System.out;
import java.util.Scanner;

public class WordGameApp {
	public static void main(String [] args) {
		System.out.println("�����ձ� ������ �����մϴ�...");
		run();
	}
	
	
	static void run() {
		int playerNum;
		String lastWord = "�ƹ���";
		Scanner in = new Scanner(System.in);
		out.print("���ӿ� �����ϴ� �ο��� ����Դϱ�? >>");
		playerNum = in.nextInt();
		out.print(playerNum + "��" + '\n');
		Player[] players = new Player[playerNum];
		
		for(int i=0;i<playerNum;i++) {
			out.print("�������� �̸��� �Է��ϼ��� >>");
			String name = in.next();
			players[i] = new Player(name);
		}
		
		out.print("�Է��� �Ϸ�Ǿ����ϴ�." + '\n');
		out.print("�����ϴ� �ܾ�� �ƹ����Դϴ�." + '\n');
		
		while(true) {
            for(int i=0;i<playerNum;i++) {
                String name = players[i].name;
                System.out.print(name + ">>");
                players[i].sayWord(in.next());
                if(players[i].succeed(lastWord) == true) {
                    lastWord = players[i].word;
                }
                else {
                    System.out.println(name + "�� �����ϴ�.");
                    System.exit(0);
                }
            }
		}
	}
}