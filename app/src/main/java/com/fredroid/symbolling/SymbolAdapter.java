package com.fredroid.symbolling;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SymbolAdapter extends ArrayAdapter<Symbol> {

    public SymbolAdapter(Context context, ArrayList<Symbol> users) {
        super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Symbol user = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.layout_row, parent, false);
        }
        TextView tvSymbol = convertView.findViewById(R.id.textView_symbol);
        TextView tvWord = convertView.findViewById(R.id.textView_mark);
        tvSymbol.setText(user.strmark);
        tvWord.setText(user.strspell);
        return convertView;
    }
}
