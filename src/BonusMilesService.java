public class BonusMilesService {
    public int calculate(int ticketPrice) {
        int milesBonus = ticketPrice / 20;
        return milesBonus;
    }
}
