
package lojadino.Principal;
import Conexão.SQL;
import lojadino.Carregamento;
public class LojaDino {
 
    public static void main(String[] args) {
        new Carregamento().setVisible(true); // Iniciar aplicativo, rodar tela de carregamento
        SQL mysql = new SQL();
        mysql.conectaBanco();
        
        
    }
        
}
