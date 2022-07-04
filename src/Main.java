public class Main {
    public static void main(String[] args) {
        int numeroIf = -1;
        int numeroWhile = -1;
        var estacion = "Verano";


        if(numeroIf > 0){
            System.out.println("El numero es positivo");
        }else if (numeroIf == 0){
            System.out.println("El numero es 0");
        }
        else {
            System.out.println("El numero es negativo");
        }

        while (numeroWhile < 3){

            System.out.println(numeroWhile);
            numeroWhile++;
        }
        do{
            System.out.println("En Do-While");
            System.out.println(numeroWhile);
            numeroWhile++;
        }while (numeroWhile < 4);
        for(int numeroFor=0; numeroFor <= 3; numeroFor++){
            System.out.println("numeroFor: "+ numeroFor);
        }
        switch (estacion){
            case "Verano":
                System.out.println("Estamos en la estacion: "+estacion);
                break;
            case "Invierno":
                System.out.println("Estamos en la estacion: "+estacion);
                break;
            case "Primavera":
                System.out.println("Estamos en la estacion: "+estacion);
                break;
            case "Otoño":
                System.out.println("Estamos en la estacion: "+estacion);
                break;
            default: System.out.println("Lo siento, esto no es una estacion");
        }

    }
}