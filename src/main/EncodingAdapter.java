package main;

public class EncodingAdapter {
    ServiceFacade facade = new ServiceFacade();
    public  EncodingAdapter() {
    }

    public int encode(){
        facade.encode();
        return 0;
    }
}
