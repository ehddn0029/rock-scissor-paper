import java.util.Scanner;
import java.util.Random;

public class wdw20230834_mid1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        Random rdm = new Random();

        System.out.println("가위, 바위, 보 중 하나를 입력하세요:");

        String player = scn.next();
        if (player.equals("가위")) {
        	System.out.println("플레이어: 가위");
        } else if (player.equals("바위")) {
        	System.out.println("플레이어: 바위");
        } else if (player.equals("보")) {
        	System.out.println("플레이어: 보");
        } else {
        	System.out.println("잘못된 입력입니다.");
        }
        
        
        int computer = rdm.nextInt(3); 

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