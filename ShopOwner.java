public class ShopOwner implements Observer {
    private Subject watchman;

    public ShopOwner(Subject watchman)
    {
        this.watchman = watchman;
        watchman.registerObserver(this);
    }
    //updating and analysis data
    public void update(int warning)
    {
        if(warning==1)
            System.out.println("\"Shop Owner: Close down shop and head home\"");

        if(warning==2)
            System.out.println("\"Shop Owner: Drops everything and find nearest hideout\" ");
    }



}
