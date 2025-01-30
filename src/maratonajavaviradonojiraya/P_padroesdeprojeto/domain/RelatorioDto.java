package maratonajavaviradonojiraya.P_padroesdeprojeto.domain;

public class RelatorioDto {
    private String aircraftName;
    private String personFirstName;
    private String personEmail;
    private Material material;

    @Override
    public String toString() {
        return "Relatorio{" +
                "aircraftName='" + aircraftName + '\'' +
                ", personFirstName='" + personFirstName + '\'' +
                ", personEmail='" + personEmail + '\'' +
                ", material=" + material +
                '}';
    }

    public static final class RelatorioBuilder {
        private String aircraftName;
        private String personFirstName;
        private String personEmail;
        private Material material;

        public RelatorioBuilder() {
        }

        public static RelatorioBuilder builder() {
            return new RelatorioBuilder();
        }

        public RelatorioBuilder withAircraftName(String aircraftName) {
            this.aircraftName = aircraftName;
            return this;
        }

        public RelatorioBuilder withPersonFirstName(String personFirstName) {
            this.personFirstName = personFirstName;
            return this;
        }

        public RelatorioBuilder withPersonEmail(String personEmail) {
            this.personEmail = personEmail;
            return this;
        }

        public RelatorioBuilder withMaterial(Material material) {
            this.material = material;
            return this;
        }

        public RelatorioDto build() {
            RelatorioDto relatorioDto = new RelatorioDto();
            relatorioDto.aircraftName = this.aircraftName;
            relatorioDto.material = this.material;
            relatorioDto.personFirstName = this.personFirstName;
            relatorioDto.personEmail = this.personEmail;
            return relatorioDto;
        }
    }
}
