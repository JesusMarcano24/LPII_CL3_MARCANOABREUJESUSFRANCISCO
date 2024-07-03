package Interfaces;

import java.util.List;

import modelo.TblUsuariocl3;

public interface IUsuario {
 //Declaramos metodos
	public void RegistrarUsuario(TblUsuariocl3 usuario);
	public List<TblUsuariocl3> ListadoUsuario();
}
