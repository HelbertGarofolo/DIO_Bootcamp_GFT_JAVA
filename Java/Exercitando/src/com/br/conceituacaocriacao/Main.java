package com.br.conceituacaocriacao;
/** O que esta sendo comentado não é valido no Java
 *  boas praticas não estão sendo aplicadas apenas por motivo de exemplificar
 *  que não cria erro de compilação apesar de não ser uma boa prática
*/
public class Main {
    public static void main(String[] args) {

        int i;
        //int i;
        int I;//não segue as boas praticas
        //int 1a;
        int _1a;//não segue as boas praticas
        int $aq;//não segue as boas praticas

        i = 5;
        I = 10;
        _1a = 20;//não segue as boas praticas
        $aq = 7;//não segue as boas praticas

        final int j =10;//não segue as boas praticas
        //j = 15;
        int asrn24678md; //não segue as boas praticas
        //int asrn246 78ad;
        int asrm2$4678_md = 10;//não segue as boas praticas
        //int asrm3$46%78_md = 10;

        asrn24678md = 100;//não segue as boas praticas
        asrm2$4678_md = 10;//não segue as boas praticas

        int quantidadeProduto = 50;
        //int QuantidadeProduto; não segue as boas praticas
        final int NUMERO_TENTATIVAS = 5;
        //final int numeroTentativas = 5; não segue as boas praticas
        int QUANTIDADE_OPCOES = 25;//não segue as boas praticas
        //int qtdProd; não possui expressividade

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrm2$4678_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);

    }
}