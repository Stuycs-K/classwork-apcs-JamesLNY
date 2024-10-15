public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    double distanceX = a.getX() - b.getX();
    double distanceY = a.getY() - b.getY();
    return Math.sqrt(Math.pow(distanceX, 2) + Math.pow(distanceY, 2));
  }

  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
    System.out.println( p3);
    System.out.println("Testing other constructor");
    Point p4 = new Point(p3);
    System.out.println("Expected " + p3 + " Returned " + p4);
    System.out.println( distance(p1,p2));
    //System.out.println( Point.distance(p1,p2));
    System.out.println( p1.distanceTo(p2));
  }
}
