import java.io.File;
import java.io.IOException;
import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

 public class ExcelToJava {
  private String inputFile;
  
  public void setInputFile(String inputFile) {
   this.inputFile = inputFile;
  }
  
  public void read() throws IOException{
   File inputWorkbook = new File(inputFile);
   Workbook w;
  try {
   w = Workbook.getWorkbook(inputWorkbook);
   // Get the first sheet
   Sheet sheet = w.getSheet(0);
   //loop over first 10 column and lines
   
   for(int j= 0;j<sheet.getRows();j++){
    for (int i=0;i<sheet.getColumns(); i++) {
     Cell cell = sheet.getCell(i,j);
     CellType type = cell.getType();
     
     if(type == CellType.LABEL) {
      System.out.println("Nombre: " + cell.getContents());
     }
     
     if(type == CellType.NUMBER) {
      System.out.println("Cedula: " + cell.getContents());
     }
    }
   }
   
   } catch(BiffException e) {
    e.printStackTrace();
  }
  


  }
  
  public static void main(String[] args) throws IOException {
   ExcelToJava test= new ExcelToJava();
   test.setInputFile("C:\\Users\\Clases\\workspace\\Apis\\src\\prueba.xls");
   test.read();
  }
  
  
 }
 



