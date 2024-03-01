package test06;

public class Calculator {

	public double getSum(int data) throws InvalidException {
		double sum = 0;
		
//		if(data > 5 || data < 2) { // 
//			throw new InvalidException("입력 값에 오류가 있습니다."); // message 전달
//		}
//		for(int i = 1; i <= data; i++) {
//			sum += i;
//		}

		
		if(data >= 2 && data <= 5) {
			for(int i = 1; i <= data; i++) {
				sum += i;
			}
		} else
			throw new InvalidException("입력 값에 오류가 있습니다.");
		
		return sum;

	}
}