package tp4_poo;

public class Empleado {

    private int id;
    private static int contadorId=23;
    private static int totalEmpleados;
    private String nombreCompleto;
    private String puesto;
    private double salarioActual;
    private double salarioDefault = 1000;
    

    public Empleado(int id, String nombreCompleto, String puesto, double salarioActual){
        totalEmpleados++;
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.puesto = puesto;
        this.salarioActual = salarioActual;
    }
    
    public Empleado(String nombreCompleto, String puesto){
        totalEmpleados++;
        contadorId++;
        this.id=contadorId;
        this.nombreCompleto = nombreCompleto;
        this.puesto = puesto;
        this.salarioActual=this.salarioDefault;
    }
    
    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }
    
    public double actualizarSalario (double actualizarSalario){
        this.salarioActual+=actualizarSalario;
        return this.salarioActual;
    }
    
    public double actualizarSalario (int actualizarSalario){
        this.salarioActual=this.salarioActual +(this.salarioActual*
                actualizarSalario/100.0);
        return this.salarioActual;
    }
    
    
    @Override
    public String toString() {
        return "Empleado{" + "id = " + id + ", nombreCompleto = " + nombreCompleto + 
                ", puesto = " + puesto + ", salarioActual = " + salarioActual + '}';
    }
    
    //Getters y setters
    public int getId() {
        return id;
    }
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public String getPuesto() {
        return puesto;
    }
    public double getSalarioActual() {
        return salarioActual;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    }
    
    
    
    
    

