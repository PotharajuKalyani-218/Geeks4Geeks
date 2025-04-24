#User function Template for python3
        # code here 
class Solution:
    def getSingle(self, nums):
        # These will store the count of bits for the ones and twos
        ones, twos = 0, 0
        
        for num in nums:
            # Update twos to include the bits from ones and the current number
            twos |= ones & num
            # Update ones to include the current number
            ones ^= num
            # Mask the bits that appear 3 times
            mask = ~(ones & twos)
            ones &= mask
            twos &= mask
        
        return ones


#{ 
 # Driver Code Starts
# Initial Template for Python 3

if __name__ == "__main__":
    t = int(input())
    for _ in range(t):
        arr = list(map(int, input().split()))
        ob = Solution()
        ans = ob.getSingle(arr)
        print(ans)
        print("~")
# } Driver Code Ends