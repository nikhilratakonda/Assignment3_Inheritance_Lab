public class Surgeon extends Doctor{

    public boolean operating;

    public Surgeon(String name, int number, String specialty, boolean operating) {
        super(name, number, specialty);
        this.operating = operating;
    }

    public boolean isOperating() {
        return operating;
    }

    public void setOperating(boolean operating) {
        this.operating = operating;
    }

    @Override
    public String toString() {
        return  name + ' ' + number + " "+ specialty+
                " Operating: " + operating;
    }
    public void work() { System.out.println (name + " works for the hospital." + name+" is  operating now."); }



}
