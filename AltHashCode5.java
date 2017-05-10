
public class AltHashCode5 {
    public int myHashCode(String string) {
        int h = 0;
            for (int i = 0; i < string.length(); i++) {
               h = (h << 5) + (h >> 2) + string.charAt(i);
           }
        return h;
    }
}
