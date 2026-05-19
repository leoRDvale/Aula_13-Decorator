package packages;

import component.Assinatura;
import decorator.AssinaturaDecorator;

import java.util.Set;

public class CartaoPlatinum extends AssinaturaDecorator {

    public CartaoPlatinum(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String getDescricao() {
        return assinatura.getDescricao()
                + "\n+ Pacote 4: Cartão Platinum";
    }

    @Override
    public double getPreco() {
        return assinatura.getPreco() + 49.99;
    }

    @Override
    public Set<String> getPacotes() {
        Set<String> pacotes = assinatura.getPacotes();

        if (pacotes.contains("Pacote4")) {
            throw new RuntimeException("Pacote 4 já adicionado!");
        }

        pacotes.add("Pacote4");
        return pacotes;
    }
}
