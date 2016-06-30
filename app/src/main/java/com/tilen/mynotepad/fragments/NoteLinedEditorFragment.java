package com.tilen.mynotepad.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.tilen.mynotepad.R;


/**
 * Created by Tilen on 29.6.2016.
 */
public class NoteLinedEditorFragment extends android.support.v4.app.Fragment{


    public NoteLinedEditorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_note_lined_editor, container, false);
    }


}