package decorator;

import component.Assinatura;

import java.util.Set;

public abstract class AssinaturaDecorator implements Assinatura {

    protected Assinatura assinatura;

    public AssinaturaDecorator(Assinatura assinatura) {
        this.assinatura = assinatura;
    }

    @Override
    public Set<String> getPacotes() {
        return assinatura.getPacotes();
    }
}