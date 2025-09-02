package TP3_IntroduccionaPOO;

public class NaveEspacial {
    
    private static final int AVANCE_METROS = 1000;       
    private static final double CONSUMO_COMBUSTIBLE = 50;
    private static final int LITROS=500;

    private String idNave;
    private double cantCombustible;
    private int distancia=0;
    
    public void setIdNave(String id){
        idNave=id;
    }
    
    public void setCantCombustible (double combustible){
        if (combustible<=LITROS){
            cantCombustible=combustible;
        }else{
            System.out.println("\n Ha superado el limite de carga. ");
        }
    }
    
    public void recargarCombustible(double cantidad){
        if (cantidad>0 && (cantCombustible + cantidad <=LITROS)){
            cantCombustible+=cantidad;
            System.out.println("\n Se han recargado "+cantidad+" litros.");
        }else{
            System.out.println("\n Ha superado el limite de carga. ");
        }
    }

    public void despegue(){
        if (cantCombustible>=CONSUMO_COMBUSTIBLE){
            System.out.println("\n La nave ha despegado. ");
            cantCombustible-=CONSUMO_COMBUSTIBLE;
            distancia+=AVANCE_METROS;
        }else{
            System.out.println("\n Combustible insuficiente para despegar.");
        }
    }
    
    public void avanzar(){
        if (cantCombustible>=CONSUMO_COMBUSTIBLE){
            System.out.println("\n Avanzando 1000 metros. ");
            distancia+=AVANCE_METROS;
            cantCombustible-=CONSUMO_COMBUSTIBLE;
        }else{
            System.out.println("\n La nave no tiene suficiente combustible. ");
        }
    }
    public void mostrarEstado(){
    System.out.println("\nLa nave "+idNave+" tiene "+cantCombustible+" litros "
            + "de combustible y ha avanzado en total "+distancia+" metros.");
    }
    
}
