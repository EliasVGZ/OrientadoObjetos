package orientadoObjetos;

public class alumno {

    //Atributos
    //nombre, dni o nivelAcademico

    public String nombre;
    public String dni;
    private String nivelAcademico;

    public static String atributoEstatico;

    //Metodos
    //Metodos como resolverExamen, matricularse
    public alumno(String s){

    }

    public alumno(String nombre, String dni, String nivelAcademico) {
        this.nombre = nombre;
        this.dni = dni;
        this.nivelAcademico = nivelAcademico;
    }

    public String getNivelAcademico() {
        return nivelAcademico;
    }

    public void setNivelAcademico(String nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }

    //public/private (static o no) void /int/String..nombre(parametros que necesitemos){..}
    public void resolverEXAMEN(String enunciado){
        System.out.println("Está resolviendo el exámen siguiente: " +enunciado);
    }
    public void matricularse(String modulo){
        System.out.println("MAatriculandose en el modulo siguiente: "+modulo);
    }



}
