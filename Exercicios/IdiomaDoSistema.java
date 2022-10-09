import java.util.*;

public class IdiomaDoSistema 
{
    public static void main(String[] args) 
    {
        Locale loc = Locale.getDefault();
        System.out.println (loc.getDisplayLanguage()); // imprime "Português"
        System.out.println (loc.getLanguage()); // imprime "pt"
    }
}
