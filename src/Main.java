
import component.Assinatura;
import component.AssinaturaBase;

import packages.CaixaSurpresa;
import packages.CartaoPlatinum;
import packages.CashBack;
import packages.FreteGratis;
import packages.MultiDispositivos;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Assinatura assinatura = new AssinaturaBase();

        Set<Integer> pacotesAdicionados = new HashSet<>();

        int opcao;

        do {

            System.out.println("\n========= Seja Bem vindo(a) ao GoianoFlix =========");
            System.out.println("========= Assinatura Base - R$ 9,99 =========");
            System.out.println("========= Selecione seu adicional ou finalize para concluir =========");
            System.out.println("----------------------------------");
            System.out.println("1 - Multi Dispositivos - R$ 19,99");
            System.out.println("2 - Frete Grátis - R$ 9,99");
            System.out.println("3 - Caixa Surpresa - R$ 29,99");
            System.out.println("4 - Cartão Platinum - R$ 49,99");
            System.out.println("5 - Cash Back - R$ 19,99");
            System.out.println("0 - Finalizar assinatura");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            // finaliza
            if (opcao == 0) {
                break;
            }

            // impede repetição
            if (pacotesAdicionados.contains(opcao)) {
                System.out.println("Esse pacote já foi adicionado!");
                continue;
            }

            switch (opcao) {

                case 1:
                    assinatura = new MultiDispositivos(assinatura);
                    pacotesAdicionados.add(1);
                    System.out.println("Pacote Multi Dispositivos adicionado!");
                    break;

                case 2:
                    assinatura = new FreteGratis(assinatura);
                    pacotesAdicionados.add(2);
                    System.out.println("Pacote Frete Grátis adicionado!");
                    break;

                case 3:
                    assinatura = new CaixaSurpresa(assinatura);
                    pacotesAdicionados.add(3);
                    System.out.println("Pacote Caixa Surpresa adicionado!");
                    break;

                case 4:
                    assinatura = new CartaoPlatinum(assinatura);
                    pacotesAdicionados.add(4);
                    System.out.println("Pacote Cartão Platinum adicionado!");
                    break;

                case 5:
                    assinatura = new CashBack(assinatura);
                    pacotesAdicionados.add(5);
                    System.out.println("Pacote Cash Back adicionado!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (true);

        // resumo final
        System.out.println("\n========= RESUMO DA ASSINATURA =========");
        System.out.println(assinatura.getDescricao());

        System.out.printf("\nVALOR TOTAL: R$ %.2f\n", assinatura.getPreco());

        sc.close();
    }
}