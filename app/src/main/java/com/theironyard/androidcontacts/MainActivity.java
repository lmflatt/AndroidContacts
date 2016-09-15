package com.theironyard.androidcontacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
//import com.theironyard.todoandroid.R;


public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemLongClickListener {
    ListView list;
    EditText nameText;
    EditText phoneText;
    Button addBtn;
    ArrayAdapter<Contact> contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.listView);
        nameText = (EditText) findViewById(R.id.editText);
        phoneText = (EditText) findViewById(R.id.editText2);
        addBtn = (Button) findViewById(R.id.button);

        contacts = new ArrayAdapter<Contact>(this, android.R.layout.simple_list_item_1);
        list.setAdapter(contacts);

        addBtn.setOnClickListener(this);
        list.setOnItemLongClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Contact contact = new Contact(nameText.getText().toString(), phoneText.getText().toString());
        contacts.add(contact);
        phoneText.setText("");
        nameText.setText("");
        nameText.requestFocus();
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        Contact contact = contacts.getItem(position);
        contacts.remove(contact);
        return true;
    }
}
