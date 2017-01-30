using namespace std;

class SellingFruits {
	public:
	int maxDays(int x, int f, int d, int p) {
		int days = 0;
		for(;;) {
			if(f == 0) {
				d -= p;
			} else {
				f--;
			}
			d -= x;
			if(d < 0) {
				break;
			}
			days++;
		}
		return days;
	}
};
