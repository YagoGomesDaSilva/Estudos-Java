import java.io.*;
public abstract class Entity implements Serializable {

    Entity(){

    }

    public abstract String toString();

    public abstract String fileNeme();
    public abstract boolean validar();

    private boolean saveFile() throws IOException, ClassNotFoundException {
        if(!(this.validar())){
            return false;
        }else{

            FileOutputStream FILE = new FileOutputStream(new File(this.fileNeme()));
			ObjectOutputStream OBJ = new ObjectOutputStream(FILE);

			// serializando e escrevendo o objeto no arquivo
			OBJ.writeObject(this);

			OBJ.close();
			FILE.close();

			FileInputStream FILE_in = new FileInputStream(new File(this.fileNeme()));
			ObjectInputStream OBJ_in = new ObjectInputStream(FILE_in);

			// deserializando e lendo o arquivo que contem o objeto 
			Entity obj = (Entity) OBJ_in.readObject();

			System.out.println(obj.toString());// escever os atributos dos objetos

			OBJ_in.close();
			FILE_in.close();

            return true;
        }
        
    }

    public boolean salvar() throws IOException, ClassNotFoundException {
        if(this.saveFile()){
            return true;
        }else{
            return false;
        }
    }
}
