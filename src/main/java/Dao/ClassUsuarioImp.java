package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IUsuario;
import modelo.TblUsuariocl3;

public class ClassUsuarioImp implements IUsuario {

	@Override
	public void RegistrarUsuario(TblUsuariocl3 usuario) {
		EntityManagerFactory fabr= Persistence.createEntityManagerFactory("LPII_CL2_MARCANOABREUJESUSFRANCISCO");
		EntityManager em=fabr.createEntityManager();
		em.getTransaction().begin();
		em.persist(usuario);
		System.out.println("Usuario registrado con exito en la BD");
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public List<TblUsuariocl3> ListadoUsuario() {
		//Gestionamos la entidad
		EntityManagerFactory fabr= Persistence.createEntityManagerFactory("LPII_CL2_MARCANOABREUJESUSFRANCISCO");
		EntityManager em=fabr.createEntityManager();
		em.getTransaction().begin();
		//Recuperamos los datos
		List<TblUsuariocl3> listadoUsuarios=em.createQuery("select u from TblUsuariocl2 u", TblUsuariocl3.class).getResultList();
		em.getTransaction().commit();
		em.close();
		return listadoUsuarios;
	}

}
