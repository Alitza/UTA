package uta.uta;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by Dora Mar on 4/05/17.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> fragmentos;
    private ArrayList<String> nombres;

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
        fragmentos = new ArrayList<Fragment>();
        nombres = new ArrayList<String>();

    }


    public void agregarFragmento(Fragment fragment,String nombre) {
        fragmentos.add(fragment);
        nombres.add(nombre);

    }

    @Override
    public Fragment getItem(int position) {
        return fragmentos.get(position);

    }

    @Override
    public int getCount() {
        return fragmentos.size();
    }
}
