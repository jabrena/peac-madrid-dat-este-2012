package jab.android.intents;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class IntentsActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        //Programación de boton
        
        Button btnLanzar = (Button)findViewById(R.id.button1);
        btnLanzar.setOnClickListener(new OnClickListener() {


			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				/*
				 *Navegar por un sitio Web
				 *  */
				startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.google.com/")));
				
				
				/*
				 *  Operar los contactos de mi directorio
				startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("content://contacts/people/")));
				*/
				
				/* 
				 * Iniciar una llamada telefonica
				startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("tel:34247")));
				*/
				
				/*
				 *  Realizar un busqueda en Google 
				Intent intent= new Intent(Intent.ACTION_WEB_SEARCH );
				intent.putExtra(SearchManager.QUERY, "PEAC Madrid");
				startActivity(intent);
				*/
				
				/*
				 *  Lanzamiento de un comando de voz
				startActivity(new Intent(Intent.ACTION_VOICE_COMMAND));
				*/
				
			}
		});
        
        Button btnLanzar2 = (Button)findViewById(R.id.button2);
        btnLanzar2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Toast.makeText(IntentsActivity.this, "Ir a la pagina2", Toast.LENGTH_SHORT).show();
				Intent intencion = new Intent(IntentsActivity.this, page2.class);
				startActivity(intencion);
			}
        });
    }
}