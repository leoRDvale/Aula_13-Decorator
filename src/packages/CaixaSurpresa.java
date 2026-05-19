package packages;

import component.Assinatura;
import decorator.AssinaturaDecorator;

import java.util.Set;

public class CaixaSurpresa extends AssinaturaDecorator {

    public CaixaSurpresa(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String getDescricao() {
        return assinatura.getDescricao()
                + "\n+ Pacote 3: Caixa surpresa com produtos";
    }

    @Override
    public double getPreco() {
        return assinatura.getPreco() + 29.99;
    }

    @Override
    public Set<String> getPacotes() {
        Set<String> pacotes = assinatura.getPacotes();

        if (pacotes.contains("Pacote3")) {
            throw new RuntimeException("Pacote 3 já adicionado!");
        }

        pacotes.add("Pacote3");
        return pacotes;
    }
}