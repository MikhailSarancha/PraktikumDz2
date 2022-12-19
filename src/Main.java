public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        figures.Triangle b = new figures.Triangle(1,1,1);
        System.out.println(b.getP());
        System.out.println(b.getS());
        figures.Rectangle c = new figures.Rectangle(1,2);
        System.out.println(c.getP());
        System.out.println(c.getS());
        figures.Circle e = new figures.Circle(2);
        System.out.println(e.getP());
        System.out.println(e.getS());
    }
}