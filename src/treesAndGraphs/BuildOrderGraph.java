package treesAndGraphs;

import java.util.ArrayList;
import java.util.HashMap;

public class BuildOrderGraph {
	
	private ArrayList<BuildOrderProject> nodes = new ArrayList<BuildOrderProject>();
	private HashMap<String, BuildOrderProject> map = new HashMap<String, BuildOrderProject>();
	
	public BuildOrderProject getOrCreateNode(String name) {
		if (!map.containsKey(name)) {
			BuildOrderProject node = new BuildOrderProject(name);
			nodes.add(node);
			map.put(name, node);
		}
		
		return map.get(name);
	}
	
	public void addEdge(String startName, String endName) {
		BuildOrderProject start = getOrCreateNode(startName);
		BuildOrderProject end = getOrCreateNode(endName);
		start.addNeighbor(end);
	}
	
	public ArrayList<BuildOrderProject> getNodes() {
		return nodes;
	}
}
