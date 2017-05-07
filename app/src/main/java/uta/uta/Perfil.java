package uta.uta;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

/**
 * Created by Dora Mar on 6/05/17.
 */

public class Perfil extends Fragment {

    private ProgressBar progressBar;
    private ImageView imageView;
    private TextView textviewname, textviewusername;
    private String[] objetos = new String[3];
    private String id = "perfiles";
    private String url1 = "https://graph.facebook.com/" + id;
    private String url2 = "https://graph.facebook.com/" + id + "/picture?redirect=0&type=large";

    public Perfil() {



    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.perfil, container, false);
    }

}