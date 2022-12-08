public class Consultorio {
    //definimos los atrivutos, constructores, getters, setters y el toString
    private int id;
    private String nombre;

    public Consultorio(){

    }

    public Consultorio(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Consultorio \nid: " + id + "\nnombre: " + nombre;
    }
    
    public static Consultorio bCon(int id){
        Consultorio con=null;
        for (Consultorio p : Principal.consultorios) {
            if (p.getId()==id){
                con=p;
            }else{
            con=null;
                }
        }
        return con;
    }
}
