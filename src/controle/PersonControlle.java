package controle;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import model.Person;

public class PersonControlle {

	public static List<Person> list = new ArrayList<>();
	static {
		for (int i = 0; i < 12; i++)
			list.add(new Person("nom_" + i, "prenom_" + i, "pseudo_" + i, "email_" + i, "tel_" + i,
					"mot_de_passe_" + i));
	}
	private List<Person> listOfPerson;

	public PersonControlle() {
		listOfPerson = new ArrayList<>(list);

	}

	public boolean loginPerson(Person p) {
		return listOfPerson.contains(p);
	}

	public boolean addPerson(Person p) {
		if (loginPerson(p))
			return false;
		return listOfPerson.add(p);
	}

}
