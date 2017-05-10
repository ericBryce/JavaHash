import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Set;

public class TestCollisions {
	private int[] intArr = new int[1000000];
	private String[] stringArr = new String[1000000];
	private int matchCount = 0;
	OrigHashCode h0 = new OrigHashCode();
	AltHashCode1 h1 = new AltHashCode1();
	AltHashCode2 h2 = new AltHashCode2();
	AltHashCode3 h3 = new AltHashCode3();
	AltHashCode4 h4 = new AltHashCode4();
	AltHashCode5 h5 = new AltHashCode5();
	Set<Integer> testSetInt = new HashSet<Integer>();
	Set<String> testSetString = new HashSet<String>();

	public int getCollisions(String[] arr) throws NoSuchAlgorithmException {
		matchCount = 0;
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = h5.myHashCode(arr[i]);
		}
		
		for (int i = 0; i < intArr.length; i++) {
			if (testSetInt.contains(intArr[i])) {
				matchCount++;
			}
			testSetInt.add(intArr[i]);
		}
		return matchCount;
	}
	
	public int getCollisionsString(String[] arr) throws NoSuchAlgorithmException {
		matchCount = 0;
		for (int i = 0; i < stringArr.length; i++) {
			//stringArr[i] = h3.myHashCode(arr[i]);
			if (testSetString.contains(stringArr[i])) {
				matchCount++;
			}
			testSetString.add(stringArr[i]);
		}
		return matchCount;
	}
}
