package brickapp.utils;

/**
 * @author Alexandre Vienne
 * @version 0.1
 * Va créer ce qu'il faut pour retourner un terain de jeu de base pour la suite (quelques briques...)
 */



import brickapp.items.Brick;
import java.util.ArrayList;
import java.util.List;

public final  class InitPlayField {

    private InitPlayField(){

    }

    public static  List<Brick> getInitBrickList(){
           List<Brick> lb = new ArrayList<Brick>();
        for (int i=0;i<5;i++) {
             lb.add(new Brick(new Position(i*50,i*50)));
        }

        return lb;
    }

}
