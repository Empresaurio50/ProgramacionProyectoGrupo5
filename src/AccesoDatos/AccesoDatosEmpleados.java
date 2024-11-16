/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Empresaurio50
 */
public class AccesoDatosEmpleados {

    private String nombreArchivo, registro;
    private ArrayList<String[]> listaEmpleados;

    public AccesoDatosEmpleados() {

    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public ArrayList<String[]> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<String[]> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public void agregarEmpleadoRegistro() throws IOException {

        try (BufferedWriter objAgregarRegistro = new BufferedWriter(new FileWriter(this.nombreArchivo, true))) {

            objAgregarRegistro.append(registro);
            objAgregarRegistro.newLine();

        }

    }

    public void leerEmpleadoRegistro() throws IOException {

        listaEmpleados = new ArrayList();

        try (BufferedReader objLeerRegistro = new BufferedReader(new FileReader(this.nombreArchivo))) {

            String lineaEmpleado = "";
            while ((lineaEmpleado = objLeerRegistro.readLine()) != null) {

                String[] datosEmpleados = lineaEmpleado.split(",");

                this.listaEmpleados.add(datosEmpleados);

            }

        }

    }

    public void actualizarEmpleadoRegistro(int id) throws IOException {

        File archivoActual = new File(this.nombreArchivo);
        File archivoTemporal = new File("temp_" + this.nombreArchivo);

        try (BufferedReader bR = new BufferedReader(new FileReader(archivoActual)); BufferedWriter bW = new BufferedWriter(new FileWriter(archivoTemporal, true))) {

            String registroActual;
            while ((registroActual = bR.readLine()) != null) {
                String[] datos = registroActual.split(",");
                if (datos[0].equals(String.valueOf(id))) {
                    bW.append(this.registro);
                    bW.newLine();
                } else {
                    bW.append(registroActual);
                    bW.newLine();

                }

            }

        }
        if (!archivoActual.delete()) {

            throw new IOException("No se puede borrar el archivo actual");

        }

        if (!archivoTemporal.renameTo(archivoActual)) {
            throw new IOException("No se puede renombrear el archivo actual");

        }

    }

    public void eliminarEmpleadoRegistro(int id) throws IOException {

        File archivoActual = new File(this.nombreArchivo);
        File archivoTemporal = new File("temp_" + this.nombreArchivo);

        try (BufferedReader bR = new BufferedReader(new FileReader(archivoActual)); BufferedWriter bW = new BufferedWriter(new FileWriter(archivoTemporal))) {

            String registroActual;

            while ((registroActual = bR.readLine()) != null) {

                String[] datos = registroActual.split(",");

                if (datos[0].equals(String.valueOf(id))) {

                    continue;

                } else {

                    bW.append(registroActual);
                    bW.newLine();

                }

            }
            

        }
        if (!archivoActual.delete()) {

                throw new IOException("No se puede borrar el archivo actual");

            }

            if (!archivoTemporal.renameTo(archivoActual)) {
                throw new IOException("No se puede renombrear el archivo actual");

            }

    }

}
