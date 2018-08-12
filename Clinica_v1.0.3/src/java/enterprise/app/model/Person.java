package enterprise.app.model;

public class Person {
   
   // Attributes
   private String cedula;
   private String clave;
   private int stado;
   private int idRol;

   // Constructor method
   public Person() {
   }

   // Methods
   public String getCedula() {
      return cedula;
   }

   public void setCedula(String cedula) {
      this.cedula = cedula;
   }

   public String getClave() {
      return clave;
   }

   public void setClave(String clave) {
      this.clave = clave;
   }

   public int getStado() {
      return stado;
   }

   public void setStado(int stado) {
      this.stado = stado;
   }

   public int getIdRol() {
      return idRol;
   }

   public void setIdRol(int idRol) {
      this.idRol = idRol;
   }
}
