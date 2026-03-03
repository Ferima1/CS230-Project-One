package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Team extends Entity {
  
    private List<Player> players = new ArrayList<Player>();
    
   
    public Team() {
        super();
    }
    
    
    public Team(long id, String name) {
        super(id, name);
    }
    
   
    public Player addPlayer(String name) {
        // Use iterator to check if player name already exists
        Iterator<Player> iterator = players.iterator();
        while (iterator.hasNext()) {
            Player player = iterator.next();
            if (player.getName().equalsIgnoreCase(name)) {
                System.out.println("Player name already exists in this team: " + name);
                return player;
            }
        }
        
        // If player name is unique, create new player
        Player player = new Player(GameService.getInstance().getNextPlayerId(), name);
        players.add(player);
        return player;
    }
    
    
    public Player getPlayer(long id) {
        // Use iterator to find player by ID
        Iterator<Player> iterator = players.iterator();
        while (iterator.hasNext()) {
            Player player = iterator.next();
            if (player.getId() == id) {
                return player;
            }
        }
        return null;
    }
    
   
    public int getPlayerCount() {
        return players.size();
    }
    
    @Override
    public String toString() {
        return "Team [id=" + getId() + ", name=" + getName() + "]";
    }
}
