package uta.uta;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    private TabLayout barrita;
    private ViewPager pagina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        pagina = (ViewPager) findViewById(R.id.viewpager);
        barrita = (TabLayout) findViewById(R.id.tabs);
        createViewPager(pagina);
        barrita.setupWithViewPager(pagina);
        createTabIcons();

    }
    private void createTabIcons() {

        TextView tabOne = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabOne.setCompoundDrawablesWithIntrinsicBounds(0, R.mipmap.iconohome, 0, 0);
        barrita.getTabAt(0).setCustomView(tabOne);

        TextView tabTwo = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabTwo.setCompoundDrawablesWithIntrinsicBounds(0, R.mipmap.iconomegusta, 0, 0);
        barrita.getTabAt(1).setCustomView(tabTwo);

        TextView tabThree = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabThree.setCompoundDrawablesWithIntrinsicBounds(0, R.mipmap.icononotificaciones, 0, 0);
        barrita.getTabAt(2).setCustomView(tabThree);

        TextView tabFour = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabThree.setCompoundDrawablesWithIntrinsicBounds(0, R.mipmap.iconoperfil, 0, 0);
        barrita.getTabAt(3).setCustomView(tabThree);
    }

    private void createViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.agregarFragmento(new Fragmento(), "Tab 1");
        adapter.agregarFragmento(new MeGusta(), "Tab 2");
        adapter.agregarFragmento(new Fragmento(), "Tab 3");
        adapter.agregarFragmento(new Fragmento(), "Tab 4");
        viewPager.setAdapter(adapter);
    }
}
