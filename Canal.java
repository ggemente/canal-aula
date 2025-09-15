import java.util.ArrayList;



public class Canal
{
    
    private ArrayList<Inscricao> inscricoes;
    

    
    /**
     * Construtor de objetos da classe Canal
     */
    public Canal()
    {
        inscricoes = new ArrayList<Inscricao>();
    }

    /**
     * Adiciona um novo incrito na lista de inscritos do canal.
     * @param inscricao O objeto inscricao a ser adicionado.
     */

     public boolean estaInscrito(String nome){
         for (Inscricao inscrito : inscricoes) {
            if (inscrito.obterNome().equals(nome)) {
                System.out.println("Erro: Já existe um inscrito com o nome " + nome);
                return false;
            }
        }
        return true;
     }

    public boolean inscrever(Inscricao inscricao)
    {
       
        return estaInscrito(inscricao.obterNome()) && inscricoes.add(inscricao);

    }

    /**
     * @return O número de inscritos (objetos Inscricao) no canal.
     */
    public int quantidadeDeInscritos()
    {
        return inscricoes.size();
    }

    public int inscritosNomes(int mes) {
        if (mes < 1 || mes > 12) {
            System.out.println("Erro: mês inválido. Informe um valor entre 1 e 12.");
            return 0;
        }
        int count = 0;
        for (Inscricao inscricao : inscricoes) {
            if (inscricao.obterMes() == mes) {
                count++;
            }
        }
        return count;
    }
}

