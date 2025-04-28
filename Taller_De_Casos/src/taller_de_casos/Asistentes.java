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
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
    
    
    
    
    
}
