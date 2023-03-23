class Solution
{
    public int firstElementKTime(int[] a, int n, int k) { 
        int ct=0;
        int arr[]=new int [202];
        for(int i=0; i<202; i++){
            arr[i]=0;
        }
        
        for(int i=0; i<n; i++){
            arr[a[i]]++;
            if(arr[a[i]]==k){
                return a[i];
            }
        }
        return -1;
  }
} 