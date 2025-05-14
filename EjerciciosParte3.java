public class EjerciciosParte3 {
    //1
    public static String frase(String[] palabras){
        String frase="";
        for (int i=0;i<palabras.length;i++){
            frase+=palabras[i]+" ";
        }
        return frase;
    }
    //2
    public static boolean esPalabra(String[] palabras, String palabra){
        for(int i=0;i<palabras.length;i++){
            if (palabra ==palabras[i]){
                return true;
            }
        }
        return false;
    }
    //3
    public static int contPalabra(String[] palabras, String palabra){
        int cont = 0;
        for(int i=0;i<palabras.length;i++){
            if (palabra == palabras[i]){
                cont++;
            }
        }
        return cont;
    }
    //4
    public static String[] arrayAMayusculas(String[] palabras){
        for (int i=0;i<palabras.length;i++){
            palabras[i]=palabras[i].toUpperCase();
        }
        return palabras;
    }
    //5
    public static String[] sinRepetir(String[] palabras){
        String[] sinRepetir=new String[palabras.length];
        boolean chivato=false;
        int posicion=0;
        for(int i=0; i<palabras.length;i++){
            for(int j=0;j<sinRepetir.length;j++){
                if (palabras[i].equals(sinRepetir[j])){
                    chivato=true;
                    break;
                }
            }
            if(!chivato){
                sinRepetir[posicion]=palabras[i];
                posicion++;
            }
            chivato=false;
        }
        return sinRepetir;
    }
    //6
    public static int contVocales(String palabra){
        char letra[]=palabra.toCharArray();
        int cont =0;
        for (int i=0;i<letra.length;i++){
            switch(letra[i]){
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    cont++;
                    break;
            }
        }
        return cont;
    }
    //7
    public static String palabraInvertida(String palabra){
        char[]letra = palabra.toCharArray();
        String pal="";
        for(int i=0;i<letra.length;i++){
            pal+=letra[letra.length-(i+1)];
        }
        return pal;
    }
    //8
    public static String palabraSinE(String palabra){
        String palabras[] = palabra.split("e");
        String pal="";
        for(int i=0;i<palabras.length;i++){
            pal+=palabras[i];
        }
        return pal;
    }
    public static void main(String[] args) {
        String[] palabras = {"hola","adios","hola","hola","adios"};
        String palabra = "hola";
        String verde = "verde";

        System.out.println("Ejercicio Frase");
        String pal = frase(palabras);
        System.out.println(pal);

        System.out.println("Ejercicio esPlabra");
        if(esPalabra(palabras, palabra)){
            System.out.println("La palabra esta en el array");
        }else{
            System.out.println("La palabra no esta en el array");
        }

        System.out.println("Ejercicio contPalabra");
        int pala = contPalabra(palabras,palabra);
        System.out.println(pala);
        
        System.out.println("Ejercicio arrayAMayusculas");
        String []palab = arrayAMayusculas(palabras);
        for (int i=0;i<palab.length;i++){
            System.out.print(palab[i]+" ");
        }
        System.out.println();

        System.out.println("Ejercicio sinRepetir");
        palab = sinRepetir(palabras);
        for (int i=0;i<palab.length;i++){
            System.out.print(palab[i]+" ");
        }
        System.out.println();

        System.out.println("Ejercicio contVocales");
        pala = contVocales(verde);
        System.out.println(pala);

        System.out.println("Ejercicio palabraInvertida");
        pal = palabraInvertida(verde);
        System.out.println(pal);

        System.out.println("Ejercicio palabraSinE");
        pal = palabraSinE(verde);
        System.out.println(pal);



    }
}
