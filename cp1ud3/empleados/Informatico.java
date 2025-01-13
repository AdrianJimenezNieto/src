package cp1ud3.empleados;

// Al declarar la clase le decimos que extiende (hereda de) la clase padre Empleado
public class Informatico extends Empleado {
  // Declaración de atributos privados
  private String lenguajeDominante;
  private String tecnologías; // Para las tecnologías que domina
  private String nivelExperiencia; // Para clarificar (ej.: junior, senior,...)

  // Constructor sin atributos
  public Informatico() {}

  // Constructor con atributos
  public Informatico(String nombre, int edad, float salario, String lenguajeDominante) {
    super(nombre, edad, salario); // Llamada al constructor del padre
    this.lenguajeDominante = lenguajeDominante;
  }

  // Getters y Setters
  public String getLenguajeDominante() {
    return lenguajeDominante;
  }
  public void setLenguajeDominante(String newLenguajeDominante) {
    this.lenguajeDominante = newLenguajeDominante;
  }

  public String getTecnologias() {
    return tecnologías;
  }
  public void setTecnologias(String newTecnologias) {
    this.tecnologías = newTecnologias;
  }

  public String getNivelExperiencia() {
    return nivelExperiencia;
  }
  public void setNivelExperiencia(String newNivelExperiencia) {
    this.nivelExperiencia = newNivelExperiencia;
  }
}
