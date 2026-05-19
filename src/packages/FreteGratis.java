package packages;

import component.Assinatura;
import decorator.AssinaturaDecorator;

import java.util.Set;

public class FreteGratis extends AssinaturaDecorator {

    public FreteGratis(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String getDescricao() {
        return assinatura.getDescricao()
                + "\n+ Pacote 2: Frete grátis em produtos";
    }

    @Override
    public double getPreco() {
        return assinatura.getPreco() + 9.99;
    }

    @Override
    public Set<String> getPacotes() {
        Set<String> pacotes = assinatura.getPacotes();

        if (pacotes.contains("Pacote2")) {
            throw new RuntimeException("Pacote 2 já adicionado!");
        }

        pacotes.add("Pacote2");
        return pacotes;
    }
}
