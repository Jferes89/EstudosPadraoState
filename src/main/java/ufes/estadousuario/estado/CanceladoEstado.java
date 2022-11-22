package ufes.estadousuario.estado;

import ufes.estadousuario.presenter.UsuarioPresenter;

public class CanceladoEstado extends StatusUsuario {

	public CanceladoEstado(UsuarioPresenter usuarioPresenter) {
		super(usuarioPresenter);
		System.out.print("Usuario " + this.usuarioPresenter.getUsuario().getStatus());
	}
}
