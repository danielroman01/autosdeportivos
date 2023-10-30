package Entidad;


public class Persona {
    
    public String nombre;
    public int edad;
    public String sexo;
    public double peso;
    public double altura;
    public boolean x;

    public Persona() {
    }

    public Persona(boolean x) {
        this.x = x;
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean isX() {
        return x;
    }

    public void setX(boolean x) {
        this.x = x;
    }
    
    
    
    public void comprobarSexo(String sexo){
        boolean x;
        if (sexo.equals("m")||sexo.equals("f")||sexo.equals("o")) {
            
            System.out.println("El sexo ingresado es correcto");
            
            x= false;
            
        }else{
            System.out.println("Error al ingresar el dato");
            x = true;
        }
        
    }
}