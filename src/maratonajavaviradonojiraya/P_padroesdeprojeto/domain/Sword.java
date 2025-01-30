package maratonajavaviradonojiraya.P_padroesdeprojeto.domain;

public interface Sword {
    String getMaterial();
}

class DiamondSword implements Sword {

    @Override
    public String getMaterial() {
        return "This sword is made of diamond.";
    }
}

class SteelSword implements Sword {

    @Override
    public String getMaterial() {
        return "This sword is made of steel.";
    }
}