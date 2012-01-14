package peac.android.na;

import android.app.Activity;
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
        setContentView(R.layout.main);
        
        //Boton
      Button btnLanzar2 = (Button)findViewById(R.id.button);
      btnLanzar2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Toast.makeText(NumbersV2Activity.this, "Ir a la pagina2", Toast.LENGTH_SHORT).show();
			}
      });
    }
    
}