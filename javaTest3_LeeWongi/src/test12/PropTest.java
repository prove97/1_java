package test12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

public class PropTest {

	public static void main(String[] args) {
		Properties prop = new Properties();
		//명시한 사용 데이터를 prop 에 기록한다.
		 prop.setProperty("1", "apple,1200,3");
		 prop.setProperty("2", "banana,2500,2");
		 prop.setProperty("3", "grape,4500,5");
		 prop.setProperty("4", "orange,800,10");
		 prop.setProperty("5", "melon,5000,2");

//		Enumeration enumeration = new Enumeration();

		 // fileSave() 메소드를 호출한다.
		fileSave(prop);

		 
		// fileOpen() 메소드를 호출한다.
		fileOpen(prop);
	}
	
	public static void fileSave(Properties p) {
		try {
			p.storeToXML(new FileOutputStream("data.xml"), "Fruit");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void fileOpen(Properties p) {
		
		try {
			p.loadFromXML(new FileInputStream("data.xml"));
			Enumeration enumeration = p.propertyNames();
			Fruit[] fruitArr = new Fruit[p.size()];
			for(Fruit f : fruitArr) {
				String key = (String) enumeration.nextElement();
				String value = p.getProperty(key);
				String[] values = value.split(",");
				f = new Fruit(values[0],Integer.parseInt(values[1]),Integer.parseInt(values[2]));
				System.out.println(key + " = " + f.toString());
			} 
			
			
//			while(enumeration.hasMoreElements()) { // 아직 남은게 있는지 확인
//				String element = (String) enumeration.nextElement();
//				System.out.println(element + " = " + p.getProperty(element));
//			}
			
		} catch (InvalidPropertiesFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
