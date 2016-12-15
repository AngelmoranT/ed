package org.institutoserpis.ed;

import static org.junit.Assert.*;

import org.junit.Test;

//import junit.framework.Assert;

public class VectorTest {

	                                           @Test
	public void indexOf() {
		
		//int[] v = new int[]{32, 15, 7, 9, 12};
		//int value = 9;
		//int index = Vector.indexOf(v,  value);
		//Assert.assertEquals(3,  index);
		
		assertEquals(0, Vector.indexOf(new int[]{32, 15, 7, 9, 12}, 32));
		assertEquals(2, Vector.indexOf(new int[]{32, 15, 7, 9, 12}, 7));
		assertEquals(3, Vector.indexOf(new int[]{32, 15, 7, 9, 12}, 9));
		assertEquals(4, Vector.indexOf(new int[]{32, 15, 7, 9, 12}, 12));
		assertEquals(-1, Vector.indexOf(new int[]{32, 15, 7, 9, 12}, 99));
	}

}



