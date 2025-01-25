package com.itsqmet.historialClinica.Entidad;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;


@AllArgsConstructor
@NoArgsConstructor
public class Entidad {

    @Size(min = 3, max = 50)
    private String nombre;

    @Min(10)
    @Max(80)
    private Integer edad;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String fechaNacimiento;

    @NotBlank
    @Email(message = "El correo electrónico no es válido")
    private String email;

    @Size(min = 10, max = 150)
    private String domicilio;

    @Size(min = 1, max = 10)
    private String telefono;

    @Size(min = 3, max = 50)
    private String alergias;

    @NotBlank
    private String enfermedadOp;

    @Size(min = 10, max = 150)
    private String description;

    @Size(min = 10, max = 150)
    private String medicacion;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String nextvisit;

    @DateTimeFormat(pattern = "HH:mm:ss")
    private String hora;

    @Size(min = 10, max = 150)
    private String direccionClinica;

    @Size(min = 3, max = 50)
    private String nombreDr;

    @Max(value = 100)
    @Min(value = 5)
    private Long precio;



    ///Getters y Setters


    public @Size(min = 3, max = 50) String getNombre() {
        return nombre;
    }

    public void setNombre(@Size(min = 3, max = 50) String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public @NotBlank @Email(message = "El correo electrónico no es válido") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank @Email(message = "El correo electrónico no es válido") String email) {
        this.email = email;
    }

    public @Size(min = 3, max = 50) String getAlergias() {
        return alergias;
    }

    public void setAlergias(@Size(min = 3, max = 50) String alergias) {
        this.alergias = alergias;
    }

    public @Size(min = 10, max = 150) String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(@Size(min = 10, max = 150) String domicilio) {
        this.domicilio = domicilio;
    }

    public @Size(min = 1, max = 10) String getTelefono() {
        return telefono;
    }

    public void setTelefono(@Size(min = 1, max = 10) String telefono) {
        this.telefono = telefono;
    }

    public @NotBlank String getEnfermedadOp() {
        return enfermedadOp;
    }

    public void setEnfermedadOp(@NotBlank String enfermedadOp) {
        this.enfermedadOp = enfermedadOp;
    }

    public @Size(min = 10, max = 150) String getDescription() {
        return description;
    }

    public void setDescription(@Size(min = 10, max = 150) String description) {
        this.description = description;
    }

    public @Size(min = 10, max = 150) String getMedicacion() {
        return medicacion;
    }

    public void setMedicacion(@Size(min = 10, max = 150) String medicacion) {
        this.medicacion = medicacion;
    }


    public String getNextvisit() {
        return nextvisit;
    }

    public void setNextvisit(String nextvisit) {
        this.nextvisit = nextvisit;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public @Size(min = 10, max = 150) String getDireccionClinica() {
        return direccionClinica;
    }

    public void setDireccionClinica(@Size(min = 10, max = 150) String direccionClinica) {
        this.direccionClinica = direccionClinica;
    }

    public @Max(value = 100) @Min(value = 5) Long getPrecio() {
        return precio;
    }

    public void setPrecio(@Max(value = 100) @Min(value = 5) Long precio) {
        this.precio = precio;
    }

    public @Size(min = 3, max = 50) String getNombreDr() {
        return nombreDr;
    }

    public void setNombreDr(@Size(min = 3, max = 50) String nombreDr) {
        this.nombreDr = nombreDr;
    }

    public @Min(10) @Max(80) Integer getEdad() {
        return edad;
    }

    public void setEdad(@Min(10) @Max(80) Integer edad) {
        this.edad = edad;
    }
}
