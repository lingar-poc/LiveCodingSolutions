package draft;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Rule;
import org.junit.jupiter.api.Test;

class Try1Test {

	@Test
	void test() {
//		("Not yet implemented");
	}

	@Test

	void case1() {
		Try1.rows = new String[4];
		Try1.rows[0] = "-r---w---x";
		Try1.rows[1] = "-rwxr-xr-x";
		Try1.rows[2] = "-r--rw-rwx";
		Try1.rows[3] = "-rwx------";

		String[] expectedResult = {

				"421", "755", "467", "700" };

		Try1.testMe();

		assertArrayEquals(expectedResult, Try1.result);

	}

	@Test

	void case2() {
		Try1.rows = new String[4];
		Try1.rows[0] = "-rwxrwxrwx";
		Try1.rows[1] = "-rwx------";
		Try1.rows[2] = "-rw--w--wx";
		Try1.rows[3] = "-rw-r-xr-x";

		String[] expectedResult = {

				"777", "700", "623", "655" };

		Try1.testMe();

		assertArrayEquals(expectedResult, Try1.result);

	}
	
	@Test

	void case3() {
		Try1.rows = new String[1];

		Try1.rows[0] = "----------";

		String[] expectedResult = {

				"000"
		};
		Try1.testMe();

		assertArrayEquals(expectedResult, Try1.result);

	}

	@Test

	void case4() {
		Try1.rows = new String[2];
		Try1.rows[0] = "-rwxrwx---";
		Try1.rows[1] = "-rwx---rwx";

		String[] expectedResult = {

				"770", "707"};

		Try1.testMe();

		assertArrayEquals(expectedResult, Try1.result);

	}

	

	

}
