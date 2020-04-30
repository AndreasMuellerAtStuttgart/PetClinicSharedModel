package am.training.petclinic.PetClinicSharedModel.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Appointment {
	Long doctorId;
	Long ownerId;
	Long petId;
	Date date;
}
