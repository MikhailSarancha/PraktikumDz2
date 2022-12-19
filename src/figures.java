public class figures {
    public static class Triangle {
        int side1;
        int side2;
        int side3;
        double S;
        double P;

        public Triangle(int a, int b, int c) {
            side1 = a;
            side2 = b;
            side3 = c;
            if (((a>0 & b>0 & c>0) & (a+b>c & a+c>b & c+b>a))==false){
                throw new RuntimeException("There is no figure with such parameters.");
            }
        }

        int getP(){
            return side1+side2+side3;
        }
        double getS(){
            double p,x;
            P = getP();
            p = P/2;
            x = p*(p-side1)*(p-side2)*(p-side3);
            return Math.sqrt(x);
        }
    }

    public static class Rectangle{
        int side1;
        int side2;
        int S;
        int P;

        public Rectangle(int a, int b) {
            side1 = a;
            side2 = b;
            if (a<=0 | b<=0){
                throw new RuntimeException("There is no figure with such parameters.");
            }
        }


        int getP(){
            return side1+side2;
        }

        int getS(){
            return side1*side2;
        }
    }

    public static class Circle{
        int radius;
        double P;
        double S;

        public Circle(int a) {
            radius = a;
            if (a<=0){
                throw new RuntimeException("There is no figure with such parameters.");
            }
        }

        double getP(){
            return 2*3.14*radius;
        }

        double getS(){
            return 3.14*radius*radius;
        }
    }
}
