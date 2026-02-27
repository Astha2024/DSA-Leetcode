class Solution {
    public void nextPermutation(int[] nums) {
        int ind=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                ind=i;
                break;
            }
        }
        if(ind==-1)
        {reverse(nums,0,n-1);
        return;}
       
            for(int i=ind;i<n;i++)
            {
                if(nums[i]>nums[ind])
               { swap(nums,i,ind);
                break;}
            }
            reverse(nums,ind+1,n-1);
    }
    
    public void reverse(int[] arr, int start, int end)
    {
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
        public void swap(int[] arr, int start, int end)
        {
           
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
            
        }
    }