/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author ender
 */
public class Testclinica {
    static GestorPacientes pacientes = new GestorPacientes();

	public static void main(String[] args) {
		
		pacientes.nuevoPaciente();
		pacientes.nuevoPaciente();
		pacientes.mostrarPacientes();
		pacientes.modificarPaciente();
		pacientes.mostrarPacientes();
		pacientes.borrarPaciente();
		pacientes.mostrarPacientes();

	}
}
