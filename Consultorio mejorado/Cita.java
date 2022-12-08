public class Cita {
    //definimos los atrivutos, constructores, getters, setters y el toString
    private int cita, medico, consultorio, paciente, medicamento;
    private String fecha, sintomas;

    public Cita(){

    }

    public Cita(int cita, int medico, int paciente, String sintomas, int consultorio, int medicamento, String fecha) {
        this.cita = cita;
        this.medico = medico;
        this.consultorio = consultorio;
        this.paciente = paciente;
        this.sintomas = sintomas;
        this.medicamento = medicamento;
        this.fecha = fecha;
    }

    public int getCita() {
        return cita;
    }

    public void setCita(int cita) {
        this.cita = cita;
    }

    public int getMedico() {
        return medico;
    }

    public void setMedico(int medico) {
        this.medico = medico;
    }

    public int getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(int consultorio) {
        this.consultorio = consultorio;
    }

    public int getPaciente() {
        return paciente;
    }

    public void setPaciente(int paciente) {
        this.paciente = paciente;
    }

    public int getMedicamento() {
        return medicamento;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public void setMedicamento(int medicamento) {
        this.medicamento = medicamento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Cita \ncita: " + cita + "\nmedico: " + medico +"\npaciente: " + paciente
                + "\nconsultorio: " + consultorio +  "\nmedicamento: " + medicamento + "\nfecha: " + fecha;
    }
 
    public static Cita bCita(int id){
        Cita cita=null;
        for (Cita p : Principal.citas) {
            if (p.getCita()==id){
                cita=p;
            }else{
            cita=null;
                }
        }
        return cita;
    }
}
