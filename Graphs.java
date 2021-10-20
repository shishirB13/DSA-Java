package DataStructures;

public class Graphs {
private int V;// no. of vertices
private int E;// no. of edges
private int[][] adjmatrix;

public Graphs(int i) {
	// TODO Auto-generated constructor stub
}
public void Graph (int nodes) {
	this.V= nodes;
	this.E= 0;
	this.adjmatrix = new int[nodes][nodes];
	
}
public void addedge (int u , int v) {
	adjmatrix[u][v]= 1;
	adjmatrix[v][u]= 1;// as it is an undirected graph
	E++;
}
		public String tostring() {
			StringBuilder sb =  new StringBuilder();
			sb.append(V +"vertices" +E +"edges" +"\n");
			for(int v=0; v<V; v++) {
				sb.append(v+" ");
				for(int w: adjmatrix[v]) {
					sb.append(w+" ");
				}
				sb.append("\n");
			}
			return sb.toString();
		}

	public static void main(String[] args) {
		Graphs g = new Graphs(4);
		g.addedge(0,1);
		g.addedge(1,2);
		g.addedge(2,3);
		g.addedge(3,0);
		System.out.println(g);
	}

}
