public class Distance {
    public static void main(String[] args){
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);
        double dis=Math.sqrt(x*x+y*y);
        System.out.println(dis);
    }
}