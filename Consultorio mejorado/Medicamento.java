public class Medicamento {
    //definimos los atrivutos, constructores, getters, setters y el toString
    private int id;
    private String dosis, nombre;

    public Medicamento(){

    }

    public Medicamento(int id, String nombre, String dosis) {
        this.id = id;
        this.nombre = nombre;
        this.dosis = dosis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Medicamento \nid: " + id + "\ndosis: " + dosis + "\nnombre: " + nombre;
    }

    public static Medicamento buMed(int id){
        Medicamento medi=null;
        for (Medicamento p : Principal.medicamentos) {
            if (p.getId()==id){
                medi=p;
            }else{
            medi=null;
                }
        }
        return medi;
    }
}
