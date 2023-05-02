package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _04_ApachePOI_GetAllData {
    public static void main(String[] args) throws IOException {

        String path="src/test/java/ApachePOI/resource/ApacheExcel2.xlsx";

        FileInputStream inputStream=new FileInputStream(path);

        Workbook workbook= WorkbookFactory.create(inputStream);
        Sheet sheet=workbook.getSheetAt(0);

        // 1. YOL
        // çalışma sayfasındaki fiziksel kullanılan toplam satır sayısını veriyor.
        int rowCount=sheet.getPhysicalNumberOfRows(); // length gibi

        for (int i = 0; i < rowCount; i++) {

            Row row=sheet.getRow(i);
            int cellCount=row.getPhysicalNumberOfCells(); //[i].length gibi

            for (int j = 0; j < cellCount; j++) {
                Cell cell=row.getCell(j);
                System.out.print(cell+"\t");
            }

            System.out.println();
        }

        // 2. YOL

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

            for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
                System.out.print(sheet.getRow(i).getCell(j)+"\t");  //[i][j] gibi oldu
            }

            System.out.println();
        }




    }
}
