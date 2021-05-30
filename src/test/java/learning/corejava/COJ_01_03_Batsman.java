package learning.corejava;

public class COJ_01_03_Batsman {

	public static void main(String[] args) {
		Batsman batsman1 = new Batsman();
		batsman1.setName("Virak Kohli");
		batsman1.setRunsScored(973);
		batsman1.setCenturies(4);
		batsman1.setHalfCenturies(7);
		batsman1.setBallsFaced(640);
		batsman1.setFours(83);
		batsman1.setSixes(38);

		System.out.println("ID : " + batsman1.getId());
		System.out.println("Name : " + batsman1.getName());
		System.out.println("Runs Scored : " + batsman1.getRunsScored());
		System.out.println("Balls Faced : " + batsman1.getBallsFaced());
		System.out.println("Centuries : " + batsman1.getCenturies());
		System.out.println("Half Centuries : " + batsman1.getHalfCenturies());
		System.out.println("Fours : " + batsman1.getFours());
		System.out.println("Sixes : " + batsman1.getSixes());
		System.out.println("Strike Rate : " + batsman1.getStrikeRate());
		System.out.println("RunsScoredInBoundaries : "
				+ batsman1.getRunsScoredInBoundaries());

		Batsman batsman2 = new Batsman("AB de Villers", 687, 1, 6, 407, 57, 37);
		System.out.println("ID : " + batsman2.getId());
		System.out.println("Name : " + batsman2.getName());
		System.out.println("Runs Scored : " + batsman2.getRunsScored());
		System.out.println("Balls Faced : " + batsman2.getBallsFaced());
		System.out.println("Centuries : " + batsman2.getCenturies());
		System.out.println("Half Centuries : " + batsman2.getHalfCenturies());
		System.out.println("Fours : " + batsman2.getFours());
		System.out.println("Sixes : " + batsman2.getSixes());
		System.out.println("Strike Rate : " + batsman2.getStrikeRate());
		System.out.println("RunsScoredInBoundaries : "+ batsman2.getRunsScoredInBoundaries());
	}

}
