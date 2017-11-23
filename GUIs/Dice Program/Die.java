//Written by Anthony Rojas
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;

public class Die{
	/**
	 * A die may only have 6 faces meaning it can only go up to a value of 6
	 */
	public int MAX_FACES = 6;
	private int face;
	Random r = new Random();
	
	/**
	 * Constructor for Die sets the face value as a random integer from 1 to 6
	 */
	public Die(){
		face = r.nextInt(MAX_FACES) + 1;
	}

	public void rollDie(){
		face = r.nextInt(MAX_FACES) + 1;
	}

	public int getFace(){
		return face;
	}

	@Override
	public String toString(){
		return String.valueOf(face);
	}
}