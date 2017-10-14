package homeworktdd;

/**
 *
 * @author LenovoT410
 */
public class GeometricalShape implements Definibila { 
    @Override
        public String getDefinition() {
            return("The geometrical shape");
        }
    public static void main(String[] args) {
       System.out.println("CIRCLE: a round plane figure whose boundary (the circumference) consists of\n" +
       "points equidistant from a fixed point (the centre).");
       System.out.println("RECTANGLE: a plane figure with four straight sides and four right angles,\n" +
       "especially one with unequal adjacent sides, in contrast to a square.");
       System.out.println("SQUARE: a plane figure with four equal straight sides and four right angles.");
       System.out.println("TRIANGLE: a plane figure with three straight sides and three angles.");

}
}