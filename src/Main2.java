public class Main2 {
    public static void main(String[] args) {
        int [][]a=new int [2][2];
        int num=Find(a,2,2);
        System.out.println(num);
    }

    private static int Find(int[][] a, int i, int j) {
        int num=0;
        if(i==0&&j==0){
            return num+1;
        }
        if(i<0||j<0){
            return num;
        }
        Find(a,i-1,j);
        Find(a,i,j-1);
        return num;
    }
}
