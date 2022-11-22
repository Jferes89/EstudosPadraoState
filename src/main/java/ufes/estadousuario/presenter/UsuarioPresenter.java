package ufes.estadousuario.presenter;

import ufes.estadousuario.estado.DesativadoEstado;
import ufes.estadousuario.estado.StatusUsuario;
import ufes.estadousuario.model.Usuario;

public class UsuarioPresenter {
	private StatusUsuario status;
	private Usuario usuario;

	public UsuarioPresenter(Usuario usuario) {
		this.usuario = usuario;
		this.status = new DesativadoEstado(this);
	}

	public void ativar(boolean isAtivo){
		try {
			if (isAtivo) {
				status.ativar();
			} else {
				System.out.println("Usuario contiua " + usuario.getStatusAtual());
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.print("contatar o administrador");
		}
	}

	public void cancelar() {
		try {
			status.cancelar();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.print("contatar o administrador");
		}

	}

	public StatusUsuario getStatus() {
		return status;
	}

	public void setStatus(StatusUsuario status) {
		this.status = status;
	}

	public Usuario getUsuario() {
		return usuario;
	}

}
