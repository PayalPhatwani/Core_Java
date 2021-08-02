// import java.util.Comparator;
// import java.util.HashMap;
// import java.util.Map;
// import java.util.PriorityQueue;

// class Pair{
//     char data;
//     int value;
//     Pair(char data,int value){
//         this.data=data;
//         this.value=value;
//     }
// }

// class PairComparator implements Comparator<Pair>{
//         public int compare(Pair p1,Pair p2){
//             if(p1.value<p2.value){
//                 return 1;
//             }else if(p1.value==p2.value){
//                 return 0;
//             }
            
//             return -1;
//         }
// }
// public class aa
// {
// 	public static String rearrangeCharacters(String str) {
	
// 		//code here
//         System.out.println("ss");
// 		StringBuilder sb = new StringBuilder();
		
// 		HashMap<Character,Integer> map = new HashMap<>();
// 		for(int i=0;i<str.length();i++){
// 		    map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
// 		}
// 	PriorityQueue<Pair> pQ = new PriorityQueue<>(new PairComparator());
//     for(Map.Entry entry : map.entrySet()){
//         pQ.add(new Pair((char)entry.getKey(),(int)entry.getValue()));
//     }
// 	PriorityQueue<Pair> temp= new PriorityQueue<>(new PairComparator());;
// 	while(true){
	    
// 	    while(!pQ.isEmpty()){
// 	        Pair pop = pQ.poll();
// 	        char c = pop.data;
//             System.out.println(c);
// 	        int value = pop.value;
// 	        sb.append(String.valueOf(c));
// 	        if(value-1>1){
// 	            temp.add(new Pair(c,value-1));
// 	        }
// 	    }
// 	    System.out.println(sb);
// 	    if(temp.size()==1){
// 	        Pair left = temp.poll();
// 	        if(left.value==1){
// 	            sb.append(left);
// 	            return sb.toString();
// 	        }else{
// 	            return "-1";
// 	        }
// 	    }
	   
// 	   while(!temp.isEmpty()){
// 	       pQ.add(temp.poll());
// 	   }
	 
// 	}
		
// 	}

//     public static void main(String[] args) {
//        String s =  rearrangeCharacters("geeks");
//        System.out.println(s);
//     }
// }

