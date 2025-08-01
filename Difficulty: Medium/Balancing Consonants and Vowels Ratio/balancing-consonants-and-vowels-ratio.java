
class Solution {
    public int countBalanced(String[] arr) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        Map<Integer, Integer> balanceCount = new HashMap<>();
        balanceCount.put(0, 1);  // To count prefixes that are already balanced

        int balance = 0;
        int result = 0;

        for (String str : arr) {
            for (char ch : str.toCharArray()) {
                if (vowels.contains(ch)) {
                    balance += 1;
                } else {
                    balance -= 1;
                }
            }
            result += balanceCount.getOrDefault(balance, 0);
            balanceCount.put(balance, balanceCount.getOrDefault(balance, 0) + 1);
        }

        return result;
    }
}

        
    
