
public class AltHashCode4 {
    public int myHashCode(String string) {
        int h = 0;
            for (int i = 0; i < string.length(); i++) {
               h = h * 9973 + string.charAt(i);
           }
        return h;
    }
}
