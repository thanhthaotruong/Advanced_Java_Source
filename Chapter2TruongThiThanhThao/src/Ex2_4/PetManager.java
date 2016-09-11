package Ex2_4;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 08 Sept 2016
 * Version 2.0
 */
import java.util.ArrayList;
import java.util.List;

public class PetManager<T> {
	private List<T> pets;

	public void setPets(List<T> pets) {
		this.pets = pets;
	}

	public List<T> getPets() {
		if (pets == null) {
			pets = new ArrayList<>();
		}
		return pets;
	}

}
