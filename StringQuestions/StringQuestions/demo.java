package StringQuestions;

public class demo {
    public int compareVersion(String version1, String version2) {
        int result = 0;
        System.out.println(version1.contains("."));
        if(version1.contains(".") || version2.contains(".")){
            String[] v1Arr = null;
            String[] v2Arr = null;
            if(version1.contains("."))
         v1Arr = version1.split(".");
           
         for (String string : v1Arr) {
             System.out.println(string);
         }
            if(version2.contains("."))
       v2Arr = version2.split(".");
            
            for(String s : v1Arr){
                System.out.println("."+s);
            }
            
            int loop = 0;
            if(v1Arr.length>=v2Arr.length){
                loop = v1Arr.length;
            }else{
               loop = v2Arr.length; 
            }
            
            System.out.println(loop);
            for(int i=0;i<loop;i++){
                if(i>v1Arr.length-1){
                   v1Arr[i]="0"; 
                }
                if(i>v2Arr.length-1){
                   v2Arr[i]="0"; 
                }
                
                int v1 = Integer.parseInt(v1Arr[i]);
                int v2 = Integer.parseInt(v2Arr[i]);
                
                if(v1>v2){
                    result = 1;
                }
                if(v2>v1){
                    result = -1;
                } 
            }

            }else{
            int v1 = Integer.parseInt(version1);
                int v2 = Integer.parseInt(version2);
            if(v1>v2){
                    result = 1;
                }
                if(v2>v1){
                    result =  -1;
                }
            
        }
    return result;
    }

    public static void main(String[] args) {
        
    }
}
