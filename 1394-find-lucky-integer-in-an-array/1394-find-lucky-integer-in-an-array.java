class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> hashmap = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int element = arr[i];

            if(hashmap.containsKey(element)==true){
                hashmap.put(element,hashmap.get(element)+1);
            }else{
                hashmap.put(element,1);
            }
        }

        int ans = -1 ;
        for(int key : hashmap.keySet()){
            if(hashmap.get(key)==key){
                ans = Math.max(ans,key);
            }
        }

        return ans;
    }
}