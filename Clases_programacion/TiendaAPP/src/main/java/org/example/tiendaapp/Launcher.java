package org.example.tiendaapp;

import javafx.application.Application;
import javafx.stage.Stage;
/*
* Ventantas -> Stage
* Panel general-> Scene
* Elementos -> nodos
*   Node final-> Button spinner comboboz choicebox textfield text list table
*   Node container-> estructuran internamente otros elementos. Como se disponen los elementos finales-> layouts
    Hbox-> los elementos se disponenn horizontalmente
    VBox-> los elementos se disponen verticalmente
    Border pane-> los elementos se disponenn mediante puntos cardinales
    Flowpane-> los elmentos se disponen desde el ccentro repartiendo el espacio

    Stage
       Scene
           Nodes
           *
           *
*
* src
*   java ->
*       org,nombre,nombreappp-> codigos de java
*           Helloapp+Launcher-> la clase donde se lanza la app launch/start
*           HelloController-> Toda la parte lodica de la escena
*           +agregar listener a los nodos (meterles escuchadores para cuando se de una pulsacion de algo pase algo)
*
*   module-info.java-> todas las necesidades de cada uno de los modulos de la aplicación
*
*   resources
*       org.nombre.nombreapp-> recursos estaticos de la app-> imagenes, font
*/

public class Launcher {
    public static void main(String[] args) {
        Application.launch(HelloApplication.class, args);
    }
}
