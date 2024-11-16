package AccesoDatos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import Servicios.ServicioIdControl;

/**
 * La clase IdControl gestiona el control de IDs únicos para diferentes archivos.
 * Implementa la interfaz ServicioIdControl y utiliza un archivo de texto para 
 * almacenar y persistir los IDs generados para cada archivo.
 */
public class IdControl implements ServicioIdControl {

    // Nombre del archivo donde se almacenan los IDs de control.
    private final String archivoControl;
    
    // Mapa que asocia un nombre de archivo con su último ID generado.
    private final Map<String, Integer> idMap;

    /**
     * Constructor de la clase IdControl.
     * Inicializa el archivo de control y carga los IDs existentes en memoria.
     * 
     * @throws IOException Si ocurre un error durante la creación o lectura del archivo.
     */
    public IdControl() throws IOException {
        this.archivoControl = "IdControl.txt"; // Nombre del archivo que almacenará los IDs.
        this.idMap = new HashMap<>(); // Mapa para almacenar los IDs en memoria.

        // Crea el archivo de control si no existe.
        java.io.File file = new java.io.File(archivoControl);
        if (!file.exists()) {
            file.createNewFile(); // Crea el archivo vacío.
        }
        loadIds(); // Carga los IDs desde el archivo de control.
    }

    /**
     * Carga los IDs desde el archivo de control en el mapa idMap.
     * 
     * @throws IOException Si ocurre un error durante la lectura del archivo.
     */
    private void loadIds() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(archivoControl))) {
            String line;
            // Lee línea por línea, donde cada línea tiene el formato "nombreArchivo=ID".
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("="); // Divide la línea en nombre de archivo e ID.
                idMap.put(parts[0], Integer.valueOf(parts[1])); // Agrega el par al mapa.
            }
        }
    }

    /**
     * Guarda los IDs actuales del mapa idMap en el archivo de control.
     * 
     * @throws IOException Si ocurre un error durante la escritura en el archivo.
     */
    private void saveIds() throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivoControl))) {
            // Escribe cada entrada del mapa en el archivo con el formato "nombreArchivo=ID".
            for (Map.Entry<String, Integer> entry : idMap.entrySet()) {
                writer.write(entry.getKey() + "=" + entry.getValue());
                writer.newLine(); // Agrega una nueva línea después de cada registro.
            }
        }
    }

    /**
     * Obtiene el siguiente ID disponible para un archivo dado y actualiza el control.
     * 
     * @param fileName Nombre del archivo para el cual se solicita un nuevo ID.
     * @return El siguiente ID disponible para el archivo.
     * @throws IOException Si ocurre un error durante la actualización del archivo de control.
     */
    @Override
    public synchronized int getNextId(String fileName) throws IOException {
        // Obtiene el siguiente ID para el archivo, o 1 si es la primera vez que se solicita.
        int nextId = idMap.getOrDefault(fileName, 1);

        // Actualiza el mapa incrementando el ID para el próximo uso.
        idMap.put(fileName, nextId + 1);

        // Guarda el mapa actualizado en el archivo de control.
        saveIds();

        // Retorna el ID actual.
        return nextId;
    }
}
