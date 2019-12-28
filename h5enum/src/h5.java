public class h5 {
    public static void main(String[] args) {
        System.out.println(Countries.BELARUS.getPopulation());
        System.out.println(Countries.BELARUS.getSquare());
        System.out.println(Countries.valueOf("RUSSIA"));
        System.out.println(Countries.valueOf("SPAIN") == Countries.SPAIN);
   //     System.out.println(Countries.valueOf("MINSK"));  //исключение, т.к. нет такого энума

    }
}
    enum Countries implements ICountries, Comparable<Countries> {
        RUSSIA (105_600_874, 990_000_000),
        BELARUS (207_600, 10_000_000),
        UKRAINE (30_600_874, 300_000_000),
        ENGLAND (1_600_874, 60_000_000),
        LATVIA (600_874, 40_000_000),
        NORWAY (900_800, 52_000_000),
        SWEDEN (159_600_874, 8_000_000),
        FRANCE (300_870_874, 90_000_000),
        AUSTRIA (49_600_874, 5_000_000),
        SPAIN (458_600_000, 58_000_000);

        private int countOfPeople;
        private int square;
        Countries(int square, int countOfPeople) {
            this.square = square;
            this.countOfPeople = countOfPeople;
        }

        @Override
        public int getPopulation() {
            return countOfPeople;
        }

        @Override
        public int getSquare() {
            return square;
        }
    }
