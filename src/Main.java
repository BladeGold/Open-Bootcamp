public class Main {
    public static void main(String[] args) {
       int result = suma(2,3,9);
        System.out.println(result);

        var coche = new Coche();
        coche.incrementaNumeroPuertas(1);

        System.out.println(coche.numeroPuertas);
    }

    public static int suma(int a, int b, int c){
        return a + b + c;
    }

}

