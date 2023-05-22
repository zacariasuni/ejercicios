public class Main {
    public static void main(String[] args) {
        int result;
        result = sumTres(2,6,3);
        System.out.println("el resultado de la suma es " +result);

        coche miCoche = new coche();
        miCoche.numPuertas();
        System.out.println("el numero de puertas es " + miCoche.puertas);

    }
    public static int sumTres(int a, int b, int c){
        return a + b + c;
    }
}

class coche{
    public int puertas = 2;
    public void numPuertas(){
        this.puertas++;
    }

}