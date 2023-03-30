import java.io.IOException;
import java.nio.file.Files;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        Path rutaArchivo = Paths.get("pronostico.csv");

        List<String> listString;
        listString = Files.readAllLines(rutaArchivo);

        System.out.println(listString);

        Path rutaArchivo2 = Paths.get("resultados.csv");

        List<String> listString2;
        listString2 = Files.readAllLines(rutaArchivo2);

        System.out.println(listString2);
    }

    }

