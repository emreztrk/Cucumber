package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_ApachePOI_Start {
    public static void main(String[] args) throws IOException {

        // dosyanın yolunu değişkene atalım
        String path="src/test/java/ApachePOI/resource/ApacheExcel2.xlsx";

        // JavaDosya okuma işlemcisine dosyanın yolunu veriyoruz.
        // böylece program ile dosya arasında bağlantı oluştu

        FileInputStream fileReadingConnection=new FileInputStream(path);

        Workbook workbook= WorkbookFactory.create(fileReadingConnection);

        //istediğim isimdeki çalışma sayfasını alıyorum
        Sheet calismaSayfasi = workbook.getSheet("Sheet1");

        //istenen Satırı alıyorum
        Row satir=calismaSayfasi.getRow(0);

        Cell hucre=satir.getCell(0);

        System.out.println(hucre);




    }
}
