package exceptionhandling;

public class Elegebility {

	public boolean isElegeble(Student stu) throws CustomException {
        
		if (stu.getTenthPercentage() >= 60) {
			if (stu.getTwelthPercentage() >= 60) {
				if (stu.getBtechpercentage() >= 60) {
					return true;

				}
				
				throw new CustomException(stu.getName()+" is not eligible because his  10th persentage is less then 60 ");

			}
			
			throw new CustomException(stu.getName()+" is not eligible because his  12th persentage is less then 60 ");
		}
		throw new CustomException(stu.getName()+" is not eligible because his B.tech persentage is less then 60 ");
	}

}
