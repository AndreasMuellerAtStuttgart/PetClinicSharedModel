package am.training.petclinic.PetClinicSharedModel.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OwnerDto {
	Long ownerId;
	String firstName;
	String lastName;
	Date birthDate;
	PetDto pet;
}
