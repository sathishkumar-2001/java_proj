import java.io.FileWriter;

public class Writetofile {
	public static void main (String[] args) {
		FileWriter wri = new FileWriter("file.txt");
		wri.write("hello writing");
		wri.close();

		System.out.println("written sucessfully");
	}
}

