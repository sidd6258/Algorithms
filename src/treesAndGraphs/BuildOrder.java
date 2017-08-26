package treesAndGraphs;

import java.util.ArrayList;
import java.util.Stack;

public class BuildOrder {
	public static BuildOrderGraph buildGraph(String[] projects, String[][] dependencies) {
		BuildOrderGraph graph = new BuildOrderGraph();
		for (String project : projects) {
			graph.getOrCreateNode(project);
		}
		
		for (String[] dependency : dependencies) {
			String first = dependency[0];
			String second = dependency[1];
			graph.addEdge(first, second);
		}
		
		return graph;
	}
	
	public static boolean doDFS(BuildOrderProject project, Stack<BuildOrderProject> stack) {
		if (project.getState() == BuildOrderProject.State.PARTIAL) {
			return false; // Cycle
		}
		
		if (project.getState() == BuildOrderProject.State.BLANK) {
			project.setState(BuildOrderProject.State.PARTIAL);
			ArrayList<BuildOrderProject> children = project.getChildren();
			for (BuildOrderProject child : children) {
				if (!doDFS(child, stack)) {
					return false;
				}
			}
			project.setState(BuildOrderProject.State.COMPLETE);
			stack.push(project);
		}
		return true;
	}
	
	public static Stack<BuildOrderProject> orderProjects(ArrayList<BuildOrderProject> projects) {
		Stack<BuildOrderProject> stack = new Stack<BuildOrderProject>();
		for (BuildOrderProject project : projects) {
			if (project.getState() == BuildOrderProject.State.BLANK) {
				if (!doDFS(project, stack)) {
					return null;
				}
			}
		}
		return stack;
	}
	
	public static String[] convertToStringList(Stack<BuildOrderProject> projects) {
		String[] buildOrder = new String[projects.size()];
		for (int i = 0; i < buildOrder.length; i++) {
			buildOrder[i] = projects.pop().getName();
		}
		return buildOrder;
	}
	
	public static Stack<BuildOrderProject> findBuildOrder(String[] projects, String[][] dependencies) {
		BuildOrderGraph graph = buildGraph(projects, dependencies);
		return orderProjects(graph.getNodes());
	}
	
	public static String[] buildOrderWrapper(String[] projects, String[][] dependencies) {
		Stack<BuildOrderProject> buildOrder = findBuildOrder(projects, dependencies);
		if (buildOrder == null) return null;
		String[] buildOrderString = convertToStringList(buildOrder);
		return buildOrderString;
	}
	
	public static void main(String[] args) {
		String[] projects = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
		String[][] dependencies = {
				{"a", "b"},
				{"b", "c"},
				{"a", "c"},
				{"d", "e"},
				{"b", "d"},
				{"e", "f"},
				{"a", "f"},
				{"h", "i"},
				{"h", "j"},
				{"i", "j"},
				{"g", "j"}};
		String[] buildOrder = buildOrderWrapper(projects, dependencies);
		if (buildOrder == null) {
			System.out.println("Circular Dependency.");
		} else {
			for (String s : buildOrder) {
				System.out.println(s);
			}
		}
	}
}
