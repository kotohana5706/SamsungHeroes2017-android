package us.buddman.samsungheroes2017.fragment;

/**
 * Created by Administrator on 2017-09-16.
 */

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import us.buddman.samsungheroes2017.R;
import us.buddman.samsungheroes2017.databinding.FragmentPinBinding;
import us.buddman.samsungheroes2017.databinding.FragmentTopicBinding;

public class TopicFragment extends Fragment {
    private int mPageNumber;
    public String title;
    public FragmentTopicBinding binding;
    public int currentSortStatus = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_topic, container, false);
        return binding.getRoot();
    }


}