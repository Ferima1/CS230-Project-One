package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Singleton service for the game engine
public class GameService {

    // List of active games
    private List<Game> games = new ArrayList<Game>();

    private static long nextGameId = 1;

    private static long nextTeamId = 1;

    private static long nextPlayerId = 1;

    /**
     * Singleton instance (private static)
     */
    private static GameService instance = null;

    /**
     * Private constructor to prevent instantiation
     */
    private GameService() {
    }

    public static GameService getInstance() {
        if (instance == null) {
            instance = new GameService();
        }
        return instance;
    }

    public Game addGame(String name) {
        // Use iterator to check if game name already exists
        Iterator<Game> iterator = games.iterator();
        while (iterator.hasNext()) {
            Game game = iterator.next();
            if (game.getName().equalsIgnoreCase(name)) {
                System.out.println("Game name already exists: " + name);
                return game;
            }
        }

        // If game name is unique, create new game
        Game game = new Game(nextGameId++, name);
        games.add(game);
        return game;
    }

    public Game getGame(long id) {
        // Use iterator to find game by ID
        Iterator<Game> iterator = games.iterator();
        while (iterator.hasNext()) {
            Game game = iterator.next();
            if (game.getId() == id) {
                return game;
            }
        }
        return null;
    }

    public Game getGame(String name) {
        // Use iterator to find game by name
        Iterator<Game> iterator = games.iterator();
        while (iterator.hasNext()) {
            Game game = iterator.next();
            if (game.getName().equalsIgnoreCase(name)) {
                return game;
            }
        }
        return null;
    }

    public int getGameCount() {
        return games.size();
    }

    public long getNextTeamId() {
        return nextTeamId++;
    }

    public long getNextPlayerId() {
        return nextPlayerId++;
    }
}
