import java.util.HashSet;

public class StringCode{
    String blowup(String str){
        String ans = "";
        int c=0;
        for(int i=0;i<str.length();i++){
            while(c>0){
                ans+=str.charAt(i);
                c--;
            }
            if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
                c=str.charAt(i)-'0';
                continue;
            }
            ans+=str.charAt(i);
        }
        return ans;
    }
    int maxRun(String str){
        int c=1;
        int ans=1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==(str.charAt(i-1))){
                c++;
                ans=Math.max(c,ans);
            }
            else{
                ans=Math.max(c,ans);
                c=1;
            }
        }
        return ans;
    }
    boolean stringIntersect(String a, String b, int len){
        HashSet <String> hset = new HashSet<>();
        for(int i=0;i<a.length()-len;i++){
            hset.add(a.substring(i,i+len));
        }
        for(int i=0;i<b.length()-len;i++){
            if(hset.contains(b.substring(i,i+len))){
                return true;
            }
        }
        return false;
    }


}