package com.codecool.database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RadioCharts {
    private final String dbUrl;
    private final String dbUser;
    private final String dbPassword;

    public RadioCharts(String dbUrl, String dbUser, String dbPassword) {
        this.dbUrl = dbUrl;
        this.dbUser = dbUser;
        this.dbPassword = dbPassword;
    }


    public List<String> getArtists() {
        List<String> artists = new ArrayList<>();

        String query =
            """
                SELECT DISTINCT artist from music_broadcast;
                """;

        try (Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                artists.add(rs.getString(1));
            }
            artists.forEach(System.out::println);
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return artists;
    }


    public String getMostPlayedSong() {
        String mostPlayedSong = " ";

        String query =
            """
                SELECT song from music_broadcast
                WHERE max(times_aired) 
                ;
                """;

        try (Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String song = rs.getString("song");
                mostPlayedSong = song;
            }

            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return mostPlayedSong;

    }

    public String getMostActiveArtist() {
        String mostPlayedArtist = " ";

        String query =
            """
                SELECT artist, count(*) from music_broadcast
                GROUP BY artist;
                """;

        try (Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String song = rs.getString("song");
                mostPlayedArtist = song;
            }

            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return mostPlayedArtist;
    }
}