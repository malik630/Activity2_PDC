package main;

public class ServiceFacade {
    public  ServiceFacade() {}

    public void encode() {
        Encode e = new Encode();
        e.encodeContent();
    }

    public void stream() {
        Stream s = new Stream();
        s.streamContent();
    }

    public void calendar(){
        Calendar c = new Calendar();
        c.calendarContent();
    }
}