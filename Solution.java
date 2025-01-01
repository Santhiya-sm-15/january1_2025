class Solution {
    public int maxScore(String s) {
        int i,j,n=s.length();
        int one=0,zero=0;
        for(i=0;i<n;i++)
        {
            if(s.charAt(i)=='1')
                one++;
            else
                zero++;
        }
        int max=0;
        i=1;
        for(i=1;i<n;i++)
        {
            String l=s.substring(0,i);
            int o=0,z=0;
            for(j=0;j<l.length();j++)
            {
                if(l.charAt(j)=='1')
                    o++;
                else
                    z++;
            }
            max=Math.max(max,z+(one-o));
        }
        return max;
    }
}