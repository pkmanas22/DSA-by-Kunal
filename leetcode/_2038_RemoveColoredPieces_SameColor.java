//2038. Remove Colored Pieces if Both Neighbors are the Same Color

public class _2038_RemoveColoredPieces_SameColor {
    public static void main(String[] args) {
        String colors = "AAABABB";
        System.out.println(winnerOfGame(colors));
    }

    static boolean winnerOfGame(String colors) {
        char[] color = colors.toCharArray();

        int Awin = 0;
        int Bwin = 0;
        for(int i = 0; i < color.length-2; i++){
            if(color[i] == color [i+1] && color[i+1] == color[i+2]){
                if(color[i] == 'A'){
                    Awin++;
                }else{
                    Bwin++;
                }
            }
        }

        return Awin > Bwin;
    }
}
