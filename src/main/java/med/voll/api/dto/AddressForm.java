package med.voll.api.dto;

public record AddressForm(String street,
        String neighborhood,
        String zipCode,
        String city,
        String state,
        String complement,
        String number) {

}
