package easy.tuto.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        setTitle("News Activity");
        Button b1 = findViewById(R.id.button2);
        Button b2 = findViewById(R.id.button3);
        Intent intent = new Intent(this, DetailsActivity.class);
        Intent intent1 = new Intent(this, MainActivity.class);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent1);
            }
        });

    }
    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }

}