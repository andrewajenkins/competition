#include <string>
#include <iostream>

using namespace std;

class AlternatingString {
	int cnt;
	int max;
	int ptr;
	int cur;
	public:
	int maxLength(string x) {
		ptr = 0;
		cur = x.at(0);
		while(ptr < x.size()) {
			if(cur == x.at(ptr)) {
				cnt++;
				ptr++;
				if(cur == '1') {
					cur = '0';
				} else {
					cur = '1';
				}
				if(max < cnt) {
					max = cnt;
				}
			} else {
				if(max < cnt) {
					max = cnt;
				}
				cur = x.at(ptr);
				cnt = 0;
			}
		}
		return max;
	}
};

/*
Problem Statement
    
A string of zeros and ones is called an alternating string if no two adjacent characters are the same. Examples of alternating strings: "1", "10101", "0101010101".  You are given a string s. Each character of s is a '0' or a '1'. Please find the longest contiguous substring of s that is an alternating string. Return the length of that substring.
Definition
    
Class:
AlternatingString
Method:
maxLength
Parameters:
string
Returns:
int
Method signature:
int maxLength(string s)
(be sure your method is public)
Limits
    
Time limit (s):
2.000
Memory limit (MB):
256
Stack limit (MB):
256
Constraints
-
s will contain between 1 and 50 characters, inclusive.
-
Each character in s will be '0' or '1'.
Examples
0)

    
"111101111"
Returns: 3
Among all substrings, there are 5 different alternating strings: "1", "0", "10", "01", "101". The one with maximal length is "101" and the length is 3.
1)

    
"1010101"
Returns: 7
The string s itself is an alternating string.
2)

    
"000011110000"
Returns: 2
Note that a substring must be contiguous. The longest alternating substrings of this s are "01" and "10". The string "010" is not a substring of this s.
3)

    
"1011011110101010010101"
Returns: 8

4)

    
"0"
Returns: 1

This problem statement is the exclusive and proprietary property of TopCoder, Inc. Any unauthorized use or reproduction of this information without the prior written consent of TopCoder, Inc. is strictly prohibited. (c)2003, TopCoder, Inc. All rights reserved.
*/
