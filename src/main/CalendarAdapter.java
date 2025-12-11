package main;

public class CalendarAdapter {
    ServiceFacade facade = new ServiceFacade();
    public  CalendarAdapter() {}

    public int calendar(){
        facade.calendar();
        return 0;
    }
}
