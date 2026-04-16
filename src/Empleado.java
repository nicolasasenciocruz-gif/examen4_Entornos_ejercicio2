/**
 * Clase Empleado en la cual tendremos sus atributos y metodos para que se muestren en la clase principal
 */
public class Empleado {
    /**
     * Atributos de la clase Empleado
     */
    private String dni;
    private String nombre;
    private String direccion;
    private String cargo;
    private int numHijos;

    /**
     *  //Getters y setters para obtener los valores o modificarlos
     * @return
     */
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    /**
     * Metodo Empleado que devuelve parametros por defecto como lo son el cargo y numHijos
     * @param dni
     * @param nombre
     */
    public Empleado (String dni, String nombre){
        this.dni=dni;
        this.nombre=nombre;
        this.cargo="EMPLEADO";
        this.numHijos=0;
    }
    /**
     * Metodo que calcula el sueldo dependiendo del tipo de cargo  y la cantidad de hijos
     * @param base
     * @return
     */
    public double calcula_sueldo(double base){
        double total=base;

        if(cargo.equals("ENCARGADO"))
            total+=300;
        else if(cargo.equals("DIRECTOR"))
            total+=1000;
        if(numHijos>=3)
            total+=numHijos*50;
        return total;
    }
    /**
     * Metodo infoEmpleado que muestra la informacion del Empleado
     */
    public void infoEmpleado() {
        System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Número de hijos: " + numHijos);
        System.out.println("Sueldo: " + calcula_sueldo(1200));
    }


}
