package inputOutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	
	public boolean checkName(String file) {
		File f = new File(file);
		
		if(f.exists()) {
			return true;
		}
		return false;
	}
	
	public void fileSave(String file, String s) {
		try (FileWriter fw = new FileWriter(file)){
			fw.write(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public StringBuilder fileOpen(String file) {
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(file))){
			String value = "";
			while((value = br.readLine()) != null) {
				sb.append(value+"\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb;
	}
	
	public void fileEdit(String file, String s) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))){
			bw.write(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
