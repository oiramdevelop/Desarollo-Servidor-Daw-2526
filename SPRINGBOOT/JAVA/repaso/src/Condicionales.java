public class Condicionales {
    public static void main(String[] args) throws Exception {
       
        int edad = 18;
        String marca= "Peugeout";
        float potencia =135.4f;
        int numero=3;

    
        //Solo podrá conducir si es mayor de edad y 
        //el coche es de menos de 140cv de potencia
        if (edad>=18 && potencia<140)
        {
            System.out.println("Enhorabuena conduces un " + marca);
        }
        else
        System.out.println("No tienes permiso para conducir");






    }
}
