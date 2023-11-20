package simplilearnpack1;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

public class TestElearning {

	@Test
	public void findcourse() {

		String Topic = "Selinium";

		int Expectedduration = 10;

		Elearning cs = new Elearning();

		// number of people in the city

		int count = cs.getcourse(Topic);

		System.out.println(count);

		AssertJUnit.assertEquals(count, Expectedduration);

	}

	@Test
	public void findEmptyInput() {

		try {
			String Topic = "";
			int Expectedduration = 0;
			Elearning cs = new Elearning();

			int count = cs.getcourse(Topic);

		} catch (NullPointerException e) {

			System.out.println("Topic name cannot be empty");
		}

	}

	

	}


