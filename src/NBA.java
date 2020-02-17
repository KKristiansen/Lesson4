import java.security.interfaces.RSAKey;
import java.util.Scanner;

public class NBA {
    public enum Team {
        BUL ("Chicago", "Bulls"),
        CHI ("Chicago","Bulls"),
        CAV ("Cleveland","Cavaliers"),
        CLE ("Cleveland","Cavaliers"),
        PIS ("Detroit","Pistons"),
        DET ("Detroit","Pistons"),
        PAC ("Indiana","Pacers"),
        IND ("Indiana","Pacers"),
        BUC ("Milwaukee","Bucks"),
        MIL ("Milwaukee","Bucks");
        private String city;
        private String team;

        private Team(String city, String team) {
            this.city = city;
            this.team = team;
        }

        public String getTeam() {
            return team;
        }
        public String getCity() {
            return city;
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String input;
        System.out.println("What is your favorite team?");
        input = kb.nextLine().substring(0,3).toUpperCase();
        try {
            Team team = Team.valueOf(input);
            printTeam(team);
        } catch (Exception e) {
            System.out.println("Team not found.");
        }
    }

     private static void printTeam(Team team) {
         System.out.println(team.getCity() + " " +team.getTeam());
    }
}
