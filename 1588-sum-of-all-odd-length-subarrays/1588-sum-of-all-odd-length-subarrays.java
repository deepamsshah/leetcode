class Solution {
    public int sumOddLengthSubarrays(int[] a)
    {
        int s=0,i=0,n=a.length;
        if(n%2==1)
        {
            int f=(n+1)/2,d=(n+1)/2;
            while(i<n/2)
            {
                s=s+f*(a[i]+a[n-i-1]);
                i++;
                if(i%2==1)
                {
                    d=d-2;
                }
                f=f+d;
            }
            s=s+f*a[n/2];
        }
        else
        {
            int f=n/2;
            while(i<n/2)
            {
                s=s+f*(a[i]+a[n-i-1]);
                i++;
                f=f+n/2-i;
            }
        }
        return s;
    }
}