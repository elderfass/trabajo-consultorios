//creamos la clase y definimos la herencia
public class Paciente extends Persona{
    //definimos los atrivutos, constructores, getters, setters y el toString y inicialisamos los datos heredados
    private String tafiliacion, eps;
    public Paciente(){

    }

    public Paciente(String nombre, String apellido, int cc, int nhijos, int estrato, String sexo, String direccion,
            String telefono, String tsangre, String scivil, String lnacimiento, double peso, double altura,
            String tafiliacion, String eps) {
        super(nombre, apellido, cc, nhijos, estrato, sexo, direccion, telefono, tsangre, scivil, lnacimiento, peso,
                altura);
        this.tafiliacion = tafiliacion;
        this.eps = eps;
    }

    public String getTafiliacion() {
        return tafiliacion;
    }

    public void setTafiliacion(String tafiliacion) {
        this.tafiliacion = tafiliacion;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }



    @Override
    public String toString() {
        return "Paciente \n"+super.toString()+"\ntafiliacion: " + tafiliacion + "\neps: " + eps;
    }

    public static Paciente buscarpas(int cedula1){
        Paciente pas1=null;
        for (Paciente p : Principal.pacientes) {
            if (p.getCc()==cedula1){
                pas1=p;
            }else{
            pas1=null;
                }
        }
        return pas1;
    }
}