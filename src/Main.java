public class Main {
    public static void main(String[] args) {
        Forma shape = new Forma();
        Rettangolo nientePitagora = new Rettangolo(5, 12);

        shape.calcolaArea();
        nientePitagora.calcolaArea();
    }
}