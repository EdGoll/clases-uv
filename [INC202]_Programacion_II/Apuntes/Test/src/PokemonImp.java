
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PokemonImp {

    private List<Pokemon> listaPokemon;
    private List<PokemonTipo> listaPokemonTipo;
    private List<String> listaPokemonBuscado;

    private void leerDatosPokemon() {
        listaPokemon = new ArrayList<Pokemon>();
        List<String> lineas;
        StringTokenizer st = null;
        SalidaIngreso fd = new SalidaIngreso();
        Pokemon pokemon;

        lineas = fd.leer("/home/rolivares/Dropbox/Universidad/UV/Programacion_II/presentacion_4_print/resources/pokemon_dataset.txt");

        for (String linea : lineas) {
            st = new StringTokenizer(linea, "#");

            if (st.hasMoreElements()) {
                if (st.hasMoreElements()) {
                    pokemon = new Pokemon();

                    pokemon.setId(st.nextToken());
                    pokemon.setNombre(st.nextToken());
                    pokemon.setEvolucion(st.nextToken());
                    pokemon.setCodigoTipoPrincipal(st.nextToken());
                    try {
                        pokemon.setCodigoTipoSecundario(st.nextToken());
                    } catch (NoSuchElementException ex) {
                    }
                    listaPokemon.add(pokemon);
                }
            }
        }

    }

    private void leerDatosPokemonTipo() {
        listaPokemonTipo = new ArrayList<PokemonTipo>();
        List<String> lineas;
        SalidaIngreso fd = new SalidaIngreso();
        StringTokenizer st = null;
        PokemonTipo pokemonTipo;

        lineas = fd.leer("/home/rolivares/Dropbox/Universidad/UV/Programacion_II/presentacion_4_print/resources/pokemon_element_dataset.txt");

        for (String linea : lineas) {
            st = new StringTokenizer(linea, "#");

            if (st.hasMoreElements()) {
                pokemonTipo = new PokemonTipo();

                pokemonTipo.setDescripcion(st.nextToken());
                pokemonTipo.setCodigo(st.nextToken());

                listaPokemonTipo.add(pokemonTipo);
            }
        }
    }

    private void unirDatosPokemon() {
        for (Pokemon pokemon : listaPokemon) {
            for (PokemonTipo pokemonTipo : listaPokemonTipo) {
                if (pokemon.getCodigoTipoPrincipal().equalsIgnoreCase(pokemonTipo.getCodigo())) {
                    pokemon.setDescripcionTipoPrincipal(pokemonTipo.getDescripcion());
                } else {
                    if (pokemon.getCodigoTipoSecundario() != null && pokemon.getCodigoTipoSecundario().equalsIgnoreCase(pokemonTipo.getCodigo())) {
                        pokemon.setDescripcionTipoSecundario(pokemonTipo.getDescripcion());
                    }
                }
            }
        }
    }

    private void buscarPokemon() {
        Scanner scanner = null;
        String id = null, pokemonBuscar = null, respuesta = null;
        listaPokemonBuscado = new ArrayList<String>();

        do {
            scanner = new Scanner(System.in);
            System.out.print("\nIngrese el ID del pokemon a buscar ");
            id = scanner.nextLine();

            for (Pokemon pokemon : listaPokemon) {
                if (pokemon.getId().equals(id)) {
                    pokemonBuscar = pokemon.toString();
                    break;
                }
            }
            if (pokemonBuscar != null) {
                listaPokemonBuscado.add(pokemonBuscar);
                System.out.println(pokemonBuscar);
            } else {
                System.out.println("El pokemon buscado no existe");
            }

            scanner = new Scanner(System.in);
            System.out.print("\nDesea buscar un nuevo pokemon (S/N)? ");
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("s"));
    }

    private void registrarBusqueda() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDesea registrar la busqueda de los pokemon buscados (S/N)? ");
        String respuesta = scanner.nextLine();

        if (respuesta.equalsIgnoreCase("s")) {
            SalidaIngreso fd = new SalidaIngreso();
            //fd.leer("/home/rolivares/Dropbox/Universidad/UV/Programacion_II/presentacion_4_print/resources/pokemon_output_dataset.txt", listaPokemonBuscado);
        }
    }

    public void iniciarBusqueda() {
        leerDatosPokemon();
        leerDatosPokemonTipo();
        unirDatosPokemon();
        buscarPokemon();
        registrarBusqueda();
    }
}
