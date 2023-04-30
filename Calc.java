public class Calc {

        int a, b;
        float c, d;
        double x, y;

        //a)
    public Calc() {
            a = 10;
            b = 4;
            c = 2.5f;
            d = 8.9f;
            x = 5.23980;
            y = 2.48956;
        }

        //b)
    public Calc( int n1, int n2, float f1, float f2, double d1, double d2){
            a = n1;
            b = n2;
            c = f1;
            d = f2;
            x = d1;
            y = d2;
        }

        //c)
        public int suma (){
            return a + b;
        }

        public float sumaf (){
            return c + d;
        }

        public double sumadou (){
            return x + y;
        }

        public int resta (){
            return a - b;
        }

        public float restaf (){
            return c - d;
        }

        public double restadou (){
            return x - y;
        }

        //d)
        public int multiplicacion (){
            int resultado = 0;

            for (int i = 1; i <= a; i++) {
                resultado += b;
            }

            return resultado;
        }

        //e)
        public double division (){
            double cociente = 0, residuo = b;

            while (b >= a) {
                residuo -= a;
                cociente++;
            }
            residuo /= a;
            cociente += residuo;

            return cociente;
        }

        //f)
        public float multiplicar (){
            return c * d;
        }

        public double multiplicardou (){
            return x * y;
        }

        public float dividir (){
            return d / c;
        }

        public double dividirdou (){
            return y / x;
        }

        //g)
        public int modulo (){
            return b % a;
        }
}
