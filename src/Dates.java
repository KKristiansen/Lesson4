import java.time.LocalDate;
import java.time.Period;

public class Dates {
    public static void main(String[] args) {
        LocalDate tjt = LocalDate.of(1987,3,9);
        LocalDate rah = LocalDate.of(1988,10,10);
        LocalDate now = LocalDate.now();

        Period pTjt = Period.between(tjt, now);
        //Period pRah = Period.between(rah, now);

        System.out.println("It has been " + pTjt.getYears() + " years, " + pTjt.getMonths() + " months, and " + pTjt.getDays()
                + " days since the release of U2's The Joshua Tree CD.");
        //System.out.println("It has been " + pRah.getYears() + " years, " + pRah.getMonths() + " months, and " + pRah.getDays()
        //        + " days since the release of U2's Rattle and Hum CD.");

        Period timeBetween = Period.between(tjt, rah);

        System.out.println("It was " + timeBetween.getYears() + " year, " + timeBetween.getMonths() + " months, and " + timeBetween.getDays()
                + " days between the 2 CDs.");

        System.out.println("A Third Album Released: " + timeBetween.addTo(rah));

    }
}
