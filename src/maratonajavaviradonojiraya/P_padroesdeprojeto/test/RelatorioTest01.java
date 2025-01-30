package maratonajavaviradonojiraya.P_padroesdeprojeto.test;

import maratonajavaviradonojiraya.P_padroesdeprojeto.domain.Aircraft;
import maratonajavaviradonojiraya.P_padroesdeprojeto.domain.Material;
import maratonajavaviradonojiraya.P_padroesdeprojeto.domain.Person;
import maratonajavaviradonojiraya.P_padroesdeprojeto.domain.RelatorioDto;

public class RelatorioTest01 {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("BOND-211");
        Material material = Material.DIAMOND;
        Person person = new Person.PersonBuilder()
                .firstName("Josh")
                .lastName("Louis")
                .email("jsosjo@gmail.com")
                .build();

        RelatorioDto relatorioDto = new RelatorioDto.RelatorioBuilder()
                .withAircraftName(aircraft.getName())
                .withPersonFirstName(person.getFirstName())
                .withPersonEmail(person.getEmail())
                .withMaterial(material)
                .build();

        System.out.println(relatorioDto);
    }
}
