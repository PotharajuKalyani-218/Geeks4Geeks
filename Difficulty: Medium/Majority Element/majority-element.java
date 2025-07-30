class Solution {
    int majorityElement(int arr[]) {
        int c=0;
        int element=0;
        for(int a:arr){
            if(c==0){
                element=a;
                c++;
            }
            else
            {
                if(a==element)
                c++;
                else
                c--;
            }
        }
        c=0;
        for(int a:arr){
            if(a==element)
            c++;
            if(c>arr.length/2)
            return element;
        }
        return -1;

    }
}