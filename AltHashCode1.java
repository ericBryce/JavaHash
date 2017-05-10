
public class AltHashCode1 {
    public int myHashCode(String string) {
        int h = 0;
            for (int i = 0; i < string.length(); i++) {
               h = 30 * h + string.charAt(i);
           }
        return h;
    }
}
