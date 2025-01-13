package cp1ud3.empleados;

// Al declarar la clase le decimos que extiende (hereda de) la clase padre Empleado
public class Contable extends Empleado {
  // Declaración de atributos privados
  private String especialidad;
  private String certificaciones; // Refleja la formacion profesional
  private float balanceGesionado; // Monto qu el contable administra

  // Constructor sin atributos
  public Contable() {}

  // Constructor con atributos
  public Contable(String nombre, int edad, float salario, String especialidad, String certificaciones, float balanceGestionado) {
    super(nombre, edad, salario); // Llamada al constructor padre
    this.especialidad = especialidad;
    this.certificaciones = certificaciones;
    this.balanceGesionado = balanceGestionado;
  }

  // Getters y Setters
  public String getEspecialidad() {
    return especialidad;
  }
  public void setEspecialidad(String newEspecialidad) {
    this.especialidad = newEspecialidad;
  }

  public String getCertificaciones() {
    return certificaciones;
  }
  public void setCertificaciones(String newCertificaciones){
    this.certificaciones = newCertificaciones;
  }

  public float getBalanceGestionado() {
    return balanceGesionado;
  }
  public void setBalanceGestionado(float newBalanceGestionado) {
    this.balanceGesionado = newBalanceGestionado;
  }
}