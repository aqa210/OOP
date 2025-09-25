public class FivePerLine{
    public static void main(String[] args){
        int c=0;
        for(int i=1000;i<=2000;i++){
            if(c==5){
                c=0;
                System.out.print("\n");
            }
                System.out.print(i+" ");
                c++;
        }
    }
}
