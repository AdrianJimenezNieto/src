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
  public Administrativo(String nombre, int edad, float salario, String direccion,
  String telefono, String email, String fechaInicio, String areaResponsable,
  boolean teletrabajo, boolean horarioFlexible) {
    // Llamada al constructor del padre
    super(nombre, edad, salario, direccion, telefono, email, fechaInicio); 
    this.areaResponsable = areaResponsable;
    this.teletrabajo = teletrabajo;
    this.horarioFlexible = horarioFlexible;
  }

  // Sobreescribo el metodo toString() para facilitar las cosas
  @Override
public String toString() {
    return "Administrativo{" +
          "nombre='" + getNombre() + '\'' +
          ", edad=" + getEdad() +
          ", salario=" + getSalario() +
          ", direccion='" + getDireccion() + '\'' +
          ", telefono='" + getTelefono() + '\'' +
          ", email='" + getEmail() + '\'' +
          ", fechaInicio='" + getFechaInicio() + '\'' +
          ", areaResponsable='" + areaResponsable + '\'' +
          ", teletrabajo=" + teletrabajo +
          ", horarioFlexible=" + horarioFlexible +
          '}';
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
