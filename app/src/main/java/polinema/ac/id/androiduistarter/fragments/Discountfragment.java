package polinema.ac.id.androiduistarter.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import polinema.ac.id.androiduistarter.R;

///**
// * A simple {@link Fragment} subclass.
// * Activities that contain this fragment must implement the
// * {@link Discountfragment.OnFragmentInteractionListener} interface
// * to handle interaction events.
// */
public class Discountfragment extends Fragment {


    public Discountfragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_discountfragment, container, false);
    }
}