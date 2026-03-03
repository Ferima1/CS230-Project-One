package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Game extends Entity {
    
    
    private List<Team> teams = new ArrayList<Team>();
  
    public Game() {
        super();
    }
    
 //Constructor
    public Game(long id, String name) {
        super(id, name);
    }
  
    public Team addTeam(String name) {
        //I use iterator to check if team name already exists
        Iterator<Team> iterator = teams.iterator();
        while (iterator.hasNext()) {
            Team team = iterator.next();
            if (team.getName().equalsIgnoreCase(name)) {
                System.out.println("Team name already exists: " + name);
                return team;
            }
        }
        
        // If team name is unique, i create new team
        Team team = new Team(GameService.getInstance().getNextTeamId(), name);
        teams.add(team);
        return team;
    }
    
    
    public Team getTeam(long id) {
        // Use iterator to find team by ID
        Iterator<Team> iterator = teams.iterator();
        while (iterator.hasNext()) {
            Team team = iterator.next();
            if (team.getId() == id) {
                return team;
            }
        }
        return null;
    }
    
   
    public int getTeamCount() {
        return teams.size();
    }
    
    @Override
    public String toString() {
        return "Game [id=" + getId() + ", name=" + getName() + "]";
    }
}
