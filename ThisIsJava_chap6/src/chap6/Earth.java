package chap6;

public class Earth {
	// 상수 선언
	public static final double EARTH_RADIUS = 6400;
	public static final double EARTH_SURFACE_AREA;

	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}
