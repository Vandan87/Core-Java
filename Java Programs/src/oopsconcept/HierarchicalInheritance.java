package oopsconcept;
/* Program's aim is to show the use of HierarchicalInheritance. */
class Cricket {
	void matchType() {
		System.out.println("Cricket Match");
	}
}

// Test Match class inheriting from Crickt
class TestMatch extends Cricket {
	void matchType() {
		System.out.println("Unlimited Overs Called Test Match");
	}
}

// Odi Match class inheriting from Cricket
class OdiMatch extends Cricket {
	void matchType() {
		System.out.println("50 Overs Match Called ODI Match");
	}
}

public class HierarchicalInheritance {

	public static void main(String args[]) {
		Cricket cricket = new Cricket();
		Cricket testMatch = new TestMatch();
		Cricket odiMatch = new OdiMatch();
		cricket.matchType();
		testMatch.matchType();
		odiMatch.matchType();
	}

}