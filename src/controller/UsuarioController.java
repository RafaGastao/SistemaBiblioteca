import dao.UsuarioDao;
import model.Usuario;
import java.util.List;

public class UsuarioController {

    private UsuarioDao usuarioDao = new UsuarioDao();

    public void cadastrarUsuario(String nome, String matricula, String endereco){

        Usuario usuario = new Usuario();

        usuario.setNome(nome);
        usuario.setMatricula(matricula);
        usuario.setEndereco(endereco);

        usuarioDao.cadastrarUsuario(usuario);

        System.out.println("Usuário cadastrado com sucesso!");
    }

    public List<Usuario> listarUsuarios(){
        return usuarioDao.listarUsuarios();
    }
}