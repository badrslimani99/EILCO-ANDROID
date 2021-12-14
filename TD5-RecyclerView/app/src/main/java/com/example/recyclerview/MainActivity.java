package com.example.recyclerview;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Contact> contacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        RecyclerView rvContacts = (RecyclerView) findViewById(R.id.rvContacts);


        contacts.add(new Contact("Hlali", "Haitam","https://histoire-image.org/sites/default/jeanne-arc-sacre-charlesvii.jpg"));
        contacts.add(new Contact("Slimani", "Badr"));
        contacts.add(new Contact("Jeanne", "D'arc"));
        contacts.add(new Contact("Pierre", "Menez"));
        contacts.add(new Contact("Arthur", "Rimbaut"));
        contacts.add(new Contact("Yannick", "Noah"));
        contacts.add(new Contact("Rock", "Lee"));
        contacts.add(new Contact("Lamperouge", "Lelouch"));

        ContactsAdapter adapter = new ContactsAdapter(contacts);

        rvContacts.setAdapter(adapter);

        rvContacts.setLayoutManager(new LinearLayoutManager(this));
    }
}