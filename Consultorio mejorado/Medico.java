//creamos la clase y definimos la herencia
public class Medico extends Persona {
    //definimos los atrivutos, constructores, getters, setters y el toString e inicialisamos los datos heredados
    private String titulo, tipo, jlavoral;

    public Medico(){

    }
    
    public Medico(String nombre, String apellido, int cc, int nhijos, int estrato, String sexo, String direccion,
            String telefono, String tsangre, String scivil, String lnacimiento, double peso, double altura,
            String titulo, String tipo, String jlavoral) {
        super(nombre, apellido, cc, nhijos, estrato, sexo, direccion, telefono, tsangre, scivil, lnacimiento, peso,
                altura);
        this.titulo = titulo;
        this.tipo = tipo;
        this.jlavoral = jlavoral;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getJlavoral() {
        return jlavoral;
    }

    public void setJlavoral(String jlavoral) {
        this.jlavoral = jlavoral;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Medico \n"+super.toString()+"\ntitulo: " + titulo + "\njlavoral: " + jlavoral + "\ntipo: " + tipo ;
    }

    public static Medico busMedico(int cedula){
        Medico med=null;
        for (Medico p : Principal.medicos) {
            if (p.getCc()==cedula){
                med=p;
            }else{
            med=null;
                }
        }
        return med;
    }
}
