package vehicles;

/*
 * Abstract rather than interface because some methods like getPosition() can have a general method that works for all forms of Transport
 * Whereas other methods like nagivateTo will vary by vehicle (Some vehicles can't use certain roads, eg trucks cannot go under certain bridges), so
 * a unique implementation for subclasses is required
 */
public abstract class Transport {
	
	abstract void navigateTo(String place);
	
	
	double[] getPosition() {
		double[] coordinate = new double[]{50.937472, -1.37697};
		return coordinate;
	}

}
