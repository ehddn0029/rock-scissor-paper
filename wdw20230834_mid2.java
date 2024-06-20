import java.util.Scanner;
import java.util.Random;

public class wdw20230834_mid2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        Random rdm = new Random();

        System.out.println("가위, 바위, 보 중 하나를 선택하세요:");
        String player1 = scn.next();
        System.out.println("하나를 더 선택하세요:");
        String player2 = scn.next();
        
        if (player1.equals("가위")) {
        	System.out.print("왼손: 가위, ");
        } else if (player1.equals("바위")) {
        	System.out.print("왼손: 바위, ");
        } else if (player1.equals("보")) {
        	System.out.print("왼손: 보, ");
        } else {
        	System.out.print("잘못된 입력입니다. ");
        }  
        if (player2.equals("가위")) {
        	System.out.println("오른손: 가위");
        } else if (player2.equals("바위")) {
        	System.out.println("오른손: 바위");
        } else if (player2.equals("보")) {
        	System.out.println("오른손: 보");
        } else {
        	System.out.println("잘못된 입력입니다.");
        }
        
        
        
        int computer1 = rdm.nextInt(3);
        int computer2 = rdm.nextInt(3);

        if (computer1 == 0) {
        	System.out.print("컴퓨터: 가위, ");
        } else if (computer1 == 1) {
        	System.out.print("컴퓨터: 바위, ");
        } else {
        	System.out.print("컴퓨터: 보, ");
        }
        if (computer2 == 0) {
        	System.out.println("가위");
        } else if (computer2 == 1) {
        	System.out.println("바위");
        } else {
        	System.out.println("보");
        }
        
        System.out.println("왼손이나 오른손 중 하나를 선택하세요.");
        
        String player = null;
        String choice = scn.next();
        
        if (choice.equals("왼손")) {
        	player = player1;
        	System.out.println("플레이어:" + player);
        } else if (choice.equals("오른손")) {
        	player = player2;
        	System.out.println("플레이어:" + player);
        } else {
        	System.out.println("잘못된 입력입니다. ");
        }
        
        int computer = rdm.nextInt(2);
        if (computer == 0) {
        	computer = computer1;
        } else {
        	computer = computer2;
        }
        if (computer == 0) {
        	System.out.println("컴퓨터: 가위");
        } else if (computer == 1) {
        	System.out.println("컴퓨터: 바위");
        } else {
        	System.out.println("컴퓨터: 보");
        }
        
        
        if (player.equals("가위")) {
            if (computer == 0) {
                System.out.println("비겼습니다!");
            } else if (computer == 1) {
                System.out.println("당신이 졌습니다!");
            } else {
                System.out.println("당신이 이겼습니다!");
            }
        } else if (player.equals("바위")) {
            if (computer == 0) {
                System.out.println("당신이 이겼습니다!");
            } else if (computer == 1) {
                System.out.println("비겼습니다!");
            } else {
                System.out.println("당신이 졌습니다!");
            }
        } else if (player.equals("보")) {
            if (computer == 0) {
                System.out.println("당신이 졌습니다!");
            } else if (computer == 1) {
                System.out.println("당신이 이겼습니다!");
            } else {
                System.out.println("비겼습니다!");
            }
        } else { }
        
        scn.close();
        

        
        
	}

}
