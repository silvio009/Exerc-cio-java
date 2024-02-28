import br_alura_fiap_bean.ContaCorrente;
import br_alura_fiap_bean.ContaPoupanca;
import br_alura_fiap_bean.TipoConta;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Calendar dataAbertura = new GregorianCalendar();


        dataAbertura.set(Calendar.YEAR, 2024);
        dataAbertura.set(Calendar.MONTH, Calendar.FEBRUARY);
        dataAbertura.set(Calendar.DAY_OF_MONTH, 23);


        ContaCorrente minhaConta = new ContaCorrente(125,0774,dataAbertura,1200);

        ContaPoupanca minhaContaPoupanca = new ContaPoupanca(1665,0707,dataAbertura,5000,20);

        System.out.println("AGENCIA: "+ minhaConta.getAgencia()+ "||"+"NUMERO: "+ minhaConta.getNumero()+"||"+ "DIA: "+minhaConta.dataAbertura+"||"+"SALDO: "+ minhaConta.getSaldo() );
        System.out.println("AGENCIA: "+ minhaContaPoupanca.getAgencia()+ "||"+"NUMERO: "+ minhaContaPoupanca.getNumero()+"||"+ "DIA: "+minhaContaPoupanca.dataAbertura+"||"+"SALDO: "+ minhaContaPoupanca.getSaldo()+ "||"+"TAXA: "+ minhaContaPoupanca.getTaxa());
        // TESTANDO OS METODOS CRIADOS PARA AS CONTAS
        minhaConta.depositar(500);
        minhaConta.retirar(5000);

        minhaContaPoupanca.depositar(500);
        minhaContaPoupanca.retirar(2500);




        List<ContaCorrente> listContaCorrente = new ArrayList<>();

        listContaCorrente.add(new ContaCorrente(120,0457,dataAbertura,10000));
        listContaCorrente.add(new ContaCorrente(150,0254,dataAbertura,2600));
        listContaCorrente.add(new ContaCorrente(200,1555,dataAbertura,7000));

        for (ContaCorrente contaCorrente : listContaCorrente){
            System.out.println("Saldo da conta " + contaCorrente.getNumero() + ": " + contaCorrente.getSaldo()+" R$");;
        }
    }
}