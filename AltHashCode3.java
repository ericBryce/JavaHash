import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class AltHashCode3 {
	private String md5 = "MD5";
	private String sha = "SHA";
	private byte[] byteData = new byte[20];
	
    public void myHashCode(String string) throws NoSuchAlgorithmException {
    	md5 = "MD5";
    	MessageDigest md = java.security.MessageDigest.getInstance(md5);

        md.update(string.getBytes());
        byteData = md.digest();
}
    
    public String getCode() {
        StringBuffer sb = new StringBuffer();
        int h = 0;
        for (int i = 0; i < byteData.length; i++) {
         sb.append(Integer.toString((byteData[i]), 10).substring(1));
        }

        return sb.toString();
}
}
    