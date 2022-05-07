package controlflow;

public class Eligibility {
	public boolean isEligible(Student stu) {

		if (stu.getTenthPercentage() >= 60) {
			if (stu.getTwelthPercentage() >= 60) {
				if (stu.getBePercentage() >= 60) {
					if (stu.getBacklogs() == 0) {
						return true;
					} else {
						return false;
					}
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}

	}
	int add(Values value) {
		return value.a+value.b;
	}
}