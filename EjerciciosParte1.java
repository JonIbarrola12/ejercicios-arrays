public class EjerciciosParte1 {
    //1
    public static int numMasGrande(int[] nums){
        int max = -1;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        return max;
    }
    //2
    public static int indiceNumMasGrande(int[] nums){
        int max=-1,ind=0;
        for(int i=0; i<nums.length;i++){
            if (max<nums[i]){
                max=nums[i];
                ind=i;
            }
        }
        return ind;
    }
    //3
    public static int[] Fibonacci(){
        int num1=0, num2=1;
        int[] fibonacci = new int[10];
        for(int i=0; i<10;i++){
            fibonacci[i]=num1;
            num2=num2+num1;
            num1=num2-num1;
        }
        return fibonacci;
    }
    //4
    public static int finNum4(int[] nums){
        int cont=0,num=0;
        for(int i=0;i<nums.length;i++){
            num=nums[i]%10;
            if(num==4){
                cont++;
            }
        }
        return cont;
    }
    //5
    public static int contNumMax(int[] nums){
        int cont = 0;
        int max = -1;
        for(int i=0; i<nums.length; i++){
            if(max<nums[i]){
                max=nums[i];
                cont=1;
            }
            if(max==nums[i]){
                cont++;
            }
        }
        return cont;
    }
    //6
    public static double mediaArray(int[] nums){
        int cont = 0, suma = 0;
        double media = 0;
        for(int i=0; i<nums.length;i++){
            cont++;
            suma+=nums[i];
        }
        if (cont!=0) {
            media = suma/cont;
        }
        return media;
    }
    //7
    public static int numMasDigitos(int[] nums){
        int num=0,ind=0,digitos=0,max=0;
        for(int i=0; i<nums.length;i++){
            num=nums[i];
            while (num>0){
                num=num/10;
                digitos++;
            }
            if(max<digitos){
                max=digitos;
                ind=i;
            }
            digitos=0;
        }
        return ind;
    }
    //8
    public static int numSumaDigitosMax(int[] nums){
       int num=0,ind=0,sum=0,max=0;
        for(int i=0; i<nums.length;i++){
            num=nums[i];
            while (num>0){
                sum+=num%10;
                num=num/10;
            }
            if(max<sum){
                max=sum;
                ind=i;
            }
            sum=0;
        }
        return ind; 
    }
    public static void main(String[] args) {
        int num1;
        double num2;
        int array[]=new int[20];
        int[] nums = {10,465,7,35,5,67,31,2000,4,14};
        num1 = numMasGrande(nums);
        System.out.println(num1);
        num1 = indiceNumMasGrande(nums);
        System.out.println(num1);
        array = Fibonacci();
        for(int i=0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        num1 = finNum4(nums);
        System.out.println(num1);
        num1 = contNumMax(nums);
        System.out.println(num1);
        num2 = mediaArray(nums);
        System.out.println(num2);
        num1 = numMasDigitos(nums);
        System.out.println(num1);
        num1 = numSumaDigitosMax(nums);
        System.out.println(num1);
    }
}