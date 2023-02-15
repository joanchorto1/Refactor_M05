
public class AccesPersones_Refaccio {
    public static void main(String[] args) {
        Persona persona1 = new Persona(11,"Manuel Alfonseca");
        Persona persona2 = new Persona(25,"John Carmack");
        calculAcces(persona1);
        calculAcces(persona2);
    }

    /**
     * Funcio que calcula si una Persona X pot passar o no.
     * Comprova si la persona.edat es major a 18 o si es menor.
     * En cas de ser major retorna un pot passar, en cas de ser menor, retorna un NO pot passar.
     * @param persona
     */
    private static void calculAcces(Persona persona) {
        if (persona.edat > 18) {
            System.out.println(persona.nom+" pot passar");
        } else {
           System.out.println(persona.nom + "no pat passar");
        }
    }
}

