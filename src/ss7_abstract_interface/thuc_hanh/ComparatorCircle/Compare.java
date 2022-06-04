package ss7_abstract_interface.thuc_hanh.ComparatorCircle;


import java.util.Comparator;

public class Compare implements Comparator<Circle> {
    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1.getRadius() > o2.getRadius()) return 1;
        else if(o1.getRadius() < o2.getRadius()) return -1;
        else return 0;
    }
}
