//Name: Ogunsanya Toluwani Damilola
//Student-No: 8677256
//Section: ITI1121-C
//ASSIGNMENT 1 Q2

//Name: Olubode Toluwanimi
//Student-No: 8696226
//Section: ITI1121-A
//ASSIGNMENT 1 Q2

public class A1Q2 {

	/**
     * Returns true if elems contains at least two consecutive
     * identical number, false otherwise
     *
     *   @param elems the list of integers, assumed to be non null
     *  @return true if elems contains at least two consecutive
     * identical number, false otherwise
     */

    private static boolean hasTwoLengthRun(int[] elems) {

			for (int i=1; i< elems.length; i++ ) {
				if (elems[i]==elems[i-1]) {
					return true;

				}
			}
			return false;
    }

 	public static void main(String[] args) {
    StudentInfo studentInfo = new StudentInfo();
    studentInfo.display();
		int[] result= new int [args.length];
		for (int i = 0; i < args.length; i++) {
			result[i] = Integer.parseInt(args[i]);
		}
		System.out.println(hasTwoLengthRun(result));

    }
}
