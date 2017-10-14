/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworktdd;

/**
 *
 * @author lenovo
 */
public class TwoDimensional extends GeometricalShape implements Definibila {

    private String definition;
    @Override
    public String getDefinition(){
        String Definition = super.getDefinition();
        definition += ", 2D, ";
        return(definition);
    }
    
}
