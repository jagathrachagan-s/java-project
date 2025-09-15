package Arreys;

import java.io.File;
import java.io.FileReader;

public class FileNotFoundException {

	public static void main(String[] args) {
		  try {
			  File fle=new File("C:/Program Files/Git");
			  FileReader fr=new FileReader(fle);
			  System.out.println("file exist");
		  }
catch(Exception r) {
	System.out.println("file does not exist");
}
	}

}
