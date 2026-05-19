package component;

import java.util.HashSet;
import java.util.Set;

public class AssinaturaBase implements Assinatura {

    @Override
    public String getDescricao() {
        return "Assinatura Base: Assistir vídeos em um único dispositivo";
    }

    @Override
    public double getPreco() {
        return 9.99;
    }

    @Override
    public Set<String> getPacotes() {
        return new HashSet<>();
    }
}