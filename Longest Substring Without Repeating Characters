#include <string>
#include <vector>
#include <algorithm>

class Solution {
public:
    int lengthOfLongestSubstring(std::string s) {
     std::vector<int> lastSeen(128, -1);
        
        int maxLength = 0;
        int left = 0; 
        
        for (int right = 0; right < s.length(); ++right) {
            char currentChar = s[right];
          
            if (lastSeen[currentChar] >= left) {
               
                left = lastSeen[currentChar] + 1;
            }
            
           
            lastSeen[currentChar] = right;
            
           
            maxLength = std::max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
};
