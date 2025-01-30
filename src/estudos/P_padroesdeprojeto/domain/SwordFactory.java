package estudos.P_padroesdeprojeto.domain;

public class SwordFactory {
    public static Sword getSword(Material material) {
        switch (material) {
            case STEEL -> {
                return new SteelSword();
            }
            case DIAMOND -> {
                return new DiamondSword();
            }
            default -> throw new IllegalArgumentException("Not a known material.");
        }
    }
}
