import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class DBExample {


    public static String url = "jdbc:sqlite:C:/Users/Jakub/IdeaProjects/Database/chinook.db";

    public static void main(String[] args) throws FileNotFoundException {
        List<Track> trackList = new ArrayList();


        try (Connection conn = DriverManager.getConnection(url)) {

            System.out.println("Connection to SQLite has been established.");
            Statement statement = conn.createStatement();
            String query = new Scanner(new File("C:\\Users\\Jakub\\IdeaProjects\\Database\\sqlquery.sql")).nextLine();

            ResultSet response = statement.executeQuery(query);
            while (response.next()) {
                Track track = new Track();
                track.setName(response.getString("Name"));
                track.setComposer(response.getString("Composer"));
                track.setPrice(response.getDouble("UnitPrice"));
                trackList = adjustTrackListInCaseOfExcludeAnnotation(track, trackList);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        for (Track track : trackList) {
            System.out.println(track);
        }
    }

    private static List<Track> adjustTrackListInCaseOfExcludeAnnotation(Track track, List<Track> trackList) {
        Set<String> composersSet = new HashSet<>();
        if (track.getClass().isAnnotationPresent(Exclude.class)) {
            Exclude excludeAnnotation = track.getClass().getAnnotation(Exclude.class);
            composersSet.addAll(splitString(excludeAnnotation.composer(), ","));
            if(isComposerExcluded(composersSet,track))
            {
                return trackList;
            }
        }
        trackList.add(track);
        return trackList;
    }

    private static boolean isComposerExcluded(Set<String> composersSet, Track track) {
        for (String composer : composersSet
        ) {
            if (composer.equals(track.getComposer())) {
                return true;
            }
        }
        return false;
    }

    private static Set<String> splitString(String composer, String separator) {
        Set<String> composersSet = new HashSet<>();
        String[] composers = composer.split(separator);
        for (String string : composers
        ) {
            composersSet.add(string.trim());
        }
        return composersSet;
    }
}
