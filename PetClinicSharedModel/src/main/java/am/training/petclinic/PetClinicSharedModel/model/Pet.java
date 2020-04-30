package am.training.petclinic.PetClinicSharedModel.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pet {
	String name;
	String animalType;
	Owner owner;
}
