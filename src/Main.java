import br.com.benezinho.holding.autentication.model.Profile;
import br.com.benezinho.holding.autentication.model.Role;
import br.com.benezinho.holding.autentication.model.User;
import br.com.benezinho.holding.pessoa.model.Pessoa;
import br.com.benezinho.holding.pessoa.model.PessoaFisica;
import br.com.benezinho.holding.pessoa.model.PessoaJuridica;
import br.com.benezinho.holding.sistema.model.Sistema;

import javax.swing.*;
import java.time.LocalDate;
import java.util.Objects;

public class Main {


    public static PessoaFisica novaPessoa(Long id, String nome, LocalDate nascimento, String CPF ){
        PessoaFisica pf = new PessoaFisica();
        pf.setId(id);
        pf.setNome(nome);
        pf.setNascimento(nascimento);
        pf.setCPF(CPF);
        return pf;

    }

    public static PessoaJuridica novaPessoaJuridica(Long id, String nome, LocalDate fundacao, String CNPJ){
        PessoaJuridica pj = new PessoaJuridica();
        pj.setId(id);
        pj.setNome(nome);
        pj.setNascimento(fundacao);
        pj.setCNPJ(CNPJ);
        return pj;
    }

    public static User novoUsuario(Long ID, String email, String password, Pessoa pessoa){
        User lg = new User();
        lg.setID(ID);
        lg.setEmail(email);
        lg.setPassword(password);
        lg.setPessoa(pessoa);
        return lg;
    }

    public static Profile novoProfile(Long ID, String nome){
        Profile pr = new Profile();
        pr.setID(ID);
        pr.setNome(nome);
        return pr;

    }

    public static Role novoRole(Long ID, String nome, String descricao, Sistema sistema){
        Role rl = new Role();
        rl.setID(ID);
        rl.setNome(nome);
        rl.setDescricao(descricao);
        rl.setSistema(sistema);
        return rl;
    }

    public static Sistema novoSistema(Long ID, String nome, String sigla){
        Sistema sis = new Sistema();
        sis.setID(ID);
        sis.setNome(nome);
        sis.setSigla(sigla);
        return sis;
    }






    public static void main(String[] args) {

        PessoaFisica gabi = novaPessoa(988L, "Gabrielle", LocalDate.of(1977, 3, 8), "445555");
        PessoaJuridica holding = novaPessoaJuridica(777L, "Holding", LocalDate.of(2008, 10, 7), "J3984858FH");
        User gabi14 = novoUsuario(444L, "gabi.stanguini@gmail.com", "14092004", gabi);
        Profile gerente_mercado = novoProfile(872L, "Gerente de Mercado");
        Sistema mercado = novoSistema(3546L, "SONDA", "SDMARKET");
        Role fechar_caixa_mercado = novoRole(673L, "Open Caixa", "Abrir caixa do mercado", mercado);
        PessoaFisica gabi_junior = novaPessoa(138L, "Gabrielle Junior", LocalDate.of(2020, 2, 19), "1734847");

        gabi.addFilho(gabi_junior);
        holding.addSocio(gabi).addSocio(gabi_junior);
        gabi14.addProfile(gerente_mercado);
        gerente_mercado.addRole(fechar_caixa_mercado);
        mercado.addResponsavel(gabi);


        var login = JOptionPane.showInputDialog("Digite seu email:");
        var senha = JOptionPane.showInputDialog("Digite sua senha:");

        if (Objects.equals(login, gabi14.getEmail()) && Objects.equals(senha, gabi14.getPassword())) {
            System.out.println("EMAIL E SENHA CORRETOS!");
        } else {
            System.out.println("EMAIL OU SENHA INCORRETOS!");
        }


    }

}