package main;

public class StreamingAdapter {
    ServiceFacade facade = new ServiceFacade();
    public  StreamingAdapter() {
    }

    public int stream(){
        facade.stream();
        return 0;
    }
}
