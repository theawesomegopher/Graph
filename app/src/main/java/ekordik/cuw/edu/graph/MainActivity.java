package ekordik.cuw.edu.graph;

import android.support.v4.view.ViewGroupCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private EditText name;
    private EditText weight;
    private EditText destId;
    private EditText startingId;
    private ViewGroup verticsLayout;
    private Graph graph;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.name = (EditText)findViewById(R.id.vertexName);
        this.weight = (EditText)findViewById(R.id.weight);
        this.destId = (EditText)findViewById(R.id.destId);
        this.startingId = (EditText)findViewById(R.id.startingVertex);
        this.verticsLayout = (ViewGroup)findViewById(R.id.vertexs);
    }

    public void onAddVertexClick(View view){
        if(graph == null){
            this.graph = new Graph(name.getText().toString());
        }else{
            graph.addVertex(name.getText().toString());
        }
        this.display();
    }

    public void onAddEdgeClick(View view){
        String edge = this.graph.addEdge(Integer.parseInt(startingId.getText().toString()),
            Integer.parseInt(destId.getText().toString()), Integer.parseInt(weight.getText().toString()));
        this.display();
        System.out.println(edge);
    }

    private void display(){
        verticsLayout.removeAllViews();
        for(Vertex v : this.graph.getVertics()){
            TextView tv = new TextView(this);
            tv.setText(v.toString());
            verticsLayout.addView(tv);
        }
    }
}
