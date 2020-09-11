package B5_AbstractAndInterface.Comparator;

import B4_Inheritances.Practices.ShapeObject.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1.getRadius() > o2.getRadius()) {
            return 1;
        } else if (o1.getRadius() < o2.getRadius()) {
            return -1;
        } else {
            return 0;
        }
    }

//    public static void main(String[] args) {
//        CircleComparator[] circleComparator = new CircleComparator[2];
//        circleComparator[0] = new CircleComparator();
//        circleComparator[1] = new CircleComparator();
//    }
}
