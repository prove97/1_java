import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FoodController {

	public void fileSave(String fileName) {
		Food food = new Food("사과" , 20);
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){ //소괄호 안에 넣어 주면 close()를 호출 안해줘도 됨
			oos.writeObject(food);
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
	
	public void fileRead(String fileName) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
			while(true) {
				System.out.println(ois.readObject());
			}
		} catch (EOFException e) {
			System.out.println("파일을 다 읽어들였습니다.");

		} catch (IOException e) {
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
