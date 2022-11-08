package orientadoObjetos;

public class principal {

    public static void main(String[] args){


        // Declaramos unha variable da clase Alumno chamada alumno1
        alumno alumno1 = new alumno("pepe, 2342342Y, secundaria"); // Creamos un obxecto instancia de Alumno e asignámolo a esa variable


        alumno1.setNivelAcademico("universitario");
        String a = alumno1.getNivelAcademico();// Asignamos á variable a o valor do atributo nivelAcademico do obxecto alumno1
        System.out.println("nivel Academico " +a);

        alumno1.resolverEXAMEN("Examen de programacion");   // Invocamos ao método resolverExame do obxecto alumno1 para que se execute

        alumno alumno2 = new alumno("pepe", "234234234Y", "secundaria");
        String b =alumno2.getNivelAcademico();
        System.out.println("alumno2: nivel academico " +b);





    }
}
