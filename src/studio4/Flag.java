package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {   
        StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledRectangle(0.5, 0.625,  .4, .125);
		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.filledRectangle(0.5, 0.375,  .4, .125);
		StdDraw.setPenColor(StdDraw.GREEN);
		StdDraw.filledSquare(.5,.5,.1);
		StdDraw.filledSquare(.6,.5,.1);
		StdDraw.filledSquare(.4,.5,.1);
		StdDraw.filledSquare(.5,.6,.1);
		StdDraw.filledSquare(.5,.4,.1);
		StdDraw.setPenColor(StdDraw.GREEN);
		StdDraw.filledRectangle(.1,.5,.01,.25);
		StdDraw.setPenColor(StdDraw.GREEN);
		StdDraw.filledRectangle(.9,.5,.01,.25);
		
		StdDraw.filledRectangle(.5,.3,.25,.01);
		StdDraw.filledRectangle(.5,.7,.25,.01);
		StdDraw.filledRectangle(.25,.5,.01,.21);
		StdDraw.filledRectangle(.75,.5,.01,.21);
		StdDraw.setPenColor(StdDraw.ORANGE);
		StdDraw.filledCircle(.5,.5,.1);


	}
}