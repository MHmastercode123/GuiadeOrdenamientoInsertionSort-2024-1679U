public class InsertionSort{
    public static void main(String[] args) throws Exception {
    System.out.println("hola , uso del insertion sort");

    System.out.println(" arreglo insertado (sin ordenar) ");

        int [] pop = {5,6,8,1,3,10};
        for (int VO : pop )
        System.out.print(VO+ " ");

        System.out.println();
    
    System.out.println("------------------------------------");
    
    ordenamiento(pop);
    
    System.out.println(" arreglo con el metodo de orden (ordenado)");
        
        for(int VO : pop){
            System.out.print(VO+ " ");
        }



    }

    public static void ordenamiento(int [] pop ){
        
        int x = pop.length;
        
        for (int q = 1 ; q < x; q++){
        int lol = pop[q];
        int z = q - 1;

        while (z >= 0 && pop[z]> lol) {
            pop[z + 1] = pop[z];
            z--;
        }
        pop[z + 1]= lol;



        }




    }


}

