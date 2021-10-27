public class AbstractDemo {

    public static void main(String a[]){

        Mphone obj = new Ophone();
        obj.call();
        obj.autoLock();
        obj.setAlarm();


    }
}

abstract class Mphone{ //Abstract Class

    public void call(){
        System.out.println("M is Calling...");
    }

    /**
     * The methods below are declared without an implementation
     * hence they are abstract methods
     *
     * Manufacturer of Phone m would  like to have these features
     * but does not have the capacity to implement them
     *
     * so it defines those features so manufacturers of future versions of subsequent phones
     * would take note of them and possibly implement them
     */
    public abstract void autoLock(); //Abstract method
    public abstract void setAlarm(); // Abstract method


}

abstract class Nphone extends Mphone{ //Abstract Class
    /**
     * Manufacturer of Nphone inherits the template of Mphone
     * He sees new features which were not implemented
     * He could only implement the autolock feature
     *
     * Since there are still some abstract methods which are not implemented
     * Nphone becomes an abstract class
     */
    public void autoLock(){
        System.out.println("Phone is locked");
    }

}

class Ophone extends Nphone{ //Concrete Class

    /**
     * Manufacturer of Ophone inherits the template of Nphone
     * He sees a new feature which was not implemented
     * He implements it
     *
     * Hence the 3 abstract methods have been implemented
     * This class which contains a complete implementation of all
     * its methods is called a CONCRETE CLASS
     *
     *
     * ABSTRACTIONS helps in listing out the important features
     * in our application without bothering about the implementation
     * It provides a quick high level view of what it is we want to design
     * Then we can bother about the implementation later.
     *
     *
     */

    public void setAlarm(){

        System.out.println("Alarm has been set");
    }
}