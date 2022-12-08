public class Persona {
    //definimos los atrivutos, constructores, getters, setters y el toString que seran heredados
    private String nombre;
    private String apellido; 
    private int cc;
    private int nhijos;
    private int estrato;
    private String sexo;
    private String direccion;
    private String telefono;
    private String tsangre;
    private String scivil;
    private String lnacimiento;
    private double peso;
    private double altura;

    public Persona(){

    }

    public Persona(String nombre, String apellido, int cc, int nhijos, int estrato, String sexo, String direccion,
            String telefono, String tsangre, String scivil, String lnacimiento, double peso, double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cc = cc;
        this.nhijos = nhijos;
        this.estrato = estrato;
        this.sexo = sexo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.tsangre = tsangre;
        this.scivil = scivil;
        this.lnacimiento = lnacimiento;
        this.peso = peso;
        this.altura = altura;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getNhijos() {
        return nhijos;
    }

    public void setNhijos(int nhijos) {
        this.nhijos = nhijos;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTsangre() {
        return tsangre;
    }

    public void setTsangre(String tsangre) {
        this.tsangre = tsangre;
    }

    public String getScivil() {
        return scivil;
    }

    public void setScivil(String scivil) {
        this.scivil = scivil;
    }

    public String getLnacimiento() {
        return lnacimiento;
    }

    public void setLnacimiento(String lnacimiento) {
        this.lnacimiento = lnacimiento;
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
    
    @Override
    public String toString() {
        return "Persona \nnombre: " + nombre + "\napellido: " + apellido + "\ncc: " + cc + "\nnhijosÑ: " + nhijos
            + "nestrato: " + estrato + "\nsexo: " + sexo + "\ndireccion: " + direccion + "\ntelefono: " + telefono
                + "\ntsangre: " + tsangre + "\nscivil: " + scivil + "\nlnacimiento: " + lnacimiento + "\npeso: " + peso
                + "\naltura: " + altura;
    }
}
