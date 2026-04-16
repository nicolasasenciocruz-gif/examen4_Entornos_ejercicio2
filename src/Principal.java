
public class Principal {
    /**
     * Clase principal en la cual se muestra la informacion del Empleado a traves de su metodo
     */
    public static void main(String[] args) {
        /**
         * Insertamos los parametros para luego imprimirlos atraves del metodo infoEmpleado()
         */
            Empleado empleado = new Empleado("44885522R", "Juan Gómez");
            empleado.infoEmpleado();
    }

}
