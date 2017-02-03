package oldstuff;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.example.Pokemon;
import com.example.PokemonDao;
import com.example.Type;

@Component
public class PokemonDaoInMemory implements PokemonDao {

	@PostConstruct
	private ArrayList<Type> llenarTipos() {
		ArrayList<Type> tiposLocales = new ArrayList<Type>();

		Type electric = new Type(1, "electric");
		tiposLocales.add(electric);
		Type normal = new Type(2, "normal");
		tiposLocales.add(normal);
		Type fire = new Type(3, "fire");
		tiposLocales.add(fire);
		Type fighting = new Type(4, "fighting");
		tiposLocales.add(fighting);
		Type water = new Type(5, "water");
		tiposLocales.add(water);
		Type flying = new Type(6, "flying");
		tiposLocales.add(flying);
		Type grass = new Type(7, "grass");
		tiposLocales.add(grass);
		Type poison = new Type(8, "poison");
		tiposLocales.add(poison);
		Type ground = new Type(9, "ground");
		tiposLocales.add(ground);
		Type psychic = new Type(10, "psychic");
		tiposLocales.add(psychic);
		Type rock = new Type(11, "rock");
		tiposLocales.add(rock);
		Type ice = new Type(12, "ice");
		tiposLocales.add(ice);
		Type bug = new Type(13, "bug");
		tiposLocales.add(bug);
		Type dragon = new Type(14, "dragon");
		tiposLocales.add(dragon);
		Type ghost = new Type(15, "ghost");
		tiposLocales.add(ghost);
		Type dark = new Type(16, "dark");
		tiposLocales.add(dark);
		Type steel = new Type(17, "steel");
		tiposLocales.add(steel);
		Type fairy = new Type(18, "fairy");
		tiposLocales.add(fairy);
		return tiposLocales;

	}

	@Override
	public ArrayList<Type> getTipos() {
		ArrayList<Type> todosLosTipos = new ArrayList<Type>();
		todosLosTipos = llenarTipos();
		return todosLosTipos;
	}

	@Override
	public ArrayList<Type> getTipos(int id) {
		ArrayList<Type> todosLosTipos = new ArrayList<Type>();
		todosLosTipos = llenarTipos();

		if (id == 0) {
			return todosLosTipos;
		}
		for (Type type : todosLosTipos) {
			if (type.getId() == id) {
				ArrayList<Type> t = new ArrayList<Type>();
				t.add(type);
				return t;
			}

		}
		return null;
	}

	@Override
	public ArrayList<Type> getTipos(String typeName) {
		ArrayList<Type> todosLosTipos = new ArrayList<Type>();
		todosLosTipos = llenarTipos();

		for (Type type : todosLosTipos) {
			if (type.getType().equals(typeName)) {
				ArrayList<Type> t = new ArrayList<Type>();
				t.add(type);
				return t;
			}

		}
		return null;
	}

	@PostConstruct
	public ArrayList<Pokemon> getPokemonList() {
		ArrayList<Pokemon> pokemonesLocales = new ArrayList<>();
		List<Type> tipoElectrico = new ArrayList<Type>();
		tipoElectrico.add(new Type(1, "electric"));
		ArrayList<Type> debilidadesElectricas = new ArrayList<Type>();
		debilidadesElectricas.add(new Type(9, "ground"));

		ArrayList<Type> tipoHierba = new ArrayList<Type>();
		tipoHierba.add(new Type(7, "grass"));
		ArrayList<Type> debilidadesHierba = new ArrayList<Type>();
		debilidadesHierba.add(new Type(3, "fire"));
		debilidadesHierba.add(new Type(12, "ice"));
		debilidadesHierba.add(new Type(6, "flying"));
		debilidadesHierba.add(new Type(10, "psychic"));

		

		Pokemon raichu = new Pokemon(2, "raichu", tipoElectrico, debilidadesElectricas, null,
				"TODO");
		pokemonesLocales.add(raichu);
		
		Pokemon pikachu = new Pokemon(1, "pikachu", tipoElectrico, debilidadesElectricas,raichu ,
				"http://www.dondevive.org/wp-content/uploads/2016/07/pikachu.jpg");
		pokemonesLocales.add(pikachu);

		Pokemon bulbasaur = new Pokemon(3, "bulbasaur", tipoHierba, debilidadesHierba, null,
				"http://cartoonbros.com/wp-content/uploads/2016/11/Bulbasaur-8.png");
		pokemonesLocales.add(bulbasaur);
		return pokemonesLocales;

	}

	@Override
	public List<Pokemon> getPokes() {
		ArrayList<Pokemon> todosLosPokemones = new ArrayList<Pokemon>();
		todosLosPokemones = getPokemonList();
		return todosLosPokemones;

	}

	
	@Override
	public ArrayList<Pokemon> getPokes(String name) {
		ArrayList<Pokemon> todosLosPokes = new ArrayList<Pokemon>();
		todosLosPokes = getPokemonList();

		for (Pokemon pokemon : todosLosPokes) {
			if (pokemon.getNombre().equals(name)) {
				ArrayList<Pokemon> t = new ArrayList<>();
				t.add(pokemon);
				return t;
			}
		}

		return null;
	}

	@Override
	public ArrayList<Pokemon> getPokes(int parseInt) {
		ArrayList<Pokemon> todosLosPokes = new ArrayList<Pokemon>();
		todosLosPokes = getPokemonList();

		for (Pokemon pokemon : todosLosPokes) {
			if (pokemon.getId() == parseInt) {
				ArrayList<Pokemon> t = new ArrayList<>();
				t.add(pokemon);
				return t;
			}

		}
		return new ArrayList<Pokemon>();
	}

}
