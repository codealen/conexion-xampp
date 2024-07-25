/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.util.ArrayList;

/**
 *
 * @author alenzavalagomez
 */
public class Listado_Productos {
    ArrayList<Productos>lista;
    
    public Listado_Productos(){
    lista = new ArrayList();
    }
    public void AgregarProductos(Productos c){
    lista.add(c);
    }
}
