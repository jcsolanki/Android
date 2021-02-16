package com.form;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    TextView display;
    Button submit;
    EditText name,email,phone,password,numeric_password,age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display= findViewById(R.id.display);
        submit = findViewById(R.id.submit);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        password = findViewById(R.id.password);
        numeric_password = findViewById(R.id.numeric_password);
        age = findViewById(R.id.age);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(" Name: "+name.getText()+"\n Email: "+email.getText()+"\n Phone: "+phone.getText()+"\n Password: "+password.getText()+"\n Numeric Password: "+numeric_password.getText()+"\n Age: "+age.getText());
                Toast.makeText(getApplicationContext(),"Name: "+name.getText()+"\n Email: "+email.getText()+"\n Phone: "+phone.getText()+"\nPassword: "+password.getText()+"\n Numeric Password: "+numeric_password.getText()+"\nAge: "+age.getText(), Toast.LENGTH_LONG).show();;
            }
        });
    }
}