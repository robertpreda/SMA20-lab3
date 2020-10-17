    package intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lifecycles.R;

    public class MainIntentActivity extends AppCompatActivity {


        private Button bHttp, bTelView, bHttps, bTelLaunch;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main_intent);

            bHttp = findViewById(R.id.httpView);
            bTelView = findViewById(R.id.telView);
            bHttps = findViewById(R.id.httpsLaunch);
            bTelLaunch = findViewById(R.id.telLaunch);


        }

        public void clicked(View view){
            switch(view.getId()){
                case R.id.httpView:
                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                    startActivity(i);
                    break;
                case R.id.telView:
                    Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:00401213456"));
                    startActivity(i2);
                    break;
                case R.id.httpsLaunch:
                    Intent i3 = new Intent(MSA.LAUNCH, Uri.parse("https://www.gooogle.com"));
                    startActivity(i3);
                    break;
                case R.id.telLaunch:
                    Intent i4 = new Intent(MSA.LAUNCH, Uri.parse("tel:00401213456"));
                    startActivity(i4);
                    break;
            }
        }




}