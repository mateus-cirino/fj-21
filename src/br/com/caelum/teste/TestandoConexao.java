package br.com.caelum.teste;

import br.com.caelum.jdbc.ConnectionFactory;

import java.sql.Connection;

public class TestandoConexao {
    public static void main(String[] args) {
        System.out.println("abrindo conexao");
        Connection connection = ConnectionFactory.getConnection();

        ConnectionFactory.closeConnection(connection);
        System.out.println("fechando conexao");
    }
}
