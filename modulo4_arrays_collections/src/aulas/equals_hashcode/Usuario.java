package aulas.equals_hashcode;

import java.util.Objects;

public class Usuario {

    String nome;
    String email;

    public Usuario() {
    }

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {

        if(obj instanceof  Usuario) {
            Usuario outro = (Usuario) obj;
            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);

            return nomeIgual && emailIgual;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(nome);
        result = 31 * result + Objects.hashCode(email);
        return result;
    }
}
