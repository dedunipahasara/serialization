import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Student implements java.io.Serializable {

  public String stu_Name;
  public String stu_Addr;
  public int stu_Id;

  public static void main(String[] args) {
    Student std = new Student();
    std.stu_Name = "George";
    std.stu_Addr = "ABC,XYZ";
    std.stu_Id = 1;
    try {
      FileOutputStream fileOut = new FileOutputStream("storeObject.txt");
      //Serializing object
      ObjectOutputStream out = new ObjectOutputStream(fileOut);
      out.writeObject(std);
        
      // Close the output stream.
      out.close();
        
      // Close the file.
      fileOut.close();
      System.out.printf("Object serialized");
    } catch (IOException i) {
      i.printStackTrace();
    }
  }
}

