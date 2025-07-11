import java.util.Scanner;

public class EjerciciosParte2 {
    //1
    public static int diferenciaArray(int[] nums){
       int max=-1, min=1000000000;
       for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
            if(min>nums[i]){
                min=nums[i];
            }
       }
       return max-min;
    }
    //2
    public static int[] arrayInvertido(int[] nums){
        int[] arrayInv= new int[nums.length];
        for(int i=0; i<nums.length;i++){
            arrayInv[i]=nums[nums.length-(i+1)];
        }
        return arrayInv;
    }
    //3
    public static int[] arrayImpares(int[] nums){
        int[] impar= new int[nums.length];
        int posicion=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]%2!=0){
                impar[posicion]=nums[i];
                posicion++;
            }
        }
        return impar;
    }
    //4
    public static int[] arrayPares(int[] nums){
        int[] par= new int[nums.length];
        int posicion=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]%2==0){
                par[posicion]=nums[i];
                posicion++;
            }
        }
        return par;
    }
    //5
    public static int contNumEnArray(int[] nums, int num){
        int cont = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==num){
                cont++;
            }
        }
        return cont;
    }
    //6
    public static int[] sinRepetir(int[] nums){
        int[] sinRepetir = new int[nums.length];
        boolean chivato = false;
        int posicion=0;
        for(int i=0;i<nums.length;i++){
            for (int j=0; j<sinRepetir.length;j++){
                if(sinRepetir[j]==nums[i]){
                    chivato=true;
                    break;
                }
            }
            if (!chivato) {
                sinRepetir[posicion]=nums[i];
                posicion++;
            }
            chivato=false;
        }
        return sinRepetir;
    }
    //7
    public static int numeroQueFalta(int[] nums){
        for(int i=0;i<nums.length;i++){
            if(nums[i]+1!=nums[i+1]){
                return nums[i]+1;
            }
        }
        return 0;
    }
    //8
    public static double promedioArray(int[] nums){
        int cont=0,sum=0;
        double media=0;
        for(int i=0; i<nums.length;i++){
            cont++;
            sum+=nums[i];
        }
        if (cont!=0){
            media=sum/cont;
        }
        return media;
    }
    //9
    public static int[] arrayCombinado(int[] nums1,int[] nums2){
        int[] arrayCombinado = new int[nums1.length+nums2.length];
        for(int i=0; i<nums1.length;i++){
            arrayCombinado[i]=nums1[i];
        }
        for (int j=0; j<nums2.length;j++){
            arrayCombinado[j+nums1.length]=nums2[j];
        }
        return arrayCombinado;
    }
    //10
    public static int[] cambiarPorCero(int[] nums, int num){
        for(int i=0; i<nums.length;i++){
            if(nums[i]==num){
                nums[i]=0;
            }
        }
        return nums;
    }
    //11
    public static boolean capicua(int[] nums) {
        for(int i=0; i<nums.length;i++){
            if(nums[i]!=nums[nums.length-(i+1)]){
                return false;
            }
        }
        return true;
    }
    //12
    public static int[] numUnoEnPosicionNum2(int[] nums, int num1, int num2){
        int[] arr = new int[nums.length+1];
        for(int i=0; i<nums.length-num2;i++){
            arr[nums.length-i]=nums[nums.length-(i+1)];
        }
        arr[num2]=num1;
        for(int i=0;i<num2;i++){
            arr[i]=nums[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 2;
        int num2= 5;
        int[] nums1 = {1,6,3,4,6,3,4,8,3,2};
        int[] nums2 = {2,5,3,8,8,0,9,3,4,7};
        System.out.println("Arrays de los ejercicios: ");
        for (int i=0;i<nums1.length;i++){
            System.out.print(nums1[i]+ " ");
        }
        System.out.println();
        for (int i=0;i<nums2.length;i++){
            System.out.print(nums2[i]+ " ");
        }
        System.out.println();
        
        System.out.println("Ejercicio 1: ");
        int num3 = diferenciaArray(nums1);
        System.out.println(num3);

        System.out.println("Ejercicio 2: ");
        int[] nums3 = arrayInvertido(nums1);
        for(int i=0;i<nums3.length;i++){
            System.out.print(nums3[i]+" ");
        }
        System.out.println();

        System.out.println("Ejercicio 3: ");
        nums3 = arrayImpares(nums1);
        for(int i=0;i<nums3.length;i++){
            System.out.print(nums3[i]+" ");
        }
        System.out.println();

        System.out.println("Ejercicio 4: ");
        nums3 = arrayPares(nums1);
        for(int i=0;i<nums3.length;i++){
            System.out.print(nums3[i]+" ");
        }
        System.out.println();

        System.out.println("Ejercicio 5: ");
        num3 = contNumEnArray(nums1,num1);
        System.out.println(num3);

        System.out.println("Ejercicio 6: ");
        nums3 = sinRepetir(nums1);
        for(int i=0;i<nums3.length;i++){
            System.out.print(nums3[i]+" ");
        }
        System.out.println();

        System.out.println("Ejercicio 7: ");
        num3 = numeroQueFalta(nums1);
        System.out.println(num3);

        System.out.println("Ejercicio 8: ");
        double num4 = promedioArray(nums1);
        System.out.println(num4);

        System.out.println("Ejercicio 9: ");
        nums3 = arrayCombinado(nums1,nums2);
        for(int i=0;i<nums3.length;i++){
            System.out.print(nums3[i]+" ");
        }
        System.out.println();

        // System.out.println("Ejercicio 10: ");
        // nums3 = cambiarPorCero(nums1,num1);
        // for(int i=0;i<nums3.length;i++){
        //     System.out.print(nums3[i]+" ");
        // }
        // System.out.println();

        System.out.println("Ejercicio 11: ");
        if(capicua(nums1)){
            System.out.println("Es capicua");
        }else{
            System.out.println("No es capicua");
        }

        System.out.println("Ejercicio 12: ");
        nums3 = numUnoEnPosicionNum2(nums1,num1,num2);
        for(int i=0;i<nums3.length;i++){
            System.out.print(nums3[i]+" ");
        }
        System.out.println();
        
        
        System.out.println("\nPresiona Enter para finalizar...");
        scanner.nextLine(); // ← Esto esperará a que el usuario presione Enter

        scanner.close();
    }

}
