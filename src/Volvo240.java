import java.awt.*;
/**
 * A type of Car named Volvo240
 */
public class Volvo240 extends Car{
    /**
     * Determines the value of the trim factor
     */
    private final static double trimFactor = 1.25;
    /**
     *Creates a Volvo240
     */
    public Volvo240(){
        super (4,100, Color.black, "Volvo240",5);
    }
    /**
     * Sets the speedFactor used in modifying the current speed
     * @return returns the speedFactor
     */
    protected double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }

}
