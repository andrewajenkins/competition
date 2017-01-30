#include <iostream>

using namespace std;

class ThreeIncreasing {
	public:
	int minEaten(int a, int b, int c) {
		if (a == 0||b == 0||c == 0) return -1;
		if (a < b && b < c) return 0;
		int eat = 0;
		eat += b-(c-1);
		eat += a-(b-1);
		return eat;
	}
};
