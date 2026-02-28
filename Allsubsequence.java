public class Allsubsequence {
    public static void subsequence(int ind,int[] arr, List<Integer> ds)
    {
       int n=arr.length;
       if(ind>=n)
       {
        System.out.println(ds);
        return;
       }
       ds.add(arr[ind]);
       subsequence(ind+1,arr,ds);
       ds.remove(arr[ind]);
       subsequence(ind+1,arr,ds);

    }
    
}
