package com.algaworks.cadastrocliente;

import com.algaworks.cadastrocliente.model.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Exemplo {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory("Clientes-PU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

//        Buscando um registro.
//        Cliente cliente = entityManager.find(Cliente.class, 1);
//        System.out.println(cliente.getNome());


//        Inserindo um registro com persist.
//        Cliente cliente = new Cliente();
//        cliente.setNome("Eletro Silva");
//        entityManager.getTransaction().begin();
//        entityManager.persist(cliente);
//        entityManager.getTransaction().commit();


//        Removendo o registro.
//        Cliente cliente = entityManager.find(Cliente.class, 2);
//        entityManager.getTransaction().begin();
//        entityManager.remove(cliente);
//        entityManager.getTransaction().commit();


//        Usando o cache de primeiro nível.
//        Cliente cliente = entityManager.find(Cliente.class, 1);
//        Cliente cliente2 = entityManager.find(Cliente.class, 1);


//        Atualizando o registro já gerenciado.
//        Cliente cliente = entityManager.find(Cliente.class, 1);
//        entityManager.getTransaction().begin();
//        cliente.setNome(cliente.getNome() + " Alterado");
//        entityManager.getTransaction().commit();


//        Atualizando um objeto (que não nasceu gerenciado) com o merge.
//        Cliente cliente = new Cliente();
//        cliente.setId(1);
//        cliente.setNome("Construtora Medeiros");
//        entityManager.getTransaction().begin();
//        entityManager.merge(cliente);
//        entityManager.getTransaction().commit();


//        Inserindo com o merge.
//        Cliente cliente = new Cliente();
//        cliente.setNome("Construtora Medeiros");
//        entityManager.getTransaction().begin();
//        entityManager.merge(cliente);
//        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
