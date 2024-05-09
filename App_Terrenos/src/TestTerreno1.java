import java.util.Scanner;
public class TestTerreno {
    public static void main(String[] args) {
        Scanner tc = new Scanner (System.in);
        Terreno arrayTerrenos [] = new Terreno[2];
        int i =0;
        String opcion;
        while(true){
            System.out.print("Dam el alto,ancho y valor del metro cuadrado :");
            arrayTerrenos[i]= new Terreno(tc.nextDouble(),tc.nextDouble(),tc.nextDouble());
            //arrayTerrenos[i].calcularArea();
            //arrayTerrenos[i].calcularCostoFinal();
            //System.out.println(arrayTerrenos[i]);
            i++;
            System.out.println("Quieres mas terrenos (S/N)");
            opcion=tc.next();
            if (opcion.equals("N") || (i>=arrayTerrenos.length) )break;
            System.out.println("Los terrenois calculados son :");
            for(Terreno terreno : arrayTerrenos ){
                terreno.calcularArea();
                terreno.calcularCostoFinal();
                System.out.println(terreno);
            }
      
        /*Terreno arrayTerrenos [] = {new Terreno(10,3,2),
                                    new Terreno(20,10,4),
                                    new Terreno(40,10,2)};
        for(Terreno terreno: arrayTerrenos ){
            terreno.calcularArea();
            terreno.calcularCostoFinal();
            System.out.println(terreno);
        }
        
        /*Terreno t1 = new Terreno(40, 10, 2);
        Terreno t2 = new Terreno(21, 12, 2);
        Terreno t3 = new Terreno(10, 10, 2);
        Terreno arrayTerreno [] = new Terreno [3];
        arrayTerreno[0]= t1;
        arrayTerreno[1]= t2;
        arrayTerreno[2]= t3;
        
        
        /*for(Terreno terreno : arrayTerreno){
            terreno.calcularArea();
            terreno.calcularCostoFinal();
            System.out.println(terreno);
        }
            
        /*for (int i = 0; i < arrayTerreno.length; i++) {
            arrayTerreno[i].calcularArea();
            arrayTerreno[i].calcularCostoFinal();
            System.out.println(arrayTerreno[i]);
        }*/                
    }
  }
}