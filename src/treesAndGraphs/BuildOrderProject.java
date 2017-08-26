package treesAndGraphs;

import java.util.ArrayList;
import java.util.HashMap;

public class BuildOrderProject {
	public enum State {COMPLETE, PARTIAL, BLANK};
	private ArrayList<BuildOrderProject> children = new ArrayList<BuildOrderProject>();
	private HashMap<String, BuildOrderProject> map = new HashMap<String, BuildOrderProject>();
	private String name;
	private State state = State.BLANK;
	
	public BuildOrderProject(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}
	
	public void addNeighbor(BuildOrderProject node) {
		if (!map.containsKey(node.getName())) {
			children.add(node);
			map.put(node.getName(), node);
		}
	}
	
	public State getState() { 
		return state;
	}
	
	public void setState(State st) {
		state = st;
	}
	
	public ArrayList<BuildOrderProject> getChildren() {
		return children;
	}
}
