package packages;

import component.Assinatura;
import decorator.AssinaturaDecorator;

import java.util.Set;

public class MultiDispositivos extends AssinaturaDecorator {

    public MultiDispositivos(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String getDescricao() {
        return assinatura.getDescricao()
                + "\n+ Pacote 1: Assistir vídeos em vários dispositivos";
    }

    @Override
    public double getPreco() {
        return assinatura.getPreco() + 19.99;
    }

    @Override
    public Set<String> getPacotes() {
        Set<String> pacotes = assinatura.getPacotes();

        if (pacotes.contains("Pacote1")) {
            throw new RuntimeException("Pacote 1 já adicionado!");
        }

        pacotes.add("Pacote1");
        return pacotes;
    }
}
