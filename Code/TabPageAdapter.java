package edu.niu.z1779105.tablayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

//The fragment adapter used when their are all on same UI view
public class TabPageAdapter extends FragmentPagerAdapter {

    int tabCount;
    public TabPageAdapter(FragmentManager fm, int numberOftabs)
    {
        super(fm);
        this.tabCount=numberOftabs;
    }
    @Override
    public Fragment getItem(int position) {

        switch(position)
        {
            case 0:
                return new TabHomeFragment();
            case 1:
                Tab1Fragment tab1 = new Tab1Fragment();
                return tab1;
            case 2:
                Tab2Fragment tab2 = new Tab2Fragment();
                return tab2;
            case 3:
                Tab3Fragment tab3 = new Tab3Fragment();
                return tab3;
            case 4:
                Tab4Fragment tab4 = new Tab4Fragment();
                return tab4;
            case 5:
                Tab5Fragment tab5 = new Tab5Fragment();
                return tab5;
            default:
                return null;


        }//endswitch
    }//endgetitem

    @Override
    public int getCount() {
        return tabCount;
    }
}
