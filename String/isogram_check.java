package String;
public class isogram_check {
    static boolean isIsogram(String data){
        boolean alpha[] = new boolean[256];
        for(int i = 0; i<data.length(); i++) {
            if(alpha[data.charAt(i)] == true)
                return false;
            alpha[data.charAt(i)] = true;
        }
        return true;
    }
}
