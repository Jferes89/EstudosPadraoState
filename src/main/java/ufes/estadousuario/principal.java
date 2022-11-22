package ufes.estadousuario;

import ufes.estadousuario.model.Usuario;
import ufes.estadousuario.presenter.UsuarioPresenter;

public class principal {

	
	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		UsuarioPresenter usuarioBusiness = new UsuarioPresenter(usuario);

		usuarioBusiness.ativar(true);
		usuarioBusiness.cancelar();

	}

}
