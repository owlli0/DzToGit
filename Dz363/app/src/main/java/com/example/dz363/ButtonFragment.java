package com.example.dz363;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class ButtonFragment extends Fragment {

    @Override
    // Переопределяем метод onCreateView
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // менеджер компоновки, который позволяет
        // получать доступ к layout с наших ресурсов
        View view = inflater
                .inflate(R.layout.fragment_button, container, false);

        // теперь можем достучаться до наших элементов, расположенных во
        // фрагменте
        Button button = view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Сообщение из фрагмента", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}