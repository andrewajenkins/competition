public class TCO14x1x1x200xEllysPairs {
	public int getDifference(int[] a){
		int[] pairs = new int[a.length/2];
		int highest = 0, lowest = 0;
		for(int j=0; j<(a.length/2); j++){
			for(int i=0; i<a.length-1; i++){
				if(lowest == 0 && a[i] != -1) lowest = i;
				if(a[i]>a[highest]) highest = i;
				if(a[i]<a[lowest] && a[i] != -1) lowest = i;
			}
			pairs[j] = a[highest]+a[lowest];
			a[highest] = a[lowest] = -1;
			highest = lowest = 0;
		}
		for(int i=0; i<pairs.length; i++){
			if(pairs[i]>highest) highest = i;
			if(pairs[i]<lowest && a[i]>-1) lowest = i;
		}
		return highest-lowest;
	}
}

/**
Problem Statement
    
In one of her subjects at the university, Elly and her classmates have to prepare projects. The professor wants the students to work in pairs (groups of two). Each student must belong to exactly one pair and each pair should produce one project. You may assume that the number of people in the class is even.  You are given a int[] knowledge. Each element of knowledge is the amount of knowledge of one of the students. The quality of a project is the total knowledge of the students that work on it. That is, if students i and j form one of the pairs, the quality of their project will be knowledge[i] + knowledge[j].  This creates some problems. If there is a really strong group, their project will be of really high quality. The professor will then compare the other projects to it and will be disappointed by them, giving low grades to the other pairs. Thus, the students want to form the groups in such way that the difference between the quality of the best project and the quality of the worst project is as small as possible.  Return that minimal difference in the quality between the best and the worst project if the students split into pairs in the best possible way.
Definition
    
Class:
EllysPairs
Method:
getDifference
Parameters:
int[]
Returns:
int
Method signature:
int getDifference(int[] knowledge)
(be sure your method is public)
Limits
    
Time limit (s):
2.000
Memory limit (MB):
64
Constraints
-
knowledge will contain between 2 and 50 elements, inclusive.
-
The number of elements of knowledge will be even.
-
Each element of knowledge will be between 1 and 1000, inclusive.
Examples
0)

    
{2, 6, 4, 3}
Returns: 1
Here obviously grouping the two best people in the class (with knowledge 6 and 4) doesn't make sense. If 6 pairs with 3 and 4 pairs with 2 they will get qualities of 9 and 6, respectively, leading to difference 3. However, there is an even better grouping: 2 with 6 and 4 with 3 for qualities of 8 and 7, respectively. The difference then would be only 1.
1)

    
{1, 1, 1, 1, 1, 1}
Returns: 0
Some or even all students can have the same knowledge.
2)

    
{4, 2, 4, 2, 1, 3, 3, 7}
Returns: 2

3)

    
{5, 1, 8, 8, 13, 7, 6, 2, 1, 9, 5, 11, 3, 4}
Returns: 3

This problem statement is the exclusive and proprietary property of TopCoder, Inc. Any unauthorized use or reproduction of this information without the prior written consent of TopCoder, Inc. is strictly prohibited. (c)2003, TopCoder, Inc. All rights reserved.
*/