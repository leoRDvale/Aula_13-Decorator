package packages;

import component.Assinatura;
import decorator.AssinaturaDecorator;

import java.util.Set;

public class CashBack extends AssinaturaDecorator {

    public CashBack(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String getDescricao() {
        return assinatura.getDescricao()
                + "\n+ Pacote 5: Compra com Cash Back";
    }

    @Override
    public double getPreco() {
        return assinatura.getPreco() + 19.99;
    }

    @Override
    public Set<String> getPacotes() {
        Set<String> pacotes = assinatura.getPacotes();

        if (pacotes.contains("Pacote5")) {
            throw new RuntimeException("Pacote 5 já adicionado!");
        }

        pacotes.add("Pacote5");
        return pacotes;
    }
}
