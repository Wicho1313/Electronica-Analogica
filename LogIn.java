import java.util.Scanner;
public class LogIn{
	public static void main(String args []){
		String usuario ="",contra="",usuario2 ="",contra2="";
		Scanner entrada = new Scanner(System.in);
		int opc=0;
		do{
		System.out.println("Elige una opcion: ");
		System.out.println("1.- Registrarse: ");
		System.out.println("2.- Iniciar sesion: ");
		opc=entrada.nextInt();
		switch(opc)
		{
			case 1:
					System.out.print("Crea un nombre de usuario: ");
					usuario=entrada.nextLine();
					System.out.print("Crea una contraseña: ");
					contra=entrada.nextLine();
					System.out.print("Registrado con exito");
			break;
			case 2:
		System.out.println("Dame el nombre de usuario: ");
		usuario2=entrada.nextLine();
		System.out.println("Ingresa tu contraseña: ");
		contra2=entrada.nextLine();

		if(usuario2.equals(usuario) && contra.equals(contra)){
			System.out.print("Inicio de sesion correcto ");
		}
		else{
			System.out.print("Nombre de usuario o contraseña incorrectos ");
		}
			break;
			default:
			System.out.print("La opcion que elegiste no existe ");
			break;
		}
		}while(opc!=2);
		
	}
}