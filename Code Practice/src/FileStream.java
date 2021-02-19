import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.stream.Collectors;

public class FileStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(System.getProperty("user.dir"));
		File file = new File("abc.txt");
		InputStream is = new FileInputStream(file);
		//Scanner s = new Scanner(is);
		//String str = "";
		//while(s.hasNext()) {
			//str += s.nextLine() + "\n";
		//}
		String result = new BufferedReader(new InputStreamReader(is)).lines().collect(Collectors.joining("\n"));
		System.out.println(result);
		is.close();
	}
}
