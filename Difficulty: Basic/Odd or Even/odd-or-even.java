class Solution {
            public static boolean isEven(int n)
    {
        // taking bitwise and of n with 1 
        if ((n & 1) == 0)
            return true;
        else
            return false;
    }

    }
