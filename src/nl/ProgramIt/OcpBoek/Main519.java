package nl.ProgramIt.OcpBoek;

import javax.swing.*;
import javax.xml.transform.sax.SAXSource;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;

/**
 * Created by baddi on 1-3-2016.
 */
public class Main519 {
    public static void main(String[] args) {
        Path path=Paths.get("d:/ocp/java/examen.pdf");
        Path path1=Paths.get("d:\\ocp\\java\\examen.pdf");
        FileSystems.getDefault().getPath("d:/ocp/java/examen.pdf");
        System.out.println(path);
        File file =new File("Hallo.txt");
        Path p=file.toPath();
        System.out.println(p);
        JOptionPane.showMessageDialog(null,path.toString());


    }

}
