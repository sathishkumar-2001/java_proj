import java.io.FileWriter;
import java.io.IOException;

public class Writetofile {
	public static void main (String[] args) {
		try {
			FileWriter wri = new FileWriter("file.txt");
			wri.write("hello ever");
			wri.close();
			System.out.println("written sucessfully");
		} catch (IOException e) {
			System.out.println("an error occured");
		}
	}
}

