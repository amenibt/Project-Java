package part5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsKeyword {

	
	// FileNotFoundException changed by IOException becz IOException is supper class
	public static void main(String[] args) throws InterruptedException, IOException {
		
		FileReader fr=null;
		fr= new FileReader("path to file//Test.txt");
		
		BufferedReader bfr=new BufferedReader(fr);
		System.out.println(bfr.readLine());
		
		Thread.sleep(2000);

	}

}
