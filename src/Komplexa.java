public class Komplexa {
        double a;
        double b;

        public Komplexa(double a, double b) {
            this.a = a;
            this.b = b;
        }

        public Komplexa add(Komplexa z2) {
            double a = this.a + z2.a;
            double b = this.b + z2.b;
            Komplexa z3 = new Komplexa(a,b);
            return z3;
        }

        public Komplexa multiply(Komplexa z2){
            double a = this.a * z2.a;
            double b = this.b * z2.b;
            Komplexa z3 = new Komplexa(a,b);
            return z3;
        }

        public double arg(){
            double v = Math.atan(this.b / this.a);
            return v;
        }

        public boolean equals(Komplexa z2){
            boolean yes;
            if (this.a == z2.a && this.b == z2.b){ //kollar om dem två talen är lika
                 yes = true;
            }else {
                 yes = false;
            }
            return yes;
        }

        public String toString() {
            return "(" + this.a + " , " + this.b + "i)";
        }
}
