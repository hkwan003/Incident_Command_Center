package com.example.calvinkwan.incident_command_center;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.Locale;

class SectionsPagerAdapter extends FragmentPagerAdapter
{
    protected Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm)
    {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position)
    {
        Fragment fragment = null;
        if(position == 0)
        {
            fragment = new InboxFragment();
        }
        if(position == 1)
        {
            fragment = new FriendsFragment();
        }
        if(position == 2)
        {
            fragment = new FriendsFragment();
        }
        return fragment;
    }

    @Override
    public int getCount()
    {
        // Show 3 total pages.
        return 3;
    }
    @Override
    public CharSequence getPageTitle(int position)
    {
        Locale l = Locale.getDefault();
        switch (position) {
            case 0:
                return mContext.getString(R.string.title_section1).toUpperCase(l);
            case 1:
                return mContext.getString(R.string.title_section2).toUpperCase(l);
            case 2:
                return mContext.getString(R.string.title_section3).toUpperCase(l);
        }
        return null;
    }
}