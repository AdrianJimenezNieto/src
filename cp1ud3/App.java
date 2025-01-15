package cp1ud3;
// Importamos las clases Empleado, Informático, Administrativo y Contable
import cp1ud3.empleados.*;

public class App {
  public static void main(String[] args) {
      // Creamos instancia de Empleado con constructor con parámetros
      Empleado empleado1 = new Empleado(
          "Sofía Martínez", 45, 4000.00f, "Calle Rayo 404",
          "1010101010", "sofia.martinez@email.com", "2015-06-15"
      );

      // Creamos instancia de Empleado con constructor sin parámetros
      Empleado empleado2 = new Empleado();
      empleado2.setNombre("Luis Fernández");
      empleado2.setEdad(50);
      empleado2.setSalario(3800.00f);
      empleado2.setDireccion("Calle Trueno 505");
      empleado2.setTelefono("2020202020");
      empleado2.setEmail("luis.fernandez@email.com");
      empleado2.setFechaInicio("2010-04-20");

      // Mostrar datos de Empleado
      System.out.println("Instancias de Empleado:");
      System.out.println(empleado1);
      System.out.println(empleado2);

      // Creamos al igual que con empleado instancias del resto de clases
      Contable contable1 = new Contable(
          "Juan Pérez", 35, 3000.50f, "Calle Luna 123",
          "123456789", "juan.perez@email.com", "2020-01-15",
          "Finanzas", "CPA, IFRS", 150000.75f
      );
      Administrativo admin1 = new Administrativo(
          "Ana López", 28, 2500.00f, "Calle Sol 456",
          "987654321", "ana.lopez@email.com", "2021-05-10",
          "Recursos Humanos", true, false
      );
      Informatico informatico1 = new Informatico(
          "Carlos Gómez", 30, 3500.00f, "Calle Estrella 789",
          "1122334455", "carlos.gomez@email.com", "2019-03-25",
          "Java", "Spring, Hibernate", "Senior"
      );

      System.out.println("\nInstancias creadas con constructor con parámetros:");
      System.out.println(contable1);
      System.out.println(admin1);
      System.out.println(informatico1);

      // Crear instancias usando setters como con empleado
      Contable contable2 = new Contable();
      contable2.setNombre("Laura Martínez");
      contable2.setEdad(40);
      contable2.setSalario(2800.00f);
      contable2.setDireccion("Calle Cometa 101");
      contable2.setTelefono("667788990");
      contable2.setEmail("laura.martinez@email.com");
      contable2.setFechaInicio("2018-02-01");
      contable2.setEspecialidad("Contabilidad Internacional");
      contable2.setCertificaciones("CIA");
      contable2.setBalanceGestionado(120000.00f);

      System.out.println("\nInstancias creadas con constructor sin parámetros:");
      System.out.println(contable2);

      Informatico informatico2 = new Informatico();
      informatico2.setNombre("Juan Garcia");
      informatico2.setEdad(28);
      informatico2.setSalario(3400.00f);
      informatico2.setDireccion("Calle Venus 303");
      informatico2.setTelefono("4433221100");
      informatico2.setEmail("lucia.fernandez@email.com");
      informatico2.setFechaInicio("2020-07-01");
      informatico2.setLenguajeDominante("Python");
      informatico2.setTecnologias("Django, Flask");
      informatico2.setNivelExperiencia("Intermedio");

      System.out.println(informatico2);

      Administrativo admin2 = new Administrativo();
      admin2.setNombre("Laura Martínez");
      admin2.setEdad(40);
      admin2.setSalario(2800.00f);
      admin2.setDireccion("Calle Cometa 101");
      admin2.setTelefono("667788990");
      admin2.setEmail("laura.martinez@email.com");
      admin2.setFechaInicio("2018-02-01");
      admin2.setAreaResponsable("Contabilidad Internacional");
      admin2.setTeletrabajo(true);
      admin2.setHorarioFlexible(true);

      System.out.println(admin2);
  }
}
