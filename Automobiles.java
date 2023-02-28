public enum Automobiles {
    MERSEDES(1),
    BMW(2),
    MITSUBISHI(3),
    DEWOO(4),
    LEXUS(5),
    KIA(6),
    VOLKSWAGEN(7),
    HUNDAI(8),
    HONDA(9),
    MAZDA(10),
    SUBARU(11),
    SHEVROLET(12),
    FORD(13);

    private final int autoNumber;
    Automobiles(int i){
        autoNumber = i;
    }
    public int getAutoNumber(){
        return autoNumber;
    }
}
