package cp1ud3.empleados;

// Al declarar la clase le decimos que extiende (hereda de) la clase padre Empleado
public class Informatico extends Empleado {
  // Declaración de atributos privados
  private String lenguajeDominante;
  private String tecnologias; // Para las tecnologias que domina
  // Este atributo tecnologias podria ser una lista de strings, pero lo voy a dejar asi para simplificar
  private String nivelExperiencia; // Para clarificar (ej.: junior, senior,...)

  // Constructor sin atributos
  public Informatico() {}

  // Constructor con atributos
  public Informatico(String nombre, int edad, float salario, String direccion, 
  String telefono, String email, String fechaInicio, String lenguajeDominante, 
  String tecnologias, String nivelExperiencia) {
    super(nombre, edad, salario, direccion, telefono, email, fechaInicio); // Llamada al constructor del padre
    this.lenguajeDominante = lenguajeDominante;
    this.tecnologias = tecnologias;
    this.nivelExperiencia = nivelExperiencia;
  }

  // Sobreescribimos el metodo toString() de la clase
  @Override
  public String toString() {
      return "Informatico{" +
            "nombre='" + getNombre() + '\'' +
            ", edad=" + getEdad() +
            ", salario=" + getSalario() +
            ", direccion='" + getDireccion() + '\'' +
            ", telefono='" + getTelefono() + '\'' +
            ", email='" + getEmail() + '\'' +
            ", fechaInicio='" + getFechaInicio() + '\'' +
            ", lenguajeDominante='" + lenguajeDominante + '\'' +
            ", tecnologias='" + tecnologias + '\'' +
            ", nivelExperiencia='" + nivelExperiencia + '\'' +
            '}';
  }

  // Getters y Setters
  public String getLenguajeDominante() {
    return lenguajeDominante;
  }
  public void setLenguajeDominante(String newLenguajeDominante) {
    this.lenguajeDominante = newLenguajeDominante;
  }

  public String getTecnologias() {
    return tecnologias;
  }
  public void setTecnologias(String newTecnologias) {
    this.tecnologias = newTecnologias;
  }

  public String getNivelExperiencia() {
    return nivelExperiencia;
  }
  public void setNivelExperiencia(String newNivelExperiencia) {
    this.nivelExperiencia = newNivelExperiencia;
  }
}
