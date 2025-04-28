/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_de_casos;

/**
 *
 * @author percy
 */
public class Asistentes {
    private String Nombre;
    private String Apellido_Paterno;
    private String Apellido_Materno;
    private int Edad;
    private int Doc_Identidad;
    private String Tipo_Doc;
    private String Telefono;
    private String Correo;
    private String Categoria;

    public Asistentes(String Nombre, String Apellido_Paterno, String Apellido_Materno, int Edad, int Doc_Identidad, String Tipo_Doc, String Telefono, String Correo, String Categoria) {
        this.Nombre = Nombre;
        this.Apellido_Paterno = Apellido_Paterno;
        this.Apellido_Materno = Apellido_Materno;
        this.Edad = Edad;
        this.Doc_Identidad = Doc_Identidad;
        this.Telefono = Telefono;
        this.Correo = Correo;
    }
    public Asistentes(){}

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre)throws Exception {
        if (Nombre.isBlank()) {
            throw new Exception("El nombre no puede ir vacio");
        }
        this.Nombre = Nombre;
    }

    public String getApellido_Paterno() {
        return Apellido_Paterno;
    }

    public void setApellido_Paterno(String Apellido_Paterno)throws Exception {
        if (Apellido_Paterno.isBlank()) {
            throw new Exception("El apellido Paterno no puede ir vacio");
        }
        this.Apellido_Paterno = Apellido_Paterno;
    }

    public String getApellido_Materno() {
        return Apellido_Materno;
    }

    public void setApellido_Materno(String Apellido_Materno)throws Exception {
        if (Apellido_Materno.isBlank()) {
            throw new Exception("El apelido Materno no puede ir vacio");
        }
        this.Apellido_Materno = Apellido_Materno;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad)throws Exception{
        if (String.valueOf(Edad).isEmpty()) {
            throw new Exception("No puede ir un valor vacio");
        }
        this.Edad = Edad;
    }

    public int getDoc_Identidad() {
        return Doc_Identidad;
    }

    public void setDoc_Identidad(int Doc_Identidad)throws Exception {
        if (String.valueOf(Doc_Identidad).isBlank()) {
            throw new Exception("Este campo no puede ir vacio");
        }
        else if(!(String.valueOf(Doc_Identidad).length() == 8 || String.valueOf(Doc_Identidad).length() == 9)){
            throw new Exception("El Documento de identidad debe llevar 8 o 9 digitos");
        }
        this.Doc_Identidad = Doc_Identidad;
    }

    public String getTipo_Doc() {
        return Tipo_Doc;
    }

    public void setTipo_Doc(String Tipo_doc)throws Exception {
        if (String.valueOf(Doc_Identidad).isBlank()) {
            throw new Exception("Este campo no puede ir vacio");
        }
        this.Tipo_Doc = Tipo_doc;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono){
        if (Telefono.isBlank() || Telefono.isEmpty()) {
            this.Telefono = "Sin Telefono";
        }
        else{
            this.Telefono = Telefono;

        }
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        if (Correo.isBlank() || Correo.isEmpty()) {
            this.Correo = "Sin Correo";
        }
        else{
            this.Correo = Correo;
        }
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
     @Override
    public String toString() {
        return "Nombre: " + Nombre + "  Apellido_Paterno: " + Apellido_Paterno + "  Apellido_Materno: " + Apellido_Materno + "  Edad: " + Edad + "  Doc_Identidad: " + Doc_Identidad + "    Tipo_doc: " + Tipo_Doc + "   Telefono: " + Telefono + "   Correo: " + Correo + "   Categoria: " + Categoria;
    }
    public String MostrarNombreCompletoAsistente(){
        return this.Doc_Identidad + ": " + this.Nombre + " " + this.Apellido_Paterno + " " + this.Apellido_Materno;
    }
    public void Asignar_Categoria(int edad){
        if (edad >= 0 && edad <= 10) {
            this.Categoria = "Niño";
        }
        else if(edad <= 17){
            this.Categoria = "Adolescente";
        }
        else if(edad <= 100){
            this.Categoria = "Adulto";
        }
        else{
            this.Categoria = "Patas arriba";
        }
    }
    public void Identificar_TipoDoc(int NumDoc){
        switch (String.valueOf(NumDoc).length()) {
            case 8:
                this.Tipo_Doc = "DNI";
                break;
            case 9:
                this.Tipo_Doc = "Carnet de Extranjeria";
                break;
            default:
                this.Tipo_Doc = "Te eliminaron de la RENIEC";
                break;
        }
    }
}
