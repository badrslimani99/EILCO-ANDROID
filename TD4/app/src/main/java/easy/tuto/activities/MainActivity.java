package easy.tuto.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int counter = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Page de connexion");
        EditText username = findViewById(R.id.usrn);
        EditText password =  findViewById(R.id.mdp);
        Button b1 = findViewById(R.id.button);
        TextView txt1 = findViewById(R.id.txt1);
        txt1.setVisibility(View.GONE);
        Intent intent = new Intent(this, NewsActivity.class);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(),"Redirecting...",Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(), "Le nom de l'utilisateur ou le mot de passe est incorrecte",Toast.LENGTH_SHORT).show();
                    txt1.setVisibility(View.VISIBLE);
                    counter--;
                    txt1.setText(Integer.toString(counter));

                    if (counter == 0) {
                        b1.setEnabled(false);
                    }
                }

            }
        });

    }
}