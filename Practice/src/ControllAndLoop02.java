import java.util.Scanner;
import java.lang.Math;

public class ControllAndLoop02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = {"가위" ,"바위", "보"}; 
		String userChoice;
		
		int tryGame, win, draw, lose, comChoice;
		tryGame = 0; win = 0; draw = 0; lose = 0;
		
		System.out.print("당신의 이름을 입력하세요 : ");
		String name = sc.next();
		
		while(true) {
		 	tryGame++;
			System.out.println();

			System.out.print("가위바위보 : ");
			userChoice = sc.next();
			
			comChoice = (int)Math.random()*3;
			
			if(userChoice.equals("exit")) {
				tryGame--;
				break;
			}
			
			System.out.println("컴퓨터 : " + arr[comChoice]);
			System.out.println(name + " : " + userChoice);
			
			if(userChoice.equals(arr[comChoice])) {
				System.out.println("비겼습니다.");
				draw++;
			} else if(userChoice.equals("가위")&& comChoice == 2 
					|| userChoice.equals("바위")&& comChoice == 0 
					|| userChoice.equals("보")&& comChoice == 1){
				System.out.println("이겼습니다!");
				win++;
			} else if(userChoice.equals("가위")&& comChoice == 1 
					|| userChoice.equals("바위")&& comChoice == 2 
					|| userChoice.equals("보")&& comChoice == 0) {
				System.out.println("졌습니다.");
				lose++;
			} else {
				System.out.println("잘못 입력하셨습니다.");
				tryGame--;
			}
			
		}
		
		System.out.printf("%d전 %d승 %d무 %d패",tryGame, win, draw, lose);
		
	}

}
