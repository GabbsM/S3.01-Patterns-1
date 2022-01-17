
import java.util.ArrayList;

public class Undo {

    private static Undo und;
    private Undo(){

    }

    public static Undo getUndo(){
        if(und == null){
            und = new Undo();
        }return und;
    }

    ArrayList<String> comandos = new ArrayList<>();

    public  void agregarComando(String comando){
        comandos.add(comando);
    }

    public void eliminarComando(String comando){
        comandos.remove(comando);
    }

    public void mostrarComandos(){
        for (int i = 0; i < comandos.size(); i++) {
            System.out.println(comandos.get(i));

        }
    }

}