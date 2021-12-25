public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println("Начислено бонусных миль:" + miles);
    }
}

//public class Main {
////    public static void main(String[] args) {
////        int ticketPrice = 7545;
////        int milesBonus = ticketPrice / 20;
////        System.out.println("Начислено бонусных миль:" + milesBonus);
////    }
//}