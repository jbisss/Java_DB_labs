package bikeproject;

public interface RoadParts {
//public final String TERRAIN="track_racing";
public final BikeUses terrain = BikeUses.track;

public int getTyreWidth();
public int getPostHeight();
public void setTyreWidth(int newValue);
public void setPostHeight(int newValue);
}
