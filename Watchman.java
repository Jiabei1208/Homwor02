import java.util.ArrayList;

public class Watchman implements Subject {
    ArrayList<Observer> observers;// create an arraylist
    int warning;

    public Watchman()
    {
        observers = new ArrayList<Observer>();//declare the list
    }

    public void registerObserver(Observer observer)
    {
        observers.add(observer);//add number into array.
    }

    public void removeObserver(Observer observer)
    {
        observers.remove(observer);// remove number from array
    }
    //print information
    public void notifyObservers()
    {
        for(Observer observer : observers)
            observer.update(warning);
    }
    //determine if waring equal 1 or not
    public void issueWarning(int warning)
    {
        this.warning = warning;
        if(warning==1)
            System.out.println("Waring: "+ warning +" Trumpet was played!");
        if(warning==2)
            System.out.println("Waring:"+warning + "trumpets were played!");
        notifyObservers(); //showing the result
    }
}
