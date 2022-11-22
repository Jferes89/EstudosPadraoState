package ufes.estadousuario.estado;

import ufes.estadousuario.presenter.UsuarioPresenter;

public class StatusUsuario {

	protected UsuarioPresenter usuarioPresenter;
	
	public StatusUsuario(UsuarioPresenter usuarioPresenter) {
		this.usuarioPresenter = usuarioPresenter;
	}
	
	public void ativar() throws Exception{
		throw new Exception("Status invalido"); 
	};
	
	public void cancelar() throws Exception{
		throw new Exception("Status invalido"); 
	};

}
