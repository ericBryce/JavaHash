import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class WriteStringFile {
	private Random random;
	private char charOut;

	public void writeFile(int newFileNumber) {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("randText" + newFileNumber + ".txt", true));
			for (int i = 0; i < 1000000; i++) {
				random = new Random();
				for (int j = 0; j < 20; j++) {
					int letter = random.nextInt(26) + 97;
					bw.write((char) (letter));
				}
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
}

