import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

/**
 * proba
 * trajce
 * @author uros
 */

public abstract class MyExporter {

    protected String fileName;


    public MyExporter() {
    }

    public abstract String initStorage(String path) throws IOException;

    public abstract void save(String sourceFilePath, String destinationFilePath) throws IOException;

    public abstract void createFolder(String path) throws IOException;

    public abstract void createFile(String path) throws IOException;

    public abstract void deleteFolder(String path) throws IOException;

    public abstract void deleteFile(String path) throws IOException;

    public abstract void read(String path) throws IOException;

    public abstract void moveFile(String sourceFilePath , String destinationFilePath) throws IOException;

    public abstract void lastModified(String path) throws IOException;

    public abstract boolean downloadFile(String sourceFilePath) throws IOException;

    public abstract boolean connect(String username,String password,String path) throws IOException;

    public abstract String disconnect();

    public abstract void createUser(String username, String pasword, String kategorija, String path) throws IOException;

    public abstract List<User> ucitajJson(String path) throws IOException;


    public abstract void sacuvajJson(String path, User user) throws IOException;

    public abstract void konfiguracioniFajl(String path, Long velicina,String imeFoldera, Integer brojFajlova , String zabrana);

    public abstract void setStorageSize(Long velicina);

    public abstract void setRestrictedxtensions(String restrictions);

    public abstract void setFolderRestriction(String folderName,Integer broj);



    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public abstract String meni();
}