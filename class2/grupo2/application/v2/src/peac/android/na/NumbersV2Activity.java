package peac.android.na;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class NumbersV2Activity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_v2);

	    //Boton 1
	    Button bt1 = (Button)findViewById(R.id.button1);
	    bt1.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View v) {
				Toast.makeText(NumbersV2Activity.this, "Instrucciones", Toast.LENGTH_SHORT).show();
				Intent intencion = new Intent(NumbersV2Activity.this, page2.class);
				startActivity(intencion);
			}
	    });
        
      //Boton 2
      Button bt2 = (Button)findViewById(R.id.button2);
      bt2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Toast.makeText(NumbersV2Activity.this, "Jugar", Toast.LENGTH_SHORT).show();
			}
      });
    }
    
}