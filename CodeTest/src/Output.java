import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Output {
	public void output() {
		try(FileWriter fw = new FileWriter("test.txt", true)) { //Try-with-resource
			fw.write(97);
			fw.write(65);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
}
