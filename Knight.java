public class Knight implements Observer {
    private Subject watchman;


    public Knight (Subject watchman)
    {
        this.watchman = watchman;
        watchman.registerObserver(this);
    }
    //updating and analyse data of waring

    public void update(int warning)
    {
        // there are two options
        if(warning==1)
            System.out.println("\"Knight: Helps everyone get home safe\"");

        if(warning==2)
            System.out.println("\"Knight: Prepares for battle\"");
    }
}
