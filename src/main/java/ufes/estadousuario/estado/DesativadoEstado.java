package ufes.estadousuario.estado;

import ufes.estadousuario.presenter.UsuarioPresenter;

public class DesativadoEstado extends StatusUsuario{

	public DesativadoEstado(UsuarioPresenter usuarioPresenter) {
		super(usuarioPresenter);
		this.usuarioPresenter.getUsuario().setStatus("Desativado");
		System.out.println("Usuario " + this.usuarioPresenter.getUsuario().getStatus());
	}
	
	@Override
	public void ativar() throws Exception{
		this.usuarioPresenter.getUsuario().setStatus("Ativado");
		this.usuarioPresenter.setStatus(new AtivoEstado(usuarioPresenter));
	};
}
