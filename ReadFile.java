import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;

public class ReadFile {
	private static final String FILENAME = "C:\\Users\\eric\\Desktop\\SCHOOL\\Java\\Hash_Map\\randText";
	InputStream is = null;
	InputStreamReader isr = null;
	BufferedReader br = null;
	String[] stringArr;
	int currentFileNumber = 0;
	OrigHashCode h0 = new OrigHashCode();
	
	void readFile(int fileNumber) throws IOException {
		currentFileNumber = fileNumber;
		try {
			is = new FileInputStream(FILENAME + fileNumber + ".txt");
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			stringArr = new String[1000000];
			for (int i = 0; i < 1000000; i++) {
				stringArr[i] = br.readLine();
			}
			br.close();
		} finally {
		}
	}
	
	private Random random;
	private char charOut;

	public void writeHashFile() throws IOException {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("randTextHashes" + currentFileNumber + ".txt", true));
			for (int i = 0; i < 1000000; i++) {
				bw.write(stringArr[i] + ",");
				bw.write(String.valueOf(h0.myHashCode(stringArr[i])) + ", ");
				//other hash codes GO HERE

				bw.newLine();
				bw.flush();
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if (bw != null)
				try {
					bw.close();
				} catch (IOException ioe2) {
				}
		}
	}
	
	public String[] getStringArr() {
		return stringArr;
	}
	
}
