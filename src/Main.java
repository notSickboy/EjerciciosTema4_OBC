public class Main {
    public static void main(String[] args) {

        // Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        // Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

        int numeroIf = -10;

        System.out.println("ENTRANDO AL BUCLE IF");

        if (numeroIf>0){
            System.out.println("El numero es postivo");
        } else if(numeroIf<0){
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es cero");
        }

        /*
            Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3,
            el bloque de código que tendrá el bucle deberá:
                1. Incrementar el valor de la variable en uno cada vez que se ejecute.
                2. Mostrarlo por pantalla cada vez que se ejecute.
         */

        var numeroWhile = 0;

        System.out.println("ENTRANDO AL BUCLE WHILE");

        while(numeroWhile<3){
            numeroWhile ++;
            System.out.println("El valor del numero es " + numeroWhile);
        }

        /*
            Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
         */

        System.out.println("ENTRANDO AL BUCLE DO-WHILE");

        do{
            numeroWhile ++;
            System.out.println("El valor del numero es " + numeroWhile);
            break;
        }while(numeroWhile<3);

        /*
            Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la
            variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse
            por pantalla.
         */

        var numeroFor = 0;

        System.out.println("ENTRANDO AL BUCLE FOR");

        for(numeroFor = numeroFor; numeroFor <=0; numeroFor += 1){
            System.out.println(numeroFor);
        }

        /*
            Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año.
            Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está.
            También habrá que poner un default para cuando el valor de la variable no sea una estación.
         */

        System.out.println("ENTRANDO AL SWITCH");

        var estacion = "primavera";

        switch(estacion){
            case "primavera":
                System.out.println("Es primavera");
                break;
            case "verano":
                System.out.println("Es verano");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("Se ha introducido '" + estacion + "' y no es una estacion del año.");
                break;
        }



    }
}