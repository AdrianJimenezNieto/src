package cp1ud3.empleados;

// Al declarar la clase le decimos que extiende (hereda de) la clase padre Empleado
public class Administrativo extends Empleado {
  // Declaración de atributos privados
  private String areaResponsable;
  private boolean teletrabajo; // Por si teletrabaja
  private boolean horarioFlexible; // Por si tiene horario flexible

  // Constructor sin atributos
  public Administrativo() {}

  // Constructor con atributos
  public Administrativo(String nombre, int edad, float salario, String areaResponsable, boolean teletrabajo, boolean horarioFlexible) {
    super(nombre, edad, salario); // Llamada al constructor del padre
    this.areaResponsable = areaResponsable;
    this.teletrabajo = teletrabajo;
    this.horarioFlexible = horarioFlexible;
  }

  // Getters y Setters
  public String getAreaResponsable() {
    return areaResponsable;
  }
  public void setAreaResponsable(String newAreaResponsable) {
    this.areaResponsable = newAreaResponsable;
  }

  public boolean getHorarioFlexible() {
    return horarioFlexible;
  }
  public void setHorarioFlexible(boolean newHorarioFlexible) {
    this.horarioFlexible = newHorarioFlexible;
  }

  public boolean getTeletrabajo() {
    return teletrabajo;
  }
  public void setTeletrabajo(boolean newTeletrabajo) {
    this.teletrabajo = newTeletrabajo;
  }
}
