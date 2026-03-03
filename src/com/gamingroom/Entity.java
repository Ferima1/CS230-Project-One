package com.gamingroom;


public class Entity {
    
    // Private attributes
    private long id;
    private String name;
    
  
    public Entity() {
    }
    
   
    public Entity(long id, String name) {
        this.id = id;
        this.name = name;
    }
    
    //Getters
    public long getId() {
        return id;
    }
    
    
    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return "Entity [id=" + id + ", name=" + name + "]";
    }
}
