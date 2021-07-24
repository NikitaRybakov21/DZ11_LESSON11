package com.github;
import java.util.ArrayList;

public class Box<T> {
    public ArrayList<T> list = new ArrayList();
    float massFruit;

    public Box(float M){
        this.massFruit = M;
    }
    public void put(T fruit){
        list.add(fruit);
    }
    public float getWeight(){
       return massFruit * list.size();
    }
    public boolean compare(Box o){
       return getWeight() == o.getWeight();
    }
}
