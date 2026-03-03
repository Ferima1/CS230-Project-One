package com.gamingroom;



public class Player extends Entity {
    
    
    public Player() {
        super();
    }
    
    
    public Player(long id, String name) {
        super(id, name);
    }
    
    @Override
    public String toString() {
        return "Player [id=" + getId() + ", name=" + getName() + "]";
    }
}
