import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
import java.lang.Object;
import java.util.ArrayList;
/**
 * Write a description of class Obj here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obj extends BObj 
{
    private String nombre;
    private ArrayList <String> atributobj;
    private ArrayList <String> metodobj;
    
    public Obj()
    {
        metodobj = new ArrayList<String>();
        atributobj = new ArrayList <String>();
    }
    
    public void act() 
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(Greenfoot.mouseClicked(this))
        {
            if(mouse.getClickCount()==2)
            {
               String seleccion;
               seleccion = (String)JOptionPane.showInputDialog(
               null,
               "Seleccione una opcion",
               "Selector de opciones",
               JOptionPane.QUESTION_MESSAGE,
               null,
               new Object[] {"Cambia nombre", "Agrega atributo", "Muestra propiedades"},
               "Opcion");
               
               switch(seleccion)
               {
                   case "Cambia nombre" : cambiaNombre();
                        break;
                   case "Agrega atributo" : agregaAtributo();
                        break;
                   case "Muestra propiedades" : muestraPropiedades(); 
                        break;
               }
            }
       }
    }    
    
    @Override
     public void agregaAtributo()
    {
        String elemento;
        elemento=JOptionPane.showInputDialog("Atributo: ");
        atributobj.add(elemento);
    }
    
    @Override
    public void cambiaNombre()
    {
        nombre=JOptionPane.showInputDialog("Nombre de la clase: ");
    }
    
    @Override
    public void muestraPropiedades()
    {
         String mensaje = "Nombre:\n" 
         + nombre + "\n" 
         + "Atributos:\n" 
         + atributobj.toString() + "\n";
         JOptionPane.showMessageDialog(null, mensaje,"Propiedades", JOptionPane.INFORMATION_MESSAGE);
              
    }
}