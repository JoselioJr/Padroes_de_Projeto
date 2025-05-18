import java.util.HashMap;
import java.util.Map;

public class FabricaDeVioloes {
    private static Map<String, ViolaoPrototype> prototipos = new HashMap<>();

    static {    
        prototipos.put("classico", new ViolaoClassico());
        prototipos.put("folk", new ViolaoFolk());
        prototipos.put("flet", new ViolaoFlet());
        prototipos.put("jumbo", new ViolaoJumbo());
        prototipos.put("7cordas", new ViolaoSeteCordas());
        prototipos.put("12cordas", new ViolaoDozeCordas());
        prototipos.put("zero", new ViolaoParlor("Zero"));
        prototipos.put("00", new ViolaoParlor("Duplo Zero"));
        prototipos.put("000", new ViolaoParlor("Triplo Zero"));
    }

    public static ViolaoPrototype criarViolao(String tipo) {
        return prototipos.get(tipo.toLowerCase()).clonar();
    }
}
