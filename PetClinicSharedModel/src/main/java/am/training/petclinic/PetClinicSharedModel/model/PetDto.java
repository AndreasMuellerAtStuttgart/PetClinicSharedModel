package am.training.petclinic.PetClinicSharedModel.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PetDto {
	Long petId;
	String name;
	String animalType;
	OwnerDto owner;
}
