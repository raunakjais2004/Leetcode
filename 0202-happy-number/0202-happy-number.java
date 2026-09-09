class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int a;
        int sum=0;
        while(n!=1){
            if(set.contains(n)){
                return false;
            }
            set.add(n);
            sum=0;

            while(n>0){
                a=n%10;
                n=n/10;
                sum+=a*a;
            }
            n=sum;
        }
        return true;
    }
}