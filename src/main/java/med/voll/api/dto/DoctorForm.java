package med.voll.api.dto;

import med.voll.api.utils.Specialty;

public record DoctorForm(String name, String email, String crm, Specialty specialty, AddressForm address) {

}
