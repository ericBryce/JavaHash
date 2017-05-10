import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;


public class main {

	public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
		RunTime timer = new RunTime();
		OrigHashCode oCode = new OrigHashCode();
		AltHashCode1 hash1 = new AltHashCode1();
		AltHashCode2 hash2 = new AltHashCode2();
		AltHashCode3 hash3 = new AltHashCode3();
		AltHashCode4 hash4 = new AltHashCode4();
		AltHashCode5 hash5 = new AltHashCode5();
		ReadFile getFile = new ReadFile();
		WriteStringFile newFiles = new WriteStringFile();
		
		
//		String test = "BoB the Builder";
//		System.out.println(hash5.myHashCode(test));
		
		//TEST COLLISIONS : CHANGE HASH FUNCTION IN TESTCOLLISION CLASS
//		for(int i =1; i < 101; i++) {
//		TestCollisions cTest = new TestCollisions();
//		getFile.readFile(i);
//		String[] arr = new String[1000000];
//		arr = getFile.getStringArr();
//		System.out.println(cTest.getCollisions(arr));
//		}
		

		// Time hash codes
      for(int j = 1; j < 101; j++) {
  		String[] arr = new String[1000000];
		getFile.readFile(j);
		arr = getFile.getStringArr();
		
		timer.startTimer();
		for(int i = 0; i < arr.length; i++) {
			oCode.myHashCode(arr[i]);
		}
		timer.endTimer();
		System.out.println(timer.getTotalTime());
		}
		

	}
	}