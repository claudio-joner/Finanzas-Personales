package Servicios.Interfaces;

import Dominio.Usuario;

public interface IUsuarioService {
    Usuario CrearUsuario(String nombre, String apellido, double monto_cuenta, double objetivo_ahorro);
    Usuario BuscarUsuario(int id_usuario);
    Usuario ModificarUsuario(int id_usuario);
    Usuario EliminarUsuario(int id_usuario);

}
