/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ender
 */
public class GestorPacientes {
    private final ArrayList<Paciente> pacientes;
	private final Scanner teclado;
	
	public GestorPacientes() {
		pacientes = new ArrayList<>();
		teclado = new Scanner(System.in);
	}
	
	/**
	 * Crea y registra un nuevo paciente.
	 * @return True si se pudo registrar con éxito el nuevo paciente.
	 * False si no fue posible registrarlo.
	 */
	public boolean nuevoPaciente() {
		System.out.println("\n\tALTA NUEVO PACIENTE");
		System.out.print("Introduzca Identificador: ");
		String id = teclado.nextLine();
		System.out.print("Nombre: ");
		String nombre = teclado.nextLine();
		System.out.print("Apellidos: ");
		String apellidos = teclado.nextLine();
		System.out.print("Genero: ");
		String genero = teclado.nextLine();
		System.out.print("Edad: ");
		int edad = teclado.nextInt();
		teclado.nextLine();//Tras leer un int, conviene "limpiar" el stream de entrada, para evitar problemas al querer leer luego datos String
		Paciente nuevoPaciente = new Paciente(id, nombre, apellidos, edad, genero);
		return pacientes.add(nuevoPaciente);//Devuelve TRUE si se insertó correctamente, FALSE si no se pudo insertar
	}
	
	/**
	 * Lista por pantalla los datos de todos los pacientes registrados.
	 */
	public void mostrarPacientes() {
            pacientes.forEach(Paciente::mostrar);
	}

    void modificarPaciente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void borrarPaciente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
