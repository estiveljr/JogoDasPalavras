package embaralhadores;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeiaCVS {


  public static List<String> run(String caminho) {
   String line = null;
    BufferedReader stream = null;
    List<String> csvData = new ArrayList<String>();

    try {
        stream = new BufferedReader(new FileReader(caminho)); // Podes usar BufferedReader ao invés do CSVReader 
        try {
			while ((line = stream.readLine()) != null) {
			    String[] splitted = line.split(";"); // Provavelmente teu separador é , ou ; depende do teu arquivo
			    List<String> dataLine = new ArrayList<String>(splitted.length); // Note que assim ele irá pegar todas as colunas, independente de quantas
			    for (String data : splitted)
			        dataLine.add(data);
			        csvData.addAll(dataLine);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    } catch (FileNotFoundException e) {
		System.out.println("O caminho digitado não se refere a nenhum arquivo CSV. Favor digitar o caminho novamente");
		//e.printStackTrace();
	} finally {
        if (stream != null)
			try {
				stream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    }

    return csvData;
  }

}