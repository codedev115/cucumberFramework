package cucumber;

import java.util.HashMap;
import java.util.Map;

import enums.ContextType;

public class ScenarioContext {
	
	private  Map<String, Object> scenarioContext;

	public ScenarioContext(){
        scenarioContext = new HashMap<>();
    }

    public void setContext(ContextType key, Object value) {
        scenarioContext.put(key.toString(), value);
    }

    public Object getContext(ContextType key){
        return scenarioContext.get(key.toString());
    }

    public Boolean isContains(ContextType key){
        return scenarioContext.containsKey(key.toString());
    }
}
