package cp1ud3.empleados;

public class Empleado {
  // Declaración de los atributos como privados
  private String nombre;
  private int edad;
  private float salario;
  private String direccion;
  private String telefono;
  private String email;
  private String fechaInicio; // Formato: DD/MM/YYYY

  // Constructor sin atributos
  public Empleado() {}
  
  // Constructor con atributos
  public Empleado(String nombre, int edad, float salario, String direccion,
  String telefono, String email, String fechaInicio) {
    // Con this.atrbuto hacemos referencia al atributo de la instancia de clase que estemos manejando
    this.nombre = nombre;
    this.edad = edad;
    this.salario = salario;
    this.direccion = direccion;
    this.telefono = telefono;
    this.email = email;
    this.fechaInicio = fechaInicio;
  }

  // Sobreescribo el método toString() de la clase
  @Override
  public String toString() {
    return "Empleado{" +
          "nombre='" + nombre + '\'' +
          ", edad=" + edad +
          ", salario=" + salario +
          ", direccion='" + direccion + '\'' +
          ", telefono='" + telefono + '\'' +
          ", email='" + email + '\'' +
          ", fechaInicio='" + fechaInicio + '\'' +
          '}';
  }

  // Getters y Setters

  public String getNombre() {
    return nombre;
  }
  public void setNombre(String newNombre) {
    this.nombre = newNombre;
  }

  public int getEdad(){
    return edad;
  }
  public void setEdad(int newEdad) {
    this.edad = newEdad;
  }

  public float getSalario() {
    return salario;
  }
  public void setSalario(float newSalario) {
    this.salario = newSalario;
  }

  public String getDireccion() {
    return direccion;
  }
  public void setDireccion(String newDireccion) {
    this.direccion = newDireccion;
  }

  public String getTelefono() {
    return telefono;
  }
  public void setTelefono(String newTelefono) {
    this.telefono = newTelefono;
  }

  public String getEmail() {
    return email;
  }
  public void setEmail(String newEmail) {
    this.email = newEmail;
  }

  public String getFechaInicio() {
    return fechaInicio;
  }
  public void setFechaInicio(String newFechaInicio) {
    this.fechaInicio = newFechaInicio;
  }
}
