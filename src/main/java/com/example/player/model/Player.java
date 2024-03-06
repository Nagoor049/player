package com.example.player.model;

import javax.persistence.*;

@Entity
@Table(name = "playerlist")
public class Player {
    @Id
    @Column(name = "playerid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int playerId;

    @Column(name = "playername")
    private String playerName;

    @Column(name = "jerseyno")
    private int JerseyNumber;

    @Column(name = "role")
    private String role;


    public Player() {
    }

    public Player(int playerId, String playerName, int JerseyNumber, String role) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.JerseyNumber = JerseyNumber;
        this.role = role;

    }
    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getJerseyNumber() {
        return JerseyNumber;
    }

    public void setJerseyNumber(int JerseyNumber) {
        this.JerseyNumber = JerseyNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}