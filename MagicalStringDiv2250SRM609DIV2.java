import java.util.*;

public class MagicalStringDiv2{
	public int minimalMoves(String ms){
		int moves = 0;
		for(int i=0; i<(ms.length()/2); i++)
			if(ms.charAt(i) != '>') moves++;
		for(int i=(ms.length()/2); i<ms.length(); i++)
			if(ms.charAt(i) != '<') moves++;
		return moves;
	}
}


Problem Statement
    
Magical Girl Illy uses "magical strings" to cast spells. For her, a string X is magical if and only if there exists a positive integer k such that X is composed of k consecutive '>' characters followed by k consecutive '<' characters. Once Illy picked up a String S. The length of S was even, and each character of S was either '<' or '>'. Illy wants to change S into a magical string. In each step, she can change a single '>' to a '<' or vice versa. Compute and return the smallest number of steps in which she can change S into a magical string.
Definition
    
Class:
MagicalStringDiv2
Method:
minimalMoves
Parameters:
String
Returns:
int
Method signature:
int minimalMoves(String S)
(be sure your method is public)
Limits
    
Time limit (s):
2.000
Memory limit (MB):
256
Constraints
-
S will contain between 2 and 50 characters, inclusive.
-
S will contain even number of characters.
-
Each character of S will be '<' or '>'.
Examples
0)

    
">><<><"
Returns: 2
She needs to change character 2 (0-based index) from '<' to '>', and character 4 from '>' to '<'.
1)

    
">>>><<<<"
Returns: 0
S is already a magical string, so no changes are needed.
2)

    
"<<>>"
Returns: 4

3)

    
"<><<<>>>>><<>>>>><>><<<>><><><><<><<<<<><<>>><><><"
Returns: 20

This problem statement is the exclusive and proprietary property of TopCoder, Inc. Any unauthorized use or reproduction of this information without the prior written consent of TopCoder, Inc. is strictly prohibited. (c)2003, TopCoder, Inc. All rights reserved.