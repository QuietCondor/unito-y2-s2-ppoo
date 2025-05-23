// rappresenta un punto sul piano
// le istanze di questa classe sono immutabili
public class ImmutablePoint {
  // coordinate cartesiane
  private double x;
  private double y;
  
  public ImmutablePoint(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() {return x;}
  public double getY() {return y;}

  // ritorna un nuovo punto traslato di (+dx, +dy) sul piano
  public ImmutablePoint translate(double dx, double dy) {
    return new ImmutablePoint(x + dx, y + dy);
  }

  // distanza Euclidea tra questo punto e il punto p
  public double distance(ImmutablePoint p) {
    assert p != null;
    return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
  }
}
