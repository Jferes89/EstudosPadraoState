package ufes.estadousuario.estado;

import ufes.estadousuario.presenter.UsuarioPresenter;

public class AtivoEstado extends StatusUsuario{

	public AtivoEstado(UsuarioPresenter usuarioPresenter) {
		super(usuarioPresenter);
		System.out.println("Usuario " + this.usuarioPresenter.getUsuario().getStatus());
	}
	
	@Override
	public void cancelar() throws Exception{
		this.usuarioPresenter.getUsuario().setStatus("Cancelado");  
		this.usuarioPresenter.setStatus(new CanceladoEstado(usuarioPresenter));
	};		
	
}
