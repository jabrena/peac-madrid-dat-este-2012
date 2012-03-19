package peac.android.na;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class NumeroAleatorioActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seleccionidiomas);
        
              

        ImageButton bt1 = (ImageButton)findViewById(R.id.botonidiomaesp);
        bt1.setOnClickListener(new OnClickListener() {
    
                public void onClick(View v) {
                        Intent intencion = new Intent(NumeroAleatorioActivity.this, page2.class);
                        startActivity(intencion);
                }  
        });      
       
        ImageButton bt2 = (ImageButton)findViewById(R.id.botonidiomaing);
        bt2.setOnClickListener(new OnClickListener() {
    
                public void onClick(View v) {
                        Intent intencion = new Intent(NumeroAleatorioActivity.this, page3.class);
                        startActivity(intencion);
                }                  
        });

    
    }
}