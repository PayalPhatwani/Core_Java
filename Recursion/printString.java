public class printString {
    

    static void print(String s,int begin,int end){
        if(end>s.length() )return;
        System.out.println(s.substring(begin,end));
        
        print(s.substring(1), begin,end);
    }
    public static void main(String[] args) {
        String s = "payal";
        for(int i=1;i<=s.length();i++){
            print(s,0,i);
        }


        
    }
}
