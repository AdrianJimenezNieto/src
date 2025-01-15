package cp1ud3.empleados;

// Al declarar la clase le decimos que extiende (hereda de) la clase padre Empleado
public class Contable extends Empleado {
  // Declaración de atributos privados
  private String especialidad;
  private String certificaciones; // Refleja la formacion profesional
  private float balanceGestionado; // Monto qu el contable administra

  // Constructor sin atributos
  public Contable() {}

  // Constructor con atributos
  public Contable(String nombre, int edad, float salario, String direccion,
  String telefono, String email, String fechaInicio, String especialidad,
  String certificaciones, float balanceGestionado) {
    // Llamada al constructor del padre
    super(nombre, edad, salario, direccion, telefono, email, fechaInicio); 
    this.especialidad = especialidad;
    this.certificaciones = certificaciones;
    this.balanceGestionado = balanceGestionado;
  }

  // Sobreescribimos el metodo toString() de la calse así sera más facil mostrar resultados
  @Override
  public String toString() {
      return "Contable{" +
            "nombre='" + getNombre() + '\'' +
            ", edad=" + getEdad() +
            ", salario=" + getSalario() +
            ", direccion='" + getDireccion() + '\'' +
            ", telefono='" + getTelefono() + '\'' +
            ", email='" + getEmail() + '\'' +
            ", fechaInicio='" + getFechaInicio() + '\'' +
            ", especialidad='" + especialidad + '\'' +
            ", certificaciones='" + certificaciones + '\'' +
            ", balanceGestionado=" + balanceGestionado +
            '}';
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
    return balanceGestionado;
  }
  public void setBalanceGestionado(float newBalanceGestionado) {
    this.balanceGestionado = newBalanceGestionado;
  }
}