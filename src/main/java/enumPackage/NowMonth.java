package enumPackage;

public class NowMonth {
    Month m;

    public NowMonth(Month m) {
        this.m = m;
    }
public void getMonth() {


    switch(m) {
        case DECEMBER:
        case JANUARY:
        case FEBRUARY:
            System.out.println(" This is winter!");
            break;
        case  MARCH:
        case APRIL:
        case MAY:
            System.out.println(" This is spring!");
            break;
        case JUN:
        case JULY:
        case AUGUST:
            System.out.println(" This is summer");
            break;
        case SEPTEMBER:
        case NOVEMBER:
        case OCTOBER:
            System.out.println(" This is outumn!");
            break;


    }
}
}

/*  JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUN,
    JULY,
    AUGUST,
    SEPTEMBER,
    NOVEMBER,
    DECEMBER*/