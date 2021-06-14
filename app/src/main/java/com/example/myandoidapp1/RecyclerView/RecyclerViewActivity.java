package com.example.myandoidapp1.RecyclerView;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.myandoidapp1.R;
import com.example.myandoidapp1.RecyclerView.Model.Contact;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {
    private static ArrayList<Contact> contacts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        contacts = Contact.createContactsList(100);
        ContactsAdapter contactsAdapter = new ContactsAdapter(contacts);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}