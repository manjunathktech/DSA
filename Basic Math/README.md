public class Solution {
    public static int countDigits(int n){
     int cnt = 0;
     while(n > 0){
         cnt = cnt + 1;
         n = n / 10;
     }
     return cnt;
    }
}

if we find through the logarithmic 
int cnt = (int)(log10(n) + 1);
     return cnt;
