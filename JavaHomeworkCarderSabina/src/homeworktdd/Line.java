package homeworktdd;

/**
 *
 * @author LenovoT410
 */
public class Line extends TwoDimensional implements Definibila {
    
    @Override
    public String getDefinition(){
        String definition = super.getDefinition();
        definition += "defined by 2 points.";
        return(definition);
        
    }
}
