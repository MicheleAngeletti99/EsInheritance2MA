public class Rettangolo extends Forma {
    public int base;
    public int altezza;

    public Rettangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public void calcolaArea() {
        int area = base * altezza;
        System.out.println("Area = " + area);
    }
}
