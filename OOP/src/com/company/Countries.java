package com.company;

class da {
    public static void main(String[] args) {
        Countries belarus1 = Countries.BELARUS;
        Countries belarus2 = Countries.BELARUS;
        belarus1.setPopulation(10);

        System.out.println(Countries.BELARUS == Countries.BELARUS);
        System.out.println(Countries.BELARUS == Countries.valueOf("BELARUS"));
        System.out.println(Countries.BELARUS == Countries.a("Belarus"));
        System.out.println(belarus1.getPopulation());
        System.out.println(belarus2.getPopulation());
        System.out.println(Countries.BELARUS.getPopulation());

    }

}
enum Countries implements Comparable<Countries>{
    RUSSIA (200_000_000, 400_000_000),
    BELARUS(250_000, 10_000_000),
    UKRAINE(15_000_000, 58_000_000);

    private int square;
    private int population;
    Countries(int square, int population){
        this.square = square;
        this.population = population;
    }
    public static Countries a(String str)
    {
        return valueOf(str.toUpperCase());
    }
    public int getSquare(){
        return square;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int compare(Countries country){
        if (this.square == country.getSquare()){
            return 0;
        }else if(this.square > country.getSquare()){
            return 1;
        }else{
            return -1;
        }

    }



}
