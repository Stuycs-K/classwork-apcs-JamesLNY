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
    System.out.println(p3);
    System.out.println("Testing other constructor");
    Point p4 = new Point(p3);
    System.out.println("Expected " + p3 + " Returned " + p4);
    System.out.println("Expected " + Math.sqrt(8));
    System.out.println(distance(p1, p2));
    System.out.println(Point.distance(p1, p2));
    System.out.println(p1.distanceTo(p2));
    System.out.println("Expected " + Math.sqrt(41));
    System.out.println(distance(p2, p3));
    System.out.println(Point.distance(p2, p3));
    System.out.println(p2.distanceTo(p3));
    System.out.println("Expected " + Math.sqrt(13));
    System.out.println(distance(p3, p1));
    System.out.println(Point.distance(p3, p1));
    System.out.println(p3.distanceTo(p1));
    Point triangleA = new Point(0, 0);
    Point triangleB = new Point(0.5, Math.sqrt(3) * 0.5);
    Point triangleC = new Point(1, 0);
    System.out.println("Testing side lengths of triangle");
    System.out.println("Expected 1");
    System.out.println(distance(triangleA, triangleB));
    System.out.println(distance(triangleB, triangleC));
    System.out.println(distance(triangleC, triangleA));
  }
}
