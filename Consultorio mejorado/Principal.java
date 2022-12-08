//importamos el ArrayList y el Scanner de el paquete java.util
import java.util.ArrayList;
import java.util.Scanner;

public class Principal{
    //declaramos e inicialisamos los ArraryList y el Scanner que utilisaremos
    public static Scanner comver = new Scanner(System.in);
    //declaramos los ArrayList para que sean de tipo coleccion
    public static ArrayList<Cita> citas=new ArrayList<>();
    public static ArrayList<Paciente> pacientes=new ArrayList<>();
    public static ArrayList<Medico> medicos=new ArrayList<>();
    public static ArrayList<Medicamento> medicamentos=new ArrayList<>();
    public static ArrayList<Consultorio> consultorios=new ArrayList<>();
    //declaramos el metodo mein
    public static void main(String[] args) {
        //enviamos datos a los ArraiList para provar el codigo
        pacientes.add(new Paciente("jose joaquin", "gomez parado", 123543, 3, 2, "cra 12 #8-5 pelaya", "+57 310 5432834", "maculino", "B+", "divorciado", "paya", 32, 1.64, "subcidiado", "nueva eps"));
        medicos.add(new Medico("martin jose", "jis sentado", 12342632, 0, 3, "masculino", "cra 20 #20-3 aguachica", "+57 320 46223345 ", "O-", "casado", "aguachica", 45, 1.34, "cirujao", "cardiologo", "mañana"));
        consultorios.add(new Consultorio(1234, "2B"));
        medicamentos.add(new Medicamento(123, "jesacartimadesilcina", "2g al dia"));
        //definimos un do while para solicitar la accion que el usuario desea realisar
        do{
            //llamamos el metodo menu() y solicitamos datos
            menu();
            int op=comver.nextInt();
            //validamos los datos con un switch
            switch(op){
                case 1:
                //creamos un while para que se repitan la solicitud de datos
                    int pf=0;
                    while(pf==0){
                        //mostramos el metodo men() y solicitamos los datos
                        System.out.println("paciente");
                        men();
                        int opc1=comver.nextInt();
                        comver.nextLine();
                        //validamos loa datos
                        switch(opc1){
                            case 1:
                                //solicitamos loa datos aingresar
                                Persona np=llenar();
                                System.out.println("afiliacion");
                                String tafiliacion=comver.nextLine();
                                System.out.println("eps");
                                String eps=comver.nextLine();
                                pacientes.add(new Paciente(np.getNombre(), np.getApellido(), np.getCc(), np.getNhijos(), np.getEstrato(), np.getSexo(), np.getDireccion(), np.getTelefono(), np.getTsangre(), np.getScivil(), np.getLnacimiento(), np.getPeso(), np.getAltura(), tafiliacion, eps));        
                                System.out.println(pacientes);        
                                
                            break;
                            case 2:
                                //validamos que el ArrayList no este vacio
                                if (pacientes.isEmpty()){
                                    System.out.println("no hay datos registrados");
                                }else{
                                    //solicitamos el dato que se decea buscar
                                    System.out.println("ingrese la cedula de el paciente");
                                    int cedula=comver.nextInt();
                                    //llamamos el metodo buscar corresponfdiente y le enviamos el dato solicitado y lo almacenmos en ua variable de tipo collecion
                                    Paciente pas=Paciente.buscarpas(cedula);
                                    //validamos que el dato almacenado no sea nulo
                                    if (pas!=null){
                                        //mostramos los datos 
                                        Paciente P=pacientes.get(pacientes.indexOf(pas));
                                        System.out.println(P.toString());
                                        
                                    }else{
                                        System.out.println("el pasiente no existe");
                                    }
                                }

                            break;
                            case 3:
                                //repetimos el proseso de busqueda y validacion
                                if (pacientes.isEmpty()){
                                    System.out.println("no hay datos registrados");
                                }else{
                                    System.out.println("ingrese la cedula de el paciente");
                                    int cedula1=comver.nextInt();
                                    Paciente pas1=Paciente.buscarpas(cedula1);
                                    if (pas1!=null){
                                        //mostramos los datos que se pueden editar y solicitamos el dato a editar
                                            System.out.println("1. nombre: "+pas1.getNombre()+" "+pas1.getApellido());
                                            System.out.println("3. numero de hijos: "+ pas1.getNhijos());
                                            System.out.println("4. estrato: "+pas1.getEstrato());
                                            System.out.println("5. direccion: "+pas1.getDireccion());
                                            System.out.println("6. telefono: "+pas1.getTelefono());
                                            System.out.println("7. estado civil: "+pas1.getScivil());
                                            System.out.println("8. peso: "+pas1.getPeso());
                                            System.out.println("9. afiliacion: "+pas1.getTafiliacion());
                                            System.out.println("10. EPS: "+pas1.getEps());
                                            System.out.println("que dato desea actualizar");
                                            int dato=comver.nextInt();
                                            //validamos la respuesta
                                            switch(dato){
                                                //solicitamos el nuevo dato y usamos el set para actualizarlo en cada caso
                                                case 1:
                                                    comver.nextLine();
                                                    System.out.println("ingrese el nuevo nombre");
                                                    String nnombre=comver.nextLine();
                                                    pas1.setNombre(nnombre);
                                                    System.out.println("ingrese el nuevo apellido");
                                                    String napellido=comver.nextLine();
                                                    pas1.setApellido(napellido);
                                                break;
                                                case 2:
                                                    comver.nextLine();
                                                    System.out.println("ingrese el nuevo dato");
                                                    int nchijos=comver.nextInt();
                                                    pas1.setNhijos(nchijos);
                                                break;
                                                case 3:
                                                    comver.nextLine();
                                                    System.out.println("ingrese el nuevo estrato");
                                                    int nestrato=comver.nextInt();
                                                    pas1.setEstrato(nestrato);
                                                break;
                                                case 4:
                                                    comver.nextLine();
                                                    System.out.println("ingrese la nueva direccion");
                                                    String ndireecion=comver.nextLine();
                                                    pas1.setDireccion(ndireecion);
                                                break;
                                                case 5:
                                                    comver.nextLine();
                                                    System.out.println("ingrese el nuevo numero de contacto");
                                                    String ncontacto=comver.nextLine();
                                                    pas1.setTelefono(ncontacto);
                                                break;
                                                case 6:
                                                    comver.nextLine();
                                                    System.out.println("ingrese el nuevo estado civil");
                                                    String nscivil=comver.nextLine();
                                                    pas1.setScivil(nscivil);
                                                break;
                                                case 7:
                                                    comver.nextLine();
                                                    System.out.println("ingrese el nuevo peso");
                                                    double npeso=comver.nextDouble();
                                                    pas1.setPeso(npeso);
                                                break;
                                                case 8:
                                                    comver.nextLine();
                                                    System.out.println("ingrese la nueva afiliacion");
                                                    String nafil=comver.nextLine();
                                                    pas1.setTafiliacion(nafil);
                                                break;
                                                case 9:
                                                    comver.nextLine();
                                                    System.out.println("ingrese la nueva EPS");
                                                    String neps=comver.nextLine();
                                                    pas1.setEps(neps);
                                                break;
                                                default:
                                                    System.out.println("opcion no valida");
                                                break;
                                            }System.out.println("dato actualizado");
                                    } else{
                                        System.out.println("el paciente no existe");
                                    }
                                }
                            break;
                            case 4:
                                //valiadmos y buscamos
                                if (pacientes.isEmpty()){
                                    System.out.println("no hay datos registrados");
                                }else{
                                    System.out.println("ingrese la cedula de el paciente");
                                    int cedula1=comver.nextInt();
                                    Paciente pas3=Paciente.buscarpas(cedula1);
                                    if (pas3!=null){
                                        //unamos el remove() para remover el dato encontrado
                                        pacientes.remove(pas3);
                                        System.out.println("pasiente eliminado");
                                    }else{
                                        System.out.println("el paciente no existe");
                                    }
                                }
                            break;
                            case 5:
                                //le sumamos 1 a la variable para dar fin a el bucle while
                                pf+=1;
                            break;
                            //validmos que la opcion dada este dentro de el rango deseado
                            default:
                                System.out.println("opcion no valida");
                            break;
                        }
                    }
                break;
                //repetimos los prosesos de paciente con doctor
                case 2:
                    int fdoc=0;
                    while(fdoc==0){
                        System.out.println("doctor");
                        men();
                        int opc2=comver.nextInt();
                        switch(opc2){
                            case 1:
                                comver.nextLine();
                                Persona np=llenar();
                                System.out.println("titulo");
                                String titulo=comver.nextLine();
                                System.out.println("tipo");
                                String tipo=comver.nextLine();
                                System.out.println("jorada");
                                String jlavoral=comver.nextLine();

                                medicos.add(new Medico(np.getNombre(), np.getApellido(), np.getCc(), np.getNhijos(), np.getEstrato(), np.getSexo(), np.getDireccion(), np.getTelefono(), np.getTsangre(), np.getScivil(), np.getLnacimiento(), np.getPeso(), np.getAltura(), titulo, tipo, jlavoral));
                                System.out.println(medicos);
                            break;
                            
                            case 2:
                                if (medicos.isEmpty()){
                                    System.out.println("no hay datos registrados");
                                }else{
                                    System.out.println("ingrese la cedula de el medico");
                                    int cedula=comver.nextInt();
                                    Medico medi=Medico.busMedico(cedula);
                                    if (medi!=null){
                                        Medico M=medicos.get(medicos.indexOf(medi));
                                        System.out.println(M.toString());
                                    }else{
                                        System.out.println("el medico no existe");
                                    }
                                }
                            break;
                            case 3:
                                if (medicos.isEmpty()){
                                    System.out.println("no hay datos registrados");
                                }else{
                                    System.out.println("ingrese la cedula de el medico");
                                    int cedula1=comver.nextInt();
                                    Medico pas1=Medico.busMedico(cedula1);
                                    if (pas1!=null){
                                        System.out.println("1. nombre: "+pas1.getNombre()+" "+pas1.getApellido());
                                        System.out.println("2. numero de hijos: "+ pas1.getNhijos());
                                        System.out.println("3. estrato: "+pas1.getEstrato());
                                        System.out.println("4. direccion: "+pas1.getDireccion());
                                        System.out.println("5. telefono: "+pas1.getTelefono());
                                        System.out.println("6. estado civil: "+pas1.getScivil());
                                        System.out.println("7. peso: "+pas1.getPeso());
                                        System.out.println("8. jornada: "+pas1.getJlavoral());
                                        System.out.println("que dato desea actualizar");
                                        int dato=comver.nextInt();
                                        switch(dato){
                                            case 1:
                                                comver.nextLine();
                                                System.out.println("ingrese el nuevo nombre");
                                                String nnombre=comver.nextLine();
                                                pas1.setNombre(nnombre);
                                                System.out.println("ingrese el nuevo apellido");
                                                String napellido=comver.nextLine();
                                                pas1.setApellido(napellido);
                                            break;
                                            case 2:
                                                comver.nextLine();
                                                System.out.println("ingrese el nuevo dato");
                                                int nchijos=comver.nextInt();
                                                pas1.setNhijos(nchijos);
                                            break;
                                            case 3:
                                                comver.nextLine();
                                                System.out.println("ingrese el nuevo estrato");
                                                int nestrato=comver.nextInt();
                                                pas1.setEstrato(nestrato);
                                            break;
                                            case 4:
                                                comver.nextLine();
                                                System.out.println("ingrese la nueva direccion");
                                                String ndireecion=comver.nextLine();
                                                pas1.setDireccion(ndireecion);
                                            break;
                                            case 5:
                                                comver.nextLine();
                                                System.out.println("ingrese el nuevo numero de contacto");
                                                String ncontacto=comver.nextLine();
                                                pas1.setTelefono(ncontacto);
                                            break;
                                            case 6:
                                                comver.nextLine();
                                                System.out.println("ingrese el nuevo estado civil");
                                                String nscivil=comver.nextLine();
                                                pas1.setScivil(nscivil);
                                            break;
                                            case 7:
                                                comver.nextLine();
                                                System.out.println("ingrese el nuevo peso");
                                                double npeso=comver.nextDouble();
                                                pas1.setPeso(npeso);
                                            break;
                                            case 8:
                                                comver.nextLine();
                                                System.out.println("ingrese la nueva jornada");
                                                String njornada=comver.nextLine();
                                                pas1.setJlavoral(njornada);
                                            break;
                                            default:
                                                System.out.println("opcion no valida");
                                            break;
                                        }
                                            System.out.println("dato actualizado");
                                    } else{
                                        System.out.println("el medico no existe");
                                    }
                                }
                            break;
                            case 4:
                                if (medicos.isEmpty()){
                                    System.out.println("no hay datos registrados");
                                }else{
                                    System.out.println("ingrese la cedula de el medico");
                                    int cedula2=comver.nextInt();
                                    Medico med=Medico.busMedico(cedula2);
                                    if(med!=null){
                                        medicos.remove(med);
                                        System.out.println("medico eliminado");
                                    }else{
                                      System.out.println("el medico no existe");
                                    }
                                }
                                break;
                            case 5:
                                fdoc+=1;
                            break;
                            default:
                                System.out.println("opcion no valida");
                        }
                    }
                break;
                //repetimos los pasos con medicamento
                case 3:
                    int fmed=0;
                        while(fmed==0){
                            System.out.println("medicamento");
                            men();
                            int opc3=comver.nextInt();
                            switch(opc3){
                                case 1:
                                    System.out.println("id");
                                    int id=comver.nextInt();
                                    comver.nextLine();
                                    System.out.println("nombre");
                                    String nombbre=comver.nextLine();
                                    System.out.println("dosis");
                                    String dosis=comver.nextLine();
                                    medicamentos.add(new Medicamento(id, nombbre, dosis));
                                break;
                                case 2:
                                    if (medicamentos.isEmpty()){
                                        System.out.println("no hay datos registrados");
                                    }else{
                                        System.out.println("registrar");
                                        System.out.println("ingrese el id");
                                        int idm=comver.nextInt();
                                        Medicamento medic=Medicamento.buMed(idm);                                   
                                        if(medic!=null){
                                            Medicamento Me=medicamentos.get(medicamentos.indexOf(medic));
                                            System.out.println(Me.toString());
                                        }else{
                                            System.out.println("el medicamento no existe");
                                        }
                                    }
                                break;
                                case 3:
                                    if (medicamentos.isEmpty()){
                                        System.out.println("no hay datos registrados");
                                    }else{
                                        System.out.println("actualizar\n");
                                        System.out.println("ingrese el id");
                                        int idm1=comver.nextInt();
                                        Medicamento med=Medicamento.buMed(idm1);
                                        if (med.getId()==idm1){
                                            comver.nextLine();
                                            System.out.println("ingrese los nuevos datos");
                                            System.out.println("nombre");
                                            String nombre=comver.nextLine();
                                            System.out.println("dosis");
                                            String dosisn=comver.nextLine();
                                            med.setNombre(nombre);
                                            med.setDosis(dosisn);
                                        }else{
                                                System.out.println("el medicamento no exite");
                                        } 
                                    }
                                break;
                                case 4:
                                    if (medicamentos.isEmpty()){
                                        System.out.println("no hay datos registrados");
                                    }else{
                                        System.out.println("borrar");
                                        System.out.println("ingrese el id");
                                        int idm2=comver.nextInt();
                                        Medicamento med=Medicamento.buMed(idm2);
                                        if (med!=null){
                                            medicamentos.remove(med);
                                            System.out.println("medicamento eliminado");
                                        }else{
                                            System.out.println("el medicamento no existe");
                                        }
                                    }
                                break;
                                case 5:
                                    fmed+=1;
                                break;
                                default:
                                    System.out.println("opcion no valida");
                                break;
                            }
                        }
                break;
                //repetimos los mismos pasos con consultorio
                case 4:
                        int m=0;
                        while(m==0){
                            System.out.println("consultirio");
                            men();
                            int opc4=comver.nextInt();
                            switch(opc4){
                                case 1:
                                    System.out.println("registrar");
                                    System.out.println("id");
                                    int id=comver.nextInt();
                                    comver.nextLine();
                                    System.out.println("nombre");
                                    String nombre=comver.nextLine();
                                    consultorios.add(new Consultorio(id, nombre));
                                    System.out.println(consultorios);
                                break;
                                case 2:
                                    if (consultorios.isEmpty()){
                                        System.out.println("no hay datos registrados");
                                    }else{
                                        System.out.println("buscar");
                                        System.out.println("ingrese el id de el consultorio");
                                        int id1=comver.nextInt();
                                        Consultorio con=Consultorio.bCon(id1);
                                        if (con!=null){
                                            Consultorio C=consultorios.get(consultorios.indexOf(con));
                                            System.out.println(C.toString());
                                        }else{
                                            System.out.println("el consultorio no existe");
                                        }
                                    }
                                break;
                                case 3:
                                    if (consultorios.isEmpty()){
                                        System.out.println("no hay datos registrados");
                                    }else{
                                        System.out.println("actualizar");
                                        System.out.println("ingrese el id");
                                        int id2=comver.nextInt();
                                        Consultorio buscar2=Consultorio.bCon(id2);
                                        if (buscar2!=null){
                                            System.out.println("ingrese ingrese los nuevos datos");
                                            System.out.println("id");
                                            int nid=comver.nextInt();
                                            comver.nextLine();
                                            System.out.println("nombre");
                                            String nnombre=comver.nextLine();
                                            buscar2.setId(nid);
                                            buscar2.setNombre(nnombre);
                                        }else{
                                            System.out.println("el id ingresado no existe");
                                        }
                                    }
                                break;
                                case 4:
                                    if (consultorios.isEmpty()){
                                        System.out.println("no hay datos registrados");
                                    }else{
                                        System.out.println("borrar");
                                        System.out.println("ingrese el id");
                                        int buscar3=comver.nextInt();
                                        Consultorio con=Consultorio.bCon(buscar3);
                                        if (con!=null){
                                            consultorios.remove(con);
                                            System.out.println("consultorio elimiado con exito");
                                        }else{
                                            System.out.println("el consultorio no existe");
                                        }
                                    }
                                break;
                                case 5:
                                    m+=1;
                                break;
                                default:
                                    System.out.println("opcion no valida");
                                break;
                            }
                        }
                break;
                //declaramos el caso 5 de la cita
                case 5:
                int idc, idpa, idcon, idmedi;
                int fcita=0;
                while(fcita==0){
                    //solicitamos accion a realizar
                    System.out.println("cita");
                    men();
                    int opc5=comver.nextInt();
                    switch(opc5){
                        case 1:
                            //validamos que los ArrayList no esten vacios
                            if ((pacientes.isEmpty())&&(medicos.isEmpty())&&(consultorios.isEmpty())&&(medicamentos.isEmpty())){
                                System.out.println("no hay datos registrados");
                            }else{
                                //solicitamos datos y los buacamos en los Arraylist ya declarados
                                comver.nextLine();
                                System.out.println("ingrese la fecha");
                                String fecha=comver.nextLine();
                                System.out.println("ingrese el id");
                                idc=comver.nextInt();
                                System.out.println("ingrese el id de el medico");
                                int idme=comver.nextInt();
                                Medico cmMedico=Medico.busMedico(idme);
                                System.out.println("ingrese el id de el paciente");
                                idpa=comver.nextInt();
                                Paciente cPaciente=Paciente.buscarpas(idpa);
                                comver.nextLine();
                                System.out.println("ingrese los sintomas");
                                String sintomas=comver.nextLine();
                                System.out.println("ingrese el id de el consultorio");
                                idcon=comver.nextInt();
                                Consultorio ccon=Consultorio.bCon(idcon);
                                System.out.println("ingrese el id de el medicamento recetado");
                                idmedi=comver.nextInt();
                                Medicamento cmedi=Medicamento.buMed(idmedi);
                                //validamos que los datos ingresados existan en loa ArrayList
                                if ((cmMedico!=null)&&(cPaciente!=null)&&(ccon!=null)&&(cmedi!=null)){
                                    //enviamos los datos a el AarrayList citas
                                    citas.add(new Cita(idc, idme, idpa, sintomas, idcon, idmedi, fecha));
                                    System.out.println("registro exitoso");
                                }else{
                                    System.out.println("alguno de los datos ingresados no existe");
                                    System.out.println("por favor verifique los datos ingresados e intentelo de nuevo");
                                }
                                
                            }
                        break;
                        case 2:
                            if (citas.isEmpty()){
                                System.out.println("no hay datos registrados");
                            }else{
                                System.out.println("ingrese el id");
                                int id=comver.nextInt();
                                Cita cit=Cita.bCita(id);
                                if (cit!=null){
                                    Paciente Pas=Paciente.buscarpas(cit.getPaciente());
                                    System.out.println("paciente: "+ Pas.getNombre()+"\nEPS: "+ Pas.getEps()+"\nafiliacion: "+ Pas.getTafiliacion());
                                    Medico Med=Medico.busMedico(cit.getMedico());
                                    System.out.println("medico: "+ Med.getNombre()+"\ntitulo: "+ Med.getTitulo()+"\ntipo: "+Med.getTipo());
                                    System.out.println("sintomas: "+ cit.getSintomas());
                                    Consultorio Con=Consultorio.bCon(cit.getConsultorio());
                                    System.out.println("consultorio: "+ Con.getNombre());
                                    Medicamento Medi=Medicamento.buMed(cit.getMedicamento());
                                    System.out.println("medicamento: "+ Medi.getNombre()+ "\ndosis: "+ Medi.getDosis());
                                }else{
                                    System.out.println("la cita jamas se realiso");
                                }
                            }
                        break;
                        case 3:
                            System.out.println("no sepueden editar los datos de las citas");
                        break;
                        case 4:
                            if (citas.isEmpty()){
                                System.out.println("no hay datos registrados");
                            }else{
                                System.out.println("ingrese el id de la cita");
                                int ide=comver.nextInt();
                                Cita cita=Cita.bCita(ide);
                                if (cita!=null){
                                    citas.remove(cita);
                                    System.out.println("se elimino la cita con exito");
                                }
                            }
                        break;
                        case 5:
                            fcita+=1;
                        break;
                        default:
                            System.out.println("opcion no valida");
                        break;
                    }
                }
                break;
                case 6:
                    System.exit(0);
                break;
                default:
                    System.out.println("opcion no valida");
                break;
            }
        }while(true);
    }

    public static void menu(){
        System.out.println("1. paciente");
        System.out.println("2. doctor");
        System.out.println("3. medicamento");
        System.out.println("4. consultorio");
        System.out.println("5. cita");
        System.out.println("6. salir");
    } 

    public static void men(){
        System.out.println("1. registrar");
        System.out.println("2. buscar");
        System.out.println("3. actualizar");
        System.out.println("4. borrar");
        System.out.println("5. salir");
    }

    public static Persona llenar(){
        System.out.println("nombre");
        String nombre=comver.nextLine();
        System.out.println("apellido");
        String apellido=comver.nextLine();
        System.out.println("cc");
        int cc=comver.nextInt();
        System.out.println("numero de hijos");
        int nhijos=comver.nextInt();
        System.out.println("estrato");
        int estrato=comver.nextInt();
        comver.nextLine();
        System.out.println("direccion");
        String direccion=comver.nextLine();
        System.out.println("telefono");
        String telefono=comver.nextLine();
        System.out.println("sexo");
        String sexo=comver.nextLine();
        System.out.println("tipo de sangre");
        String tsangre=comver.nextLine();
        System.out.println("estado civil");
        String scivil=comver.nextLine();
        System.out.println("lugar de nacimiento");
        String lnacimiento=comver.nextLine();
        System.out.println("peso");
        double peso=comver.nextDouble();
        System.out.println("altura");
        double altura=comver.nextDouble();
        comver.nextLine();
        return new Persona(nombre, apellido, cc, nhijos, estrato, sexo, direccion, telefono, tsangre, scivil, lnacimiento, peso, altura);
    }
}