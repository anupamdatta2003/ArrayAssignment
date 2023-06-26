public class Q_2 {
    public static void main(String[] args) {
        String[] srr = new String[7];
        srr[0] = "ab";
        srr[1] = "bc";
        srr[2] = "cd";
        srr[3] = "de";
        srr[4] = "ef";
        srr[5] = "fg";
        srr[6] = "gh";
        for (int i=0; i<srr.length;i++){
            System.out.print(srr[i] + " ");
        }
        System.out.println();
        for (int i=0; i<srr.length;i++){
            if(i % 2 != 0){
                System.out.println(srr[i]);
            }
        }

    }
}
