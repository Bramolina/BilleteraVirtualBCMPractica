package billetera;

public class BilleteraVirtual {

    public static void  main(String[] args){

        String[]registrarDatos={"Nombre","Apellido","Correo","Usuario","Clave"};
        String []datosUsuarios = new String[5];

        String[]iniciarSesion={"Usuario","Clave"};
        String[]datosInicioSesion=new String[2];

        String billetera= "no";

        while (billetera.equals("no")){

            System.out.println("Seleccione una opcion :\n"+
                    "1. Registrarse \n"+
                    "2. Iniciar sesion \n"+
                    "3. Salir");


             int option=ValidadorDeTipos.ValidarEnteros();
            System.out.println(option);

        switch (option){
            case 1:
                System.out.println("Registrarse");

                System.out.println("Nombre");
                datosUsuarios[0]=ValidadorDeTipos.ValidarString();
                System.out.println("Nombre: "+datosUsuarios[0]);

                System.out.println("Apellido");
                datosUsuarios[1]=ValidadorDeTipos.ValidarString();
                System.out.println("Apellido: "+datosUsuarios[1]);


                System.out.println("Correo");
                datosUsuarios[2]=ValidadorDeTipos.ValidarString();
                System.out.println("Correo: "+datosUsuarios[2]);

                System.out.println("Usuario");
                datosUsuarios[3]=ValidadorDeTipos.ValidarString();
                System.out.println("Usuario: "+datosUsuarios[3]);

                System.out.println("Clave");
                datosUsuarios[4]=ValidadorDeTipos.ValidarString();
                System.out.println("Clave: "+datosUsuarios[4]);
                break;

            case 2:
                System.out.println("Iniciar sesion");
                int i=0;
                boolean sesionIniciada=false;
                do {
                System.out.println("Usuario");
                datosInicioSesion[0]=ValidadorDeTipos.ValidarString();
                System.out.println("Ingrese Usuario:"+datosInicioSesion[0]);

                System.out.println("Clave");
                datosInicioSesion[1]=ValidadorDeTipos.ValidarString();
                System.out.println("Ingrese Clave"+datosInicioSesion[1]);
                if (datosUsuarios[3].equals(datosInicioSesion[0]) && datosUsuarios[4].equals(datosInicioSesion[1])){
                System.out.println("Bienvenido: "+datosUsuarios[0]+" "+datosUsuarios[1]);
                sesionIniciada=true;

            }else {
                System.out.println("Datos incorrectos");
            }
                i++;
                }while(i<3 && !sesionIniciada);

            break;

            case 3:
                System.out.println("Salir");
                System.out.println("Desea salir?");
                billetera=ValidadorDeTipos.ValidarString();
                break;
            default:
                System.out.println("Ingrese una opcion valida");
          }
        }
    }
































}

